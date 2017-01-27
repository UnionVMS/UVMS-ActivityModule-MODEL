package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

/**
 * Created by sanera on 27/01/2017.
 */
public class SummaryTable {

   private FishClass lsc;
    private FishClass bms;
    private FACatchTypeSummary dis;
    private FACatchTypeSummary dim;

    public FishClass getLsc() {
        return lsc;
    }

    public void setLsc(FishClass lsc) {
        this.lsc = lsc;
    }

    public FishClass getBms() {
        return bms;
    }

    public void setBms(FishClass bms) {
        this.bms = bms;
    }

    public FACatchTypeSummary getDis() {
        return dis;
    }

    public void setDis(FACatchTypeSummary dis) {
        this.dis = dis;
    }

    public FACatchTypeSummary getDim() {
        return dim;
    }

    public void setDim(FACatchTypeSummary dim) {
        this.dim = dim;
    }
}
