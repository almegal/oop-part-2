public class Bicycle extends Vehicle {

    Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        startService();
        changeTyre();
    }
}