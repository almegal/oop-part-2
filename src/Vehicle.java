public abstract class Vehicle implements Checkable {
    final private String modelName;
    final private int wheelsCount;

    Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void startService() {
        System.out.println("Обслуживаем " + getModelName());
    }

    public void changeTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }

    //getters
    public String getModelName() {
        return modelName;
    }
    public int getWheelsCount() {
        return wheelsCount;
    }
}
