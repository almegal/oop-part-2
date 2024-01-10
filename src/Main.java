public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);


        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);


        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();

        Vehicle[] carQueue = new Vehicle[]{
                car,
                car2,
                truck,
                truck2,
                bicycle,
                bicycle2
        };
        for (Vehicle vehicle : carQueue) {
           if(vehicle instanceof Car) {
               station.check((Car) vehicle);
           } else if(vehicle instanceof Truck) {
               station.check((Truck) vehicle);
           } else if(vehicle instanceof Bicycle) {
               station.check((Bicycle) vehicle);
           }
        }
    }
}