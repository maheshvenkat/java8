import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = ()->{
            Random random = new Random();
            return random.nextInt(10);
        };

        for (int i = 0; i < 5; i++) {
            System.out.println("Random Number ::" + randomNumber.get());
        }
    }
    }

