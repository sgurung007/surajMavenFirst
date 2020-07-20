package java8NewFeaturesbyDurgaSir;

interface Sayable1{
    void say();
}
public class Java8MethodReference {
    public static void saySomething(){
        System.out.println("Hello, this is static method.");
    }
    public static void main(String[] args) {
       Java8MethodReference.saySomething();
       Java8MethodReference.saySomething();
       Java8MethodReference.saySomething();
       Java8MethodReference.saySomething();


       Sayable1 sayable1=Java8MethodReference::saySomething;

       sayable1.say();
       sayable1.say();
       sayable1.say();
       sayable1.say();
       sayable1.say();



        
    }
}
/*
1. Reference to a static method.
2. Reference to an instance method.
3. Reference to a constructor



 */