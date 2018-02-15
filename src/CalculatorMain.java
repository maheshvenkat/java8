public class CalculatorMain {

    public static void main(String[] args) {

        Calculator addition = (int a, int b) ->(double)(a+b);
        Calculator subtraction = (int a, int b)->(double) (a-b);
        Calculator division = (int a, int b)->(double) a/b;

        System.out.println(addition.calculate(10,5));
        System.out.println(subtraction.calculate(10,5));
        System.out.println(division.calculate(10,5));

    }



}
