package javaEveryday.com.DW.Assignment2;

import java.math.BigDecimal;

public class SaltySnack extends Snack{
    private Boolean nutSnack;

    public SaltySnack(String id, String size, Boolean nutSnack) {
        super(id, size);
        this.nutSnack = nutSnack;
    }
}
