package javaEveryday.com.DW.Assignment2;

import java.math.BigDecimal;

public class FruitSnack extends Snack{
    private Boolean citrusFruit;

    public FruitSnack(String id, String size, Boolean citrusFruit) {
        super(id, size);
        this.citrusFruit = citrusFruit;
    }
}
