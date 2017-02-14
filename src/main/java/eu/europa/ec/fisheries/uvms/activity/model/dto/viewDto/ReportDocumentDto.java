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
public class ReportDocumentDto {

    @JsonView(FishingActivityView.CommonView.class)
    private String type;

    @JsonView(FishingActivityView.CommonView.class)
    private String dateAccepted;

    @JsonView(FishingActivityView.CommonView.class)
    private String id;

    @JsonView(FishingActivityView.CommonView.class)
    private String refId;

    @JsonView(FishingActivityView.CommonView.class)
    private String creationDate;

    @JsonView(FishingActivityView.CommonView.class)
    private String purposeCode;

    @JsonView(FishingActivityView.CommonView.class)
    private String purpose;


    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getDateAccepted() {
        return dateAccepted;
    }
    public void setDateAccepted(String dateAccepted) {
        this.dateAccepted = dateAccepted;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getRefId() {
        return refId;
    }
    public void setRefId(String refId) {
        this.refId = refId;
    }
    public String getCreationDate() {
        return creationDate;
    }
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
    public String getPurposeCode() {
        return purposeCode;
    }
    public void setPurposeCode(String purposeCode) {
        this.purposeCode = purposeCode;
    }
    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
