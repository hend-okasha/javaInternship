import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = Product.addDummyData();
        Product p=new Product( 31 , "masrawey" , "food", 10.5);
        products.add(p);
        products.forEach(System.out::println);

        // Exercise 1 — Obtain a list of products belongs to category “Books”
        List<Product> books = products.stream()
                .filter( pro -> "Books".equals(pro.getCategory()))
                .collect(Collectors.toList());
        System.out.println("products of category books are");
        books.forEach(System.out::println);

        //Exercise 2 — Obtain a list of products belongs to category “Books” with price > 100
        List<Product> expensiveBooks = products.stream()
                .filter(pro -> "Books".equals(pro.getCategory()) && pro.getPrice() > 100)
                .collect(Collectors.toList());
        System.out.println("products in category Books and its price > 100");
        expensiveBooks.forEach(System.out::println);

        //Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> discountToys = products.stream()
                .filter(pro -> "Toys".equals(pro.getCategory()))
                .map( pro -> new Product(pro.getProductId(), pro.getProductName(), pro.getCategory(), pro.getPrice()*0.9))
                .collect(Collectors.toList());
        System.out.println(" toys with 10% discount");
        discountToys.forEach(System.out::println);

        //Exercise 4 — Get the cheapest products of “Books” category
        Optional<Product> cheapestBooks = products.stream()
                .filter(pro -> "Books".equals(pro.getCategory()))
                .min(Comparator.comparing(Product::getPrice));
        System.out.println("cheapest book is:");
        cheapestBooks.ifPresent(System.out::println);

    }
}