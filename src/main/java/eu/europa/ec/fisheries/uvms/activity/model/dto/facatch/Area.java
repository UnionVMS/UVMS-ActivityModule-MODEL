package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

/**
 * Created by sanera on 27/01/2017.
 */
public class Area {

    private String territory;
    private String faoArea;
    private String icesStatRectangle;
    private String effortZone;
    private String rfmo;
    private String gfcmGsa;
    private String gfcmStatRectangle;

    public Area(){

    }

    public Area(String territory, String faoArea, String icesStatRectangle, String effortZone, String rfmo, String gfcmGsa, String gfcmStatRectangle) {
        this.territory = territory;
        this.faoArea = faoArea;
        this.icesStatRectangle = icesStatRectangle;
        this.effortZone = effortZone;
        this.rfmo = rfmo;
        this.gfcmGsa = gfcmGsa;
        this.gfcmStatRectangle = gfcmStatRectangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Area)) return false;

        Area area = (Area) o;

        if (getTerritory() != null ? !getTerritory().equals(area.getTerritory()) : area.getTerritory() != null)
            return false;
        if (getFaoArea() != null ? !getFaoArea().equals(area.getFaoArea()) : area.getFaoArea() != null) return false;
        if (getIcesStatRectangle() != null ? !getIcesStatRectangle().equals(area.getIcesStatRectangle()) : area.getIcesStatRectangle() != null)
            return false;
        if (getEffortZone() != null ? !getEffortZone().equals(area.getEffortZone()) : area.getEffortZone() != null)
            return false;
        if (getRfmo() != null ? !getRfmo().equals(area.getRfmo()) : area.getRfmo() != null) return false;
        if (getGfcmGsa() != null ? !getGfcmGsa().equals(area.getGfcmGsa()) : area.getGfcmGsa() != null) return false;
        return getGfcmStatRectangle() != null ? getGfcmStatRectangle().equals(area.getGfcmStatRectangle()) : area.getGfcmStatRectangle() == null;

    }

    @Override
    public int hashCode() {
        int result = getTerritory() != null ? getTerritory().hashCode() : 0;
        result = 31 * result + (getFaoArea() != null ? getFaoArea().hashCode() : 0);
        result = 31 * result + (getIcesStatRectangle() != null ? getIcesStatRectangle().hashCode() : 0);
        result = 31 * result + (getEffortZone() != null ? getEffortZone().hashCode() : 0);
        result = 31 * result + (getRfmo() != null ? getRfmo().hashCode() : 0);
        result = 31 * result + (getGfcmGsa() != null ? getGfcmGsa().hashCode() : 0);
        result = 31 * result + (getGfcmStatRectangle() != null ? getGfcmStatRectangle().hashCode() : 0);
        return result;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    public String getFaoArea() {
        return faoArea;
    }

    public void setFaoArea(String faoArea) {
        this.faoArea = faoArea;
    }

    public String getIcesStatRectangle() {
        return icesStatRectangle;
    }

    public void setIcesStatRectangle(String icesStatRectangle) {
        this.icesStatRectangle = icesStatRectangle;
    }

    public String getEffortZone() {
        return effortZone;
    }

    public void setEffortZone(String effortZone) {
        this.effortZone = effortZone;
    }

    public String getRfmo() {
        return rfmo;
    }

    public void setRfmo(String rfmo) {
        this.rfmo = rfmo;
    }

    public String getGfcmGsa() {
        return gfcmGsa;
    }

    public void setGfcmGsa(String gfcmGsa) {
        this.gfcmGsa = gfcmGsa;
    }

    public String getGfcmStatRectangle() {
        return gfcmStatRectangle;
    }

    public void setGfcmStatRectangle(String gfcmStatRectangle) {
        this.gfcmStatRectangle = gfcmStatRectangle;
    }
}
