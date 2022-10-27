package javaEveryday.com.DW;

public class Coffee {
    String type;
    String size;

    public Coffee(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public void display() {
        System.out.println("Coffee{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                '}');
    }
}
