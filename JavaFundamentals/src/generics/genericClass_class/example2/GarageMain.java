package generics.genericClass_class.example2;

public class GarageMain {

    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        //CarGarade carGarade = new CarGarade(car);
       // MotorcycleGarage motorcycleGarage = new MotorcycleGarage(motorcycle);

        //carGarade.repairCar();
        //motorcycleGarage.repairMotorcycle();

        Garage<Car> carGarage = new Garage<>(car);
        Garage<Motorcycle> motorcycleGarage = new Garage<>(motorcycle);

        carGarage.repairVehicle();
        motorcycleGarage.repairVehicle();

    }

}
