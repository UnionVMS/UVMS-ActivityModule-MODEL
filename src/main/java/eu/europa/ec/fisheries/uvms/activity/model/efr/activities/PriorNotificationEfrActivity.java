package eu.europa.ec.fisheries.uvms.activity.model.efr.activities;

import java.time.Instant;
import java.util.List;

public class PriorNotificationEfrActivity extends BaseEfrActivity {

    private Instant estimatedLandingTime;

    private String portCode;
    private String userSpecifiedLocationName;
    private String userSpecifiedLocationLatitude;
    private String userSpecifiedLocationLongitude;

    private List<PriorNotificationEstimatedCatch> estimatedCatches;

    public PriorNotificationEfrActivity() {
        setActivityType(EfrActivityType.PRIOR_NOTIFICATION);
    }

    public Instant getEstimatedLandingTime() {
        return estimatedLandingTime;
    }

    public void setEstimatedLandingTime(Instant estimatedLandingTime) {
        this.estimatedLandingTime = estimatedLandingTime;
    }

    public String getPortCode() {
        return portCode;
    }

    public void setPortCode(String portCode) {
        this.portCode = portCode;
    }

    public String getUserSpecifiedLocationName() {
        return userSpecifiedLocationName;
    }

    public void setUserSpecifiedLocationName(String userSpecifiedLocationName) {
        this.userSpecifiedLocationName = userSpecifiedLocationName;
    }

    public String getUserSpecifiedLocationLatitude() {
        return userSpecifiedLocationLatitude;
    }

    public void setUserSpecifiedLocationLatitude(String userSpecifiedLocationLatitude) {
        this.userSpecifiedLocationLatitude = userSpecifiedLocationLatitude;
    }

    public String getUserSpecifiedLocationLongitude() {
        return userSpecifiedLocationLongitude;
    }

    public void setUserSpecifiedLocationLongitude(String userSpecifiedLocationLongitude) {
        this.userSpecifiedLocationLongitude = userSpecifiedLocationLongitude;
    }

    public List<PriorNotificationEstimatedCatch> getEstimatedCatches() {
        return estimatedCatches;
    }

    public void setEstimatedCatches(List<PriorNotificationEstimatedCatch> estimatedCatches) {
        this.estimatedCatches = estimatedCatches;
    }
}
