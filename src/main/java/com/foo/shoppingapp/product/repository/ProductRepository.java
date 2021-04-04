package com.foo.shoppingapp.product.repository;

import com.foo.shoppingapp.product.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author Oguz Ozkeroglu
 * Created on 2021.04.04
 */
public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
}
