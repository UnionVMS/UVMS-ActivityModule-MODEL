package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import java.util.Map;

/**
 * Created by sanera on 27/01/2017.
 */
public class FACatchTypeSummary {

    private String typeName;
    private Map<String,Integer> speciesCount;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Map<String, Integer> getSpeciesCount() {
        return speciesCount;
    }

    public void setSpeciesCount(Map<String, Integer> speciesCount) {
        this.speciesCount = speciesCount;
    }
}
