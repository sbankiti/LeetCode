package Java8Chk;

import java.math.BigDecimal;

public class EURExchangeService {

    public BigDecimal rate(String currency){

        if(currency == "usd")
        return BigDecimal.valueOf(0.1);
        //return BigDecimal.ONE;
        else if (currency == "ksd"){
            return null;
        }
        else if (currency == "eur"){
            return BigDecimal.valueOf(-1);
        }
        return null;
    }
}
