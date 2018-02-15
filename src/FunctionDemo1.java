import java.util.function.Function;

public class FunctionDemo1 {

    public static void main(String[] args) {
        Function<Integer, Double> milesToKm= (input)-> 1.6 * input;

        int miles = 89;

        double km= milesToKm.apply(miles);
        System.out.printf("%d miles = %3.2f kilometers\n",
                miles, km);
    }
}
