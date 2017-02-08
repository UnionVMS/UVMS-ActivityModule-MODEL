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

    public FACatchSummaryDTO(){

    }

    public FACatchSummaryDTO(Date date, Area area, String flagState, String gearType, String presentation) {
        this.date = date;
        this.area = area;
        this.flagState = flagState;
        this.gearType = gearType;
        this.presentation = presentation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FACatchSummaryDTO)) return false;

        FACatchSummaryDTO that = (FACatchSummaryDTO) o;

        if (getDate() != null ? !getDate().equals(that.getDate()) : that.getDate() != null) return false;
        if (getArea() != null ? !getArea().equals(that.getArea()) : that.getArea() != null) return false;
        if (getFlagState() != null ? !getFlagState().equals(that.getFlagState()) : that.getFlagState() != null)
            return false;
        if (getGearType() != null ? !getGearType().equals(that.getGearType()) : that.getGearType() != null)
            return false;
        return getPresentation() != null ? getPresentation().equals(that.getPresentation()) : that.getPresentation() == null;

    }

    @Override
    public int hashCode() {
        int result = getDate() != null ? getDate().hashCode() : 0;
        result = 31 * result + (getArea() != null ? getArea().hashCode() : 0);
        result = 31 * result + (getFlagState() != null ? getFlagState().hashCode() : 0);
        result = 31 * result + (getGearType() != null ? getGearType().hashCode() : 0);
        result = 31 * result + (getPresentation() != null ? getPresentation().hashCode() : 0);
        return result;
    }

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


    @Override
    public String toString() {
        return "FACatchSummaryDTO{" +
                "date=" + date +
                ", area=" + area +
                ", flagState='" + flagState + '\'' +
                ", gearType='" + gearType + '\'' +
                ", presentation='" + presentation + '\'' +
                '}';
    }
}
