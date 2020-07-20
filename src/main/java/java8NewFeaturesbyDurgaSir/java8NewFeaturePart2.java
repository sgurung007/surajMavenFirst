package java8NewFeaturesbyDurgaSir;

import java.util.ArrayList;

interface Addabble {
    int add(int a, int b);
}

public class java8NewFeaturePart2 {
    public static void main(String[] args) {
        Addabble add1 = (a, b) -> (a + b);


        int add = add1.add(4, 9);


        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("laxmi");
        myArray.add("suraj");
        myArray.add("pitam");
        myArray.add("suk");

        myArray.forEach((x)-> System.out.println(x.toUpperCase()));

    }

}

