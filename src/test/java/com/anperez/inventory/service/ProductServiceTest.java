package com.anperez.inventory.service;

import com.anperez.inventory.model.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    ProductService productService;

    @Test
    public void getAllProducts() {
        // arrange
        int brandId = 1;
        int productId = 35455;

        // act
        List<Product> product = productService.getProductByBrandAndId(brandId, productId);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(4, product.size());
    }

    @Test
    public void getProductByBrandAndIdAndDate() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-14T19:00:00.000Z";

        // act
        Product product = productService.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(2, product.getPriceList());
        Assert.assertEquals(25.45f, product.getPrice(), 0.0f);
    }
}
