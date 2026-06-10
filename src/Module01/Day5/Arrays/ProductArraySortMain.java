package Module01.Day5.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ProductArraySortMain {
    public static void main(String[] args) {
        Product[] parr={
                new Product(402,"Bulb","Electic","Philips",30,0.20,4.5),
                new Product(103,"Ball","Sport","Decathlon",10,0.5,4.7),
                new Product(301,"Pen"," Stationary","Apsara",25,0.02,3.8),
                new Product(022,"Laptop","Electronic","Dell",30000,0.35,4.9),
                new Product(100,"SerialLight","Electic","Philips",100,0.17,4.5)

        };
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(parr));
        System.out.println("Enter 1-Name ascending sort,2-Category ascending sort,3-Brand ascending sort," +
                "4- Price ascending sort,5-discount ascending sort,6-Rating ascending sort"+
                "7-Name descending sort,8-Category descending sort,9-Brand descending sort," +
                "10- Price descending sort,11-discount descending sort,12-Rating descending sort"
        );
        int opt= sc.nextInt();
        switch(opt){
            case 1:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 2:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getCategory().compareTo(o2.getCategory());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 3:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o1.getBrand().compareTo(o2.getBrand());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 4:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o1.getPrice(),o2.getPrice());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 5:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o1.getDiscount(),o2.getDiscount());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 6:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare (o1.getRating(),o2.getRating());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 7:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getName().compareTo(o1.getName());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 8:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getCategory().compareTo(o1.getCategory());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 9:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return o2.getBrand().compareTo(o1.getBrand());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 10:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o2.getPrice(),o1.getPrice());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 11:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o2.getDiscount(),o1.getDiscount());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 12:
                Arrays.sort(parr, new Comparator<Product>() { //local anonymous class
                    @Override
                    public int compare(Product o1, Product o2) {
                        return Double.compare(o2.getRating(),o1.getRating());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
        }
    }
}
