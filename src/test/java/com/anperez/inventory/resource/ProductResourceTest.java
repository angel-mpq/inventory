package com.anperez.inventory.resource;

import com.anperez.inventory.model.Product;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductResourceTest {

    @Autowired
    ProductResource productResource;

    @Test
    public void getProductResourceTest1() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-14T10:00:00.000Z";

        // act
        Product product = productResource.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(1, product.getPriceList());
        Assert.assertEquals(35.5f, product.getPrice(), 0.0f);
    }

    @Test
    public void getProductResourceTest2() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-14T16:00:00.000Z";

        // act
        Product product = productResource.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(1, product.getPriceList());
        Assert.assertEquals(35.5f, product.getPrice(), 0.0f);
    }

    @Test
    public void getProductResourceTest3() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-14T21:00:00.000Z";

        // act
        Product product = productResource.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(2, product.getPriceList());
        Assert.assertEquals(25.45f, product.getPrice(), 0.0f);
    }

    @Test
    public void getProductResourceTest4() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-15T10:00:00.000Z";

        // act
        Product product = productResource.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(3, product.getPriceList());
        Assert.assertEquals(30.5f, product.getPrice(), 0.0f);
    }

    @Test
    public void getProductResourceTest5() {
        // arrange
        int brandId = 1;
        int productId = 35455;
        String dateTime = "2020-06-16T21:00:00.000Z";

        // act
        Product product = productResource.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

        // assert
        Assert.assertNotNull(product);
        Assert.assertEquals(4, product.getPriceList());
        Assert.assertEquals(38.95f, product.getPrice(), 0.0f);
    }
}
