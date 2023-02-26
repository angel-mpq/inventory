package com.anperez.inventory.mapper;

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
public class ProductMapperTest {

    @Autowired
    ProductMapper productMapper;

    @Test
    public void getAllProducts() {
        // arrange
        int brandId = 1;
        int productId = 35455;

        // act
        List<Product> product = productMapper.getProductByBrandAndId(brandId, productId);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(4, product.size());
    }
}
