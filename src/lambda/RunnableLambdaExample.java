package lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * prior Java 8
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // Java 8 Lambda
        // () -> {};

        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable lambda");
        };
        new Thread(runnableLambda).start();

        // Easier way with lambda (One Line)
        Runnable runnableLambda2 = () -> System.out.println("Inside Runnable lambda 2");
        new Thread(runnableLambda2).start();

        // Easiest way with lamda
        new Thread(() -> System.out.println("Inside Runnable Lamda in class")).start();

    }

}
