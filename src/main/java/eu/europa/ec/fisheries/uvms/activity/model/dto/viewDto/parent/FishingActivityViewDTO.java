/*
Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.

*/
package eu.europa.ec.fisheries.uvms.activity.model.dto.viewDto.parent;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import eu.europa.ec.fisheries.uvms.activity.model.dto.viewDto.*;

import java.util.List;

/**
 * Created by kovian on 07/02/2017.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FishingActivityViewDTO {

    @JsonView(FishingActivityView.Arrival.class)
    private List<PortDto> ports;

    @JsonView(FishingActivityView.Arrival.class)
    private ArrivalDto arrival;

    @JsonView(FishingActivityView.Arrival.class)
    private List<GearDto> gears;

    @JsonView(FishingActivityView.Arrival.class)
    private ReportDocumentDto reportDoc;


    public List<PortDto> getPorts() {
        return ports;
    }
    public void setPorts(List<PortDto> ports) {
        this.ports = ports;
    }
    public ArrivalDto getArrival() {
        return arrival;
    }
    public void setArrival(ArrivalDto arrival) {
        this.arrival = arrival;
    }
    public List<GearDto> getGears() {
        return gears;
    }
    public void setGears(List<GearDto> gears) {
        this.gears = gears;
    }
    public ReportDocumentDto getReportDoc() {
        return reportDoc;
    }
    public void setReportDoc(ReportDocumentDto reportDoc) {
        this.reportDoc = reportDoc;
    }

}
