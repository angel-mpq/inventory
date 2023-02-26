package com.anperez.inventory.resource;

import com.anperez.inventory.model.Product;
import com.anperez.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductResource {

    private ProductService service;

    @Autowired
    public ProductResource(ProductService service){
        this.service = service;
    }

    @GetMapping("{brandId}/{productId}")
    public List<Product> getProductByBrandAndId(@PathVariable int brandId, @PathVariable int productId) {
        return service.getProductByBrandAndId(brandId, productId);
    }

    @GetMapping("{brandId}/{productId}/{dateTime}")
    public Product getProductByBrandAndIdAndDate(
            @PathVariable int brandId,
            @PathVariable int productId,
            @PathVariable String dateTime
    ) {
        return service.getProductByBrandAndIdAndDate(brandId, productId, dateTime);
    }
}
