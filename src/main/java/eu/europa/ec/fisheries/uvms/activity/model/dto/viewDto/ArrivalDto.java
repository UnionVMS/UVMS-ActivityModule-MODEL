/*
Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.

*/
package eu.europa.ec.fisheries.uvms.activity.model.dto.viewDto;

import com.fasterxml.jackson.annotation.JsonView;
import eu.europa.ec.fisheries.uvms.activity.model.dto.viewDto.parent.FishingActivityView;

/**
 * Created by kovian on 09/02/2017.
 */
public class ArrivalDto {

    @JsonView(FishingActivityView.CommonView.class)
    private String arrivalTime;

    @JsonView(FishingActivityView.CommonView.class)
    private String reason;

    @JsonView(FishingActivityView.CommonView.class)
    private String intendedLandingTime;


    public String getArrivalTime() {
        return arrivalTime;
    }
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getIntendedLandingTime() {
        return intendedLandingTime;
    }
    public void setIntendedLandingTime(String intendedLandingTime) {
        this.intendedLandingTime = intendedLandingTime;
    }
}