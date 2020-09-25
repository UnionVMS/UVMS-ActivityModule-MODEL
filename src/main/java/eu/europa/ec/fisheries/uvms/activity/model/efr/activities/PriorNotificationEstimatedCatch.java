package eu.europa.ec.fisheries.uvms.activity.model.efr.activities;

public class PriorNotificationEstimatedCatch {

    private String code;
    private Integer quantity;
    private Double weightInKilos;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(Double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }
}
