public class Truck extends Car {

    Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void check(){
        startService();
        changeTyre();
        checkEngine();
        checkTrailer();
    }
}