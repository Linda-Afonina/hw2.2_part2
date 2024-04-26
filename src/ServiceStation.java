public class ServiceStation {

    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем " + transport.modelName);
            for (int i = 0; i < transport.wheelsCount; i++) {
                transport.updateTyre();
            }
        }
    }

}
