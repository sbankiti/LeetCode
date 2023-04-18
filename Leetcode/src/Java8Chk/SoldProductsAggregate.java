package Java8Chk;

import java.math.BigDecimal;
import java.util.List;

public class SoldProductsAggregate {

    private final List<SimpleSoldProduct> products;
    private final BigDecimal total;

    public List<SimpleSoldProduct> getProducts() {
        return products;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public SoldProductsAggregate(List<SimpleSoldProduct> products, BigDecimal total) {
        this.products = products;
        this.total = total;
    }
}
