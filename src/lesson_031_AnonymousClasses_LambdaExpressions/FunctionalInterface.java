package lesson_031_AnonymousClasses_LambdaExpressions;

@FunctionalInterface
interface Calculator {
    int operate(int a, int b);
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

    }
}
