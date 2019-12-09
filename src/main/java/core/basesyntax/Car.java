package core.basesyntax;

public class Car implements Cloneable {
    private String type;
    private String model;
    private int maxSpeed;
    private boolean isFaster;
    private Engine engine;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean isFaster() {
        return isFaster;
    }

    public void setFaster(boolean faster) {
        isFaster = faster;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        Car car = new Car();
        car.type = this.type;
        car.model = this.model;
        car.maxSpeed = this.maxSpeed;
        car.isFaster = this.isFaster;
        car.engine = this.engine;
        return car;
    }
}
