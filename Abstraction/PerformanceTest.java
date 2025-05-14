interface Engine {
    void start();
}

abstract class Vehicle {
    abstract void start();
}

class InterfaceCar implements Engine {
    public void start() {
        System.out.println("Starting car with interface...");
    }
}

class AbstractCar extends Vehicle {
    void start() {
        System.out.println("Starting car with abstract class...");
    }
}

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime, endTime;

        Engine car1 = new InterfaceCar();
        Vehicle car2 = new AbstractCar();

        // Measure Interface method call
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            car1.start();
        }
        endTime = System.nanoTime();
        System.out.println("Interface method time: " + (endTime - startTime) + " ns");

        // Measure Abstract class method call
        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            car2.start();
        }
        endTime = System.nanoTime();
        System.out.println("Abstract class method time: " + (endTime - startTime) + " ns");
    }
}
