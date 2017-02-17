package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import eu.europa.ec.fisheries.uvms.activity.model.schemas.FishSizeClassEnum;
import eu.europa.ec.fisheries.uvms.activity.model.schemas.FaCatchTypeEnum;

import java.util.Map;

/**
 * Created by sanera on 27/01/2017.
 */
public class SummaryTableDTO {

  // private Map<FishSizeClassEnum,Map<String,Long>> summaryFishSize;
   // private Map<FaCatchTypeEnum,Map<String,Long>> summaryFaCatchType;

    private Map<FishSizeClassEnum,Object> summaryFishSize;
     private Map<FaCatchTypeEnum,Object> summaryFaCatchType;

    public Map<FishSizeClassEnum, Object> getSummaryFishSize() {
        return summaryFishSize;
    }

    public void setSummaryFishSize(Map<FishSizeClassEnum, Object> summaryFishSize) {
        this.summaryFishSize = summaryFishSize;
    }

    public Map<FaCatchTypeEnum, Object> getSummaryFaCatchType() {
        return summaryFaCatchType;
    }

    public void setSummaryFaCatchType(Map<FaCatchTypeEnum, Object> summaryFaCatchType) {
        this.summaryFaCatchType = summaryFaCatchType;
    }

    @Override
    public String toString() {
        return "SummaryTable{" +
                "summaryFishSize=" + summaryFishSize +
                ", summaryFaCatchType=" + summaryFaCatchType +
                '}';
    }
}
