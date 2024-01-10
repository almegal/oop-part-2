public class ServiceStation implements Checkable {
    @Override
    public void check(Car car) {
        if (car != null) {
            startService(car);
            changeTyre(car);
            car.checkEngine();
        }
    }

    @Override
    public void check(Truck truck) {
        if (truck != null) {
            startService(truck);
            changeTyre(truck);
            truck.checkEngine();
            truck.checkTrailer();
        }
    }

    @Override
    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            startService(bicycle);
            changeTyre(bicycle);
        }
    }

    private void startService(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
    }
    private void changeTyre(Vehicle vehicle){
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }
    }
}