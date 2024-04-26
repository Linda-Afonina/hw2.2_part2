public abstract class Transport implements UpdatingTyre, CheckingTrailer, CheckingEngine{
    protected final String modelName;
    protected final int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return this.wheelsCount;
    }

    @Override
    public abstract String toString();

}
