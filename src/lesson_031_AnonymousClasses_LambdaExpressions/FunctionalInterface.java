package lesson_031_AnonymousClasses_LambdaExpressions;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
}

@FunctionalInterface
interface Typewriter {
    void write(int a, int b);
}

@FunctionalInterface
interface Printer<T> {
    T operate(T a, T b);
}

class Main3 {
    public static void main(String[] args) {
        //LAMBDA EXPRESSION EXAMPLES
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;
        Calculator divide = (a, b) -> a/b;
        Calculator multiply = (a, b) -> {
            return a*b;
        };

        System.out.println("Sum of 5 and 3 equals " + add.operate(5, 3));
        System.out.println("Difference of 5 and 3 is " + subtract.operate(5, 3));
        System.out.println("5 divided by 3 is " + divide.operate(5, 3));
        System.out.println("5 multiplied by 3 is " + multiply.operate(5, 3));

        //ANOTHER ANONYMOUS CLASS
        Calculator addNew = new Calculator() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        };
        int result = addNew.operate(1,2);
        System.out.println("Adding 1 and 2 equals "+result);

        //TERMINAL LAMBDA EXPRESSION
        Typewriter ericson = (a,b) -> System.out.println("First "+a+", then "+b+".");
        ericson.write(1,56);

        //Generalized Lambda expression
        Printer<String> pr1 = (a,b) -> a+b;
        System.out.println("Output of pr1 with 'al' and 'fred' is "+pr1.operate("al","fred"));
        Printer<Integer> pr2 = (a,b) -> a+b;
        System.out.println("Output of pr2 with 1 and 2 is "+pr2.operate(1,2));
    }
}
