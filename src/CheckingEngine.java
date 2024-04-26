public interface CheckingEngine {

    default void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
