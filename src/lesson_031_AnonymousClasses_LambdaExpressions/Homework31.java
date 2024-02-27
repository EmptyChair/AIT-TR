package lesson_031_AnonymousClasses_LambdaExpressions;

//functional interface of a calculator
@FunctionalInterface
interface NewCalculator {
    int calculate(int a, int b);
}
public class Homework31 {
    public static void main(String[] args) {
        //anonymous class based on NewCalculator
        NewCalculator calc1 = new NewCalculator() {
            @Override
            public int calculate(int a, int b) {
                System.out.println("Processing addition of arguments...");
                return a+b;
            }
        };
        System.out.println("With out new anonymous class, calc1 adds 2 and 3, resulting in..."+calc1.calculate(2,3));

        //new calculators using lambda expressions
        System.out.println("Testing other calculators...");
        NewCalculator sumCalc = (a,b) -> a+b;
        System.out.println("The sum of 2 and 3 is "+sumCalc.calculate(2,3));
        NewCalculator difCalc = (a,b) -> a-b;
        System.out.println("The difference of 2 and 3 is "+difCalc.calculate(2,3));
        NewCalculator multCalc = (a,b) -> a*b;
        System.out.println("The product of 2 and 3 is "+multCalc.calculate(2,3));
        NewCalculator divCalc = (a,b) -> a/b;
        System.out.println("The division of 2 and 3 is "+divCalc.calculate(2,3));
        NewCalculator powCalc = (a,b) -> (int)Math.pow(a,b);
        System.out.println("The potency of 2 by 3 is "+powCalc.calculate(2,3));

    }
}
