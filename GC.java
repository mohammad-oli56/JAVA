package JAVA;

public class GC {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Car car = new Car();
        car = null;
        System.gc();
    }
}

class Car{
    String name;
}
