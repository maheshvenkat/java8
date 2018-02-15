@FunctionalInterface
public interface Calculator {
    Double calculate(int a, int b);

    default int add(int a, int b) {
        return a+b;
    }

    default int subtract(int a, int b) {
        return a-b;
    }

    @Override
    String toString();



}
