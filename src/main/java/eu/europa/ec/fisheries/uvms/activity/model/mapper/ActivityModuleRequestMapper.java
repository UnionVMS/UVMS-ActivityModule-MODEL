/*
Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it 
and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of 
the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more 
details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.

 */


package eu.europa.ec.fisheries.uvms.activity.model.mapper;

import eu.europa.ec.fisheries.uvms.activity.model.exception.ActivityModelMarshallException;

import eu.europa.ec.fisheries.uvms.activity.model.schemas.ActivityModuleMethod;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FACatchSummaryReportRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FishingTripRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.GroupCriteria;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.ListValueTypeFilter;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.PluginType;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.SetFLUXFAReportMessageRequest;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.SingleValueTypeFilter;
import java.util.List;

/**
 * Created by sanera on 06/06/2016.
 */
public final class ActivityModuleRequestMapper {

    private ActivityModuleRequestMapper(){

    }

    public static String mapToSetFLUXFAReportMessageRequest(String fluxFAReportMessage, String username, String pluginType) throws ActivityModelMarshallException {
        SetFLUXFAReportMessageRequest request = new SetFLUXFAReportMessageRequest();
        request.setMethod(ActivityModuleMethod.GET_FLUX_FA_REPORT);
        request.setPluginType(PluginType.fromValue(pluginType));
        request.setRequest(fluxFAReportMessage);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToActivityGetFishingTripRequest(List<ListValueTypeFilter> listFilter, List<SingleValueTypeFilter> singleFilters) throws ActivityModelMarshallException {
        FishingTripRequest request = new FishingTripRequest();
        request.setMethod(ActivityModuleMethod.GET_FISHING_TRIPS);
        request.setListValueFilters(listFilter);
        request.setSingleValueFilters(singleFilters);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }

    public static String mapToFaCatchSummaryReportRequestRequest(List<ListValueTypeFilter> listFilter, List<SingleValueTypeFilter> singleFilters, List<GroupCriteria> groupCriterias) throws ActivityModelMarshallException {
        FACatchSummaryReportRequest request = new FACatchSummaryReportRequest();
        request.setMethod(ActivityModuleMethod.GET_FA_CATCH_SUMMARY_REPORT);
        request.setListValueFilters(listFilter);
        request.setSingleValueFilters(singleFilters);
        request.setGroupCriterias(groupCriterias);
        return JAXBMarshaller.marshallJaxBObjectToString(request);
    }
}