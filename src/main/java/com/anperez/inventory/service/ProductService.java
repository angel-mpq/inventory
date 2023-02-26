package com.anperez.inventory.service;

import com.anperez.inventory.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProductByBrandAndId(int brandId, int productId);

    Product getProductByBrandAndIdAndDate(int brandId, int productId, String dateTime);
}
