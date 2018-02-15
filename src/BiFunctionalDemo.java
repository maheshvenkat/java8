import java.util.function.BiFunction;

public class BiFunctionalDemo {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> area = (width, length) -> (width * length);
        float width = 3.2F;
        float length = 4.3F;

        float result = area.apply(width,length);
        System.out.println("Area Measurement ::" + result);

    }
}
