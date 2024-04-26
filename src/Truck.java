public class Truck extends Transport implements UpdatingTyre, CheckingEngine, CheckingTrailer {

    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public String toString() {
        return "Модель грузовика: " + modelName + ", количество колес: " + wheelsCount + '.';
    }
}
