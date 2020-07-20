package java8NewFeaturesbyDurgaSir;

@FunctionalInterface
interface Sayable {
    String say(String message);
}

@FunctionalInterface
interface  sayNoParameter{
    public void sout();
}

@FunctionalInterface
interface sumTwoNumber{
    public int add(int num1,int num2);
}
public class Java1Session1 {
    public static void main(String[] args) {


        sumTwoNumber sum=(int num1,int num2)->{
          return num1+num2;
        };

        System.out.println(sum.add(4,6));

      Sayable person=(message)->{
          String str1="I would like to say,";
          String str2=str1+message;
          return  str2;
      };

      Sayable sayLast=(lastName)->{
          String s = "Hello! your last name is " + lastName;
          return s;
      };

        System.out.println(person.say("Suraj Gurung"));

        sayNoParameter SNP=()->{
            System.out.println("this is fucking awesome");
        };

        SNP.sout();

        System.out.println(sayLast.say("gurung"));

    }
}
/*
Python,R,Scala

new feature:
concise code


Java: Enabling Functional Programming  ; write less to do lot of function

 */