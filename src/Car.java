public class Car {
    private String carMark;
    private String carModel;
    private double motorVolume;
    private double tankCapacity;
    private double fuelConsumption;

    public Car(String carMark, String carModel, double motorVolume) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.motorVolume = motorVolume;
    }

    public Car(String carMark, String carModel, double motorVolume, double tankCapacity, double fuelConsumption) {
        this.carMark = carMark;
        this.carModel = carModel;
        this.motorVolume = motorVolume;
        this.tankCapacity = tankCapacity;
        this.fuelConsumption = fuelConsumption;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getMotorVolume() {
        return motorVolume;
    }

    public void setMotorVolume(double motorVolume) {
        this.motorVolume = motorVolume;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
