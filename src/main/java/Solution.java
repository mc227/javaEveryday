import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Product{
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s%", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception{
        if(args.length == 0) return;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String filename = bufferedReader.readLine();
        List<Product> products = new ArrayList<>();

        try(BufferedReader fileReader = new BufferedReader(new FileReader(filename))){
            while (fileReader.ready()){
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]){
            case "-c":

        }
    }

    private static Product getProduct(String readLine) {
        return new Product(1,"name","price","q");
    }
}