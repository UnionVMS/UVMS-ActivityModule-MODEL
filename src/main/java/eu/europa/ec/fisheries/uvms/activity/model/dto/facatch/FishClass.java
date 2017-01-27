package eu.europa.ec.fisheries.uvms.activity.model.dto.facatch;

import java.util.Map;

/**
 * Created by sanera on 27/01/2017.
 */
public class FishClass {
    private String className;
    private Map<String,Integer> speciesCount;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Map<String, Integer> getSpeciesCount() {
        return speciesCount;
    }

    public void setSpeciesCount(Map<String, Integer> speciesCount) {
        this.speciesCount = speciesCount;
    }
}
