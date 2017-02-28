package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

/**
 * Created by sanera on 28/02/2017.
 */
public class FACatchDetailsDTO {

    private FACatchSummaryDTO catches;
    private FACatchSummaryDTO landing;

    public FACatchSummaryDTO getCatches() {
        return catches;
    }

    public void setCatches(FACatchSummaryDTO catches) {
        this.catches = catches;
    }

    public FACatchSummaryDTO getLanding() {
        return landing;
    }

    public void setLanding(FACatchSummaryDTO landing) {
        this.landing = landing;
    }
}
