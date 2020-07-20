package java8NewFeaturesbyDurgaSir;

public class MethodReferencePredefinedRunnable {
    public static void ThreadStatus(){
        System.out.println("Thread is running.....");
    }

    public static void ThreadStatus2(){
        System.out.println("Thread is running...2..");
    }
    public static void main(String[] args) {
        Thread t1=new Thread(MethodReferencePredefinedRunnable::ThreadStatus);
        Thread t2=new Thread(MethodReferencePredefinedRunnable::ThreadStatus2);
        t1.start();
        t2.start();
    }
}
