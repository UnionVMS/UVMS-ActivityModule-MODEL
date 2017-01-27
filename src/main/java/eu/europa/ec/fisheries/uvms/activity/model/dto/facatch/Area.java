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
