package rkj.objLib.objLib.Enums;

public enum TrainType {
    PASSENGER("PASSENGER"),
    EXPRESS("EXPRESS"),
    SHATABDI_EXPRESS("SHATABDI_EXPRESS"),
    VANDE_BHARAT_EXPRESS("VANDE_BHARAT_EXPRESS"),
    RAJDHANI_EXPRESS("RAJDHANI_EXPRESS");

    private final String value;
    TrainType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
