package java8NewFeaturesbyDurgaSir;

public class LambdaExpresionWithoutLambda {
    static String string;

    public static void main(String[] args) {



        Runnable r2 = () -> {
            while (true) {
                System.out.println("runnable r2: " + Math.random());
                string=string+"l";
                System.out.println(string);
            }
        };
        Runnable r1 = () -> {
            while (true) {
                System.out.println("iiiiiiii: " + Math.random());
                string=string+"p";
                System.out.println(string);
            }
        };

        Thread t1 = new Thread(r2);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();


    }


}
