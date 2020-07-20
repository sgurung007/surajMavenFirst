package java8NewFeaturesbyDurgaSir;

import com.google.common.cache.Weigher;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a,int b){
        return a+b;
    }
}

public class MethodReferenceBiFunctional {
    public static void main(String[] args) {
        Weigher<Integer, Integer> add = Arithmetic::add;

    }
}
