/*
 *
 * Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.
 *
 * This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package eu.europa.ec.fisheries.uvms.activity.model.mapper;

import eu.europa.ec.fisheries.uvms.activity.model.exception.ActivityModelMapperException;
import eu.europa.ec.fisheries.uvms.activity.model.exception.ActivityModelMarshallException;
import eu.europa.ec.fisheries.uvms.activity.model.exception.ActivityModelValidationException;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityFault;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FACatchSummaryReportResponse;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FishingTripResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jms.JMSException;
import javax.jms.TextMessage;

public final class ActivityModuleResponseMapper {

    final static Logger LOG = LoggerFactory.getLogger(ActivityModuleResponseMapper.class);

    private ActivityModuleResponseMapper() {
    }

    private static void validateResponse(TextMessage response, String correlationId) throws ActivityModelValidationException {

        try {
            if (response == null) {
                throw new ActivityModelValidationException("Error when validating response in ResponseMapper: Response is Null");
            }

            if (response.getJMSCorrelationID() == null) {
                throw new ActivityModelValidationException("No correlationId in response (Null) . Expected was: " + correlationId);
            }

            if (!correlationId.equalsIgnoreCase(response.getJMSCorrelationID())) {
                throw new ActivityModelValidationException("Wrong correlationId in response. Expected was: " + correlationId + " But actual was: " + response.getJMSCorrelationID());
            }

            //the following code is catching the exception in purpose. DO NOT MODIFY it!
            try{
                ActivityFault fault = JAXBMarshaller.unmarshallTextMessage(response, ActivityFault.class);
                throw new ActivityModelValidationException(fault.getCode() + " : " + fault.getFault());
            } catch (ActivityModelMarshallException e) {
                LOG.info("Expected Exception"); // Exception received in case if the validation is success
            }

        } catch (JMSException e) {
            LOG.error("JMS exception during validation ", e);
            throw new ActivityModelValidationException("JMS exception during validation " + e.getMessage());
        }
    }

    public static ActivityFault createFaultMessage(FaultCode code, String message) {
        ActivityFault fault = new ActivityFault();
        fault.setCode(code.getCode());
        fault.setFault(message);
        return fault;
    }

    public static FishingTripResponse mapToActivityFishingTripFromResponse(TextMessage response, String correlationId) throws ActivityModelMapperException {
        validateResponse(response, correlationId);
        FishingTripResponse fishingTripResponse = JAXBMarshaller.unmarshallTextMessage(response, FishingTripResponse.class);
        return fishingTripResponse;
    }

    public static FACatchSummaryReportResponse mapToFaCatchSummaryResponseFromResponse(TextMessage response, String correlationId) throws ActivityModelMapperException {
        validateResponse(response, correlationId);
        FACatchSummaryReportResponse summaryReportResponse = JAXBMarshaller.unmarshallTextMessage(response, FACatchSummaryReportResponse.class);
        return summaryReportResponse;
    }
}
