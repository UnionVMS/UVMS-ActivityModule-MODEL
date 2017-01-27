package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import java.util.Date;

/**
 * Created by sanera on 27/01/2017.
 */
public class FACatchSummaryDTO {

    private Date date;
    private Area area;
    private String flagState;
    private String gearType;
    private String presentation;
    private SummaryTable summaryTable;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getFlagState() {
        return flagState;
    }

    public void setFlagState(String flagState) {
        this.flagState = flagState;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    public String getGearType() {
        return gearType;
    }

    public void setGearType(String gearType) {
        this.gearType = gearType;
    }

    public SummaryTable getSummaryTable() {
        return summaryTable;
    }

    public void setSummaryTable(SummaryTable summaryTable) {
        this.summaryTable = summaryTable;
    }
}
