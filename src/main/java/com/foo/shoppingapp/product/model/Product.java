package com.foo.shoppingapp.product.model;

import lombok.Data;

/**
 * @author Oguz Ozkeroglu
 * Created on 2021.04.04
 */

@Data
public class Product {
    private String id;
    private String productName;
    private String productCode;
    private Boolean active;
}
