package ooplab7;

public class SuperCar {
    private String carBrand;
    private String engSize;
    public SuperCar(){}
    public SuperCar(String c, String e){
        this.carBrand = c;
        this.engSize =e;
    }
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }

    public void getSuperCarInfo(){
        System.out.println("Super car brand: "+this.carBrand);
        System.out.println("Engine Size: "+this.engSize);
    }
}
