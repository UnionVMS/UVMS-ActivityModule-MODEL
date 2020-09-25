package eu.europa.ec.fisheries.uvms.activity.model.efr.activities;

import java.util.UUID;

// note: Not abstract, because we deserialize JSON to this class to read the activityType enum
public class BaseEfrActivity {

    private UUID activityMessageId;

    private EfrActivityType activityType;

    private UUID fishingReportId;

    public UUID getActivityMessageId() {
        return activityMessageId;
    }

    public void setActivityMessageId(UUID activityMessageId) {
        this.activityMessageId = activityMessageId;
    }

    public EfrActivityType getActivityType() {
        return activityType;
    }

    public void setActivityType(EfrActivityType activityType) {
        this.activityType = activityType;
    }

    public UUID getFishingReportId() {
        return fishingReportId;
    }

    public void setFishingReportId(UUID fishingReportId) {
        this.fishingReportId = fishingReportId;
    }
}
