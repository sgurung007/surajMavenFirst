package java8NewFeaturesbyDurgaSir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Product {
    int id;
    String name;
    float price;


    public Product(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaComparator {
    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();

        list.add(new Product(1,"hp laptop",25000f));
        list.add(new Product(2,"keyboard",300f));
        list.add(new Product(4,"dell Mouse",150f));

        System.out.println("Sorting on the basis of name....");

        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });

        for (Product p:list
             ) {
            System.out.println(p.id+" "+p.name+" "+p.price);
        }

        Stream<Product> productStream = list.stream().filter(p -> p.price > 50);
        productStream.forEach(product -> System.out.println(product.price)
        );
    }
}
