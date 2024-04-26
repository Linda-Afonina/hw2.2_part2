public class Car extends Transport implements UpdatingTyre, CheckingEngine{

    public Car(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public String toString() {
        return "Модель автомобиля: " + modelName + ", количество колес: " + wheelsCount + '.';
    }
}
