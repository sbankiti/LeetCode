package Java8Chk;

import java.math.BigDecimal;

public class SimpleSoldProduct {

    public SimpleSoldProduct(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    private final String name;
    private final BigDecimal price;

}
