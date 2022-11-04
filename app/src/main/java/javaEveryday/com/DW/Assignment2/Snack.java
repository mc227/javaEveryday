package javaEveryday.com.DW.Assignment2;

import java.math.BigDecimal;

/**
 * The Snack class description here
 * */
public class Snack
{
    private String id;
    private String size;
    private BigDecimal price;

    public Snack(String id, String size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    private void setId(String id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    private void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private void setPrice(BigDecimal price) {
        this.price = price;
    }
}
