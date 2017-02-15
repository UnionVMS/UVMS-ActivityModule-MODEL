package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import java.util.Date;

/**
 * Created by sanera on 27/01/2017.
 */
public class FACatchSummaryDTO {

    private Date date;
    private int day;
    private String month;
    private int year;
    private Area area;
    private String flagState;
    private String gearType;
    private String presentation;
    private String vesselTransportGuid;
    private SummaryTableDTO summaryTable;

    public FACatchSummaryDTO(){

    }

    public FACatchSummaryDTO(Date date, Area area, String flagState, String gearType, String presentation) {
        this.date = date;
        this.area = area;
        this.flagState = flagState;
        this.gearType = gearType;
        this.presentation = presentation;
    }


    public String getVesselTransportGuid() {
        return vesselTransportGuid;
    }

    public void setVesselTransportGuid(String vesselTransportGuid) {
        this.vesselTransportGuid = vesselTransportGuid;
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

    public SummaryTableDTO getSummaryTable() {
        return summaryTable;
    }

    public void setSummaryTable(SummaryTableDTO summaryTable) {
        this.summaryTable = summaryTable;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    /*@Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FACatchSummaryDTO)) return false;

        FACatchSummaryDTO that = (FACatchSummaryDTO) o;

        if (getDay() != that.getDay()) return false;
        if (getYear() != that.getYear()) return false;
        if (getMonth() != null ? !getMonth().equals(that.getMonth()) : that.getMonth() != null) return false;
        if (getArea() != null ? !getArea().equals(that.getArea()) : that.getArea() != null) return false;
        if (getFlagState() != null ? !getFlagState().equals(that.getFlagState()) : that.getFlagState() != null)
            return false;
        if (getGearType() != null ? !getGearType().equals(that.getGearType()) : that.getGearType() != null)
            return false;
        if (getPresentation() != null ? !getPresentation().equals(that.getPresentation()) : that.getPresentation() != null)
            return false;
        return getVesselTransportGuid() != null ? getVesselTransportGuid().equals(that.getVesselTransportGuid()) : that.getVesselTransportGuid() == null;

    }

    @Override
    public int hashCode() {
        int result = getDay();
        result = 31 * result + (getMonth() != null ? getMonth().hashCode() : 0);
        result = 31 * result + getYear();
        result = 31 * result + (getArea() != null ? getArea().hashCode() : 0);
        result = 31 * result + (getFlagState() != null ? getFlagState().hashCode() : 0);
        result = 31 * result + (getGearType() != null ? getGearType().hashCode() : 0);
        result = 31 * result + (getPresentation() != null ? getPresentation().hashCode() : 0);
        result = 31 * result + (getVesselTransportGuid() != null ? getVesselTransportGuid().hashCode() : 0);
        return result;
    }*/

    @Override
    public String toString() {
        return "FACatchSummaryDTO{" +
                "day=" + day +
                ", month='" + month + '\'' +
                ", year=" + year +
                ", area=" + area +
                ", flagState='" + flagState + '\'' +
                ", gearType='" + gearType + '\'' +
                ", presentation='" + presentation + '\'' +
                ", vesselTransportGuid='" + vesselTransportGuid + '\'' +
                '}';
    }
}
