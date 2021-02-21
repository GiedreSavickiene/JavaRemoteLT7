package generics.genericClass_class.example2;

public class CarGarade {

    private Car car;

    public CarGarade (Car car) {
        this.car = car;
    }

    public void repairCar(){
        car.repair();
    }
}
