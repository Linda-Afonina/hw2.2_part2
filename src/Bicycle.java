public class Bicycle extends Transport implements UpdatingTyre {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Модель велосипеда: " + modelName + ", количество колес: " + wheelsCount + '.';
    }
}
