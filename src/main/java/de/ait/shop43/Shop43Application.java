package de.ait.shop43;

import de.ait.shop43.product.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;

import java.math.BigDecimal;

@SpringBootApplication
public class Shop43Application {

    public static void main(String[] args) {

        SpringApplication.run(Shop43Application.class, args);
        Product product = new Product();
        Product product1 = new Product(1L, "milk", new BigDecimal("1.90"), true);
        System.out.println(product1);
        System.out.println(product);
    }
}