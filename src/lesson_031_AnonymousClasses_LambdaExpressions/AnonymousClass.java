package lesson_031_AnonymousClasses_LambdaExpressions;

interface Greeting {
    void sayHello();
    void sayGoodBye();
}

class MyGreeting implements Greeting {
    @Override
    public void sayHello() {
        System.out.println("Greetings from regular class!");
    }
    @Override
    public void sayGoodBye() {
        System.out.println("Good bye from regular class!");
    }
}

class NormalGreeting {
    public void sayHello() {
        System.out.println("Hi!");
    }
}

abstract class AbsGreeting {
    public abstract void sayHello();
}


class Main1 {
    public static void main(String[] args) {
        //REGULAR MYGREETING OBJECT
        MyGreeting myG = new MyGreeting();
        myG.sayHello();
        myG.sayGoodBye();
        //ANONYMOUS CLASS:
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Greetings from anonymous class!");
            }
            @Override
            public void sayGoodBye() {
                System.out.println("Bye-bye anonymous class!");
            }
        };
        //Testing new anonymous class method:
        greeting.sayHello();
        greeting.sayGoodBye();

        //Second anonymous class
        Greeting greeting2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Good day to you, sir, from a more sophisticated class!");
            }

            @Override
            public void sayGoodBye() {
                System.out.println("Until we meet again, sir. Yours truly, a more sophisticated class.");
            }
        };
        greeting2.sayHello();
        greeting2.sayGoodBye();
        //Greeting1 and greeting2 are fully independent (save for connection via interface implementation)

        NormalGreeting greeting3 = new NormalGreeting() {
            @Override
            public void sayHello() {
                System.out.println("Greetings from overriden normal class!");
            }
        };
        greeting3.sayHello();

        AbsGreeting absGreeting = new AbsGreeting() {
            @Override
            public void sayHello() {
                System.out.println("Greetings from overriden abstract class!");
            }
        };
        absGreeting.sayHello();


    }
}