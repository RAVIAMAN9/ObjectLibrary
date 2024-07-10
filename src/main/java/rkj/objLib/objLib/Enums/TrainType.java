package rkj.objLib.objLib.Enums;

public enum TrainType {
    PASSENGER("PASSENGER"),
    EXPRESS("EXPRESS"),
    SHATABDI_EXPRESS("EXPRESS"),
    VANDE_BHARAT_EXPRESS("VANDE_BHARAT_EXPRESS"),
    RAJDHANI_EXPRESS("RAJDHANI EXPRESS");

    private final String value;
    TrainType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
