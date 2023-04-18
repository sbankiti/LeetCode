package com.codility;

import Java8Chk.EURExchangeService;
import Java8Chk.SimpleSoldProduct;
import Java8Chk.SoldProduct;
import Java8Chk.SoldProductsAggregate;

import java.math.BigDecimal;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class SoldProductsAggregator {

   /* private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {


        return new SoldProductsAggregate(
                products.map(product-> new SimpleSoldProduct(product.getName(), product.getPrice()))
                        .collect(Collectors.toList()),
                getTotal(products)
        );
    }

    private BigDecimal getTotal(Stream<SoldProduct> products){

        return  products
                .map(product ->exchangeService.rate(product.getCurrency()))
                // .filter(pricesInEUR -> !pricesInEUR.isEmpty())
                .filter(product -> product::nonNull)
                .filter(product -> product.compareTo(BigDecimal.ZERO) > 0)
                .reduce(BigDecimal::add);
    }*/

}