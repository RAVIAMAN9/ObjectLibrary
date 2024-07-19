package rkj.objLib.objLib.ServiceObjects.TrainServiceObject.Dto;

public class TrainResponse extends Train{

    private Integer Ac3Tier;

    private Integer Ac2Tier;

    private Integer Ac1Tier;
    private Integer sleeper;

    private Integer chairCar;

    public Integer getAc3Tier() {
        return Ac3Tier;
    }

    public void setAc3Tier(Integer ac3Tier) {
        Ac3Tier = ac3Tier;
    }

    public Integer getAc2Tier() {
        return Ac2Tier;
    }

    public void setAc2Tier(Integer ac2Tier) {
        Ac2Tier = ac2Tier;
    }

    public Integer getAc1Tier() {
        return Ac1Tier;
    }

    public void setAc1Tier(Integer ac1Tier) {
        Ac1Tier = ac1Tier;
    }

    public Integer getSleeper() {
        return sleeper;
    }

    public void setSleeper(Integer sleeper) {
        this.sleeper = sleeper;
    }

    public Integer getChairCar() {
        return chairCar;
    }

    public void setChairCar(Integer chairCar) {
        this.chairCar = chairCar;
    }

    @Override
    public String toString() {
        return "TrainResponse{" +
                "Ac3Tier=" + Ac3Tier +
                ", Ac2Tier=" + Ac2Tier +
                ", Ac1Tier=" + Ac1Tier +
                ", sleeper=" + sleeper +
                ", chairCar=" + chairCar +
                '}';
    }
}
