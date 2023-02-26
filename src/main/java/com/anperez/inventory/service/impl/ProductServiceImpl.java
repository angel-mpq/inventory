package com.anperez.inventory.service.impl;

import com.anperez.inventory.mapper.ProductMapper;
import com.anperez.inventory.model.Product;
import com.anperez.inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.TimeZone;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper mapper;
    private String ISO_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
    private String UTC_TIMEZONE_NAME = "UTC";

    @Autowired
    public ProductServiceImpl(@Autowired ProductMapper mapper) { this.mapper = mapper; }

    public List<Product> getProductByBrandAndId(int brandId, int productId) {
        return mapper.getProductByBrandAndId(brandId, productId);
    }

    public Product getProductByBrandAndIdAndDate(int brandId, int productId, String dateTimeString) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(ISO_DATE_FORMAT);
            sdf.setTimeZone(TimeZone.getTimeZone(UTC_TIMEZONE_NAME));
            Timestamp dateTime = new Timestamp(sdf.parse(dateTimeString).getTime());

            List<Product> products = mapper.getProductByBrandAndIdAndDate(brandId, productId, dateTime);

             if (products != null && products.size() > 0) {
                 return products.get(0);
            } else {
                 throw new ResponseStatusException(NOT_FOUND, "Not data found for given date");
            }
        } catch (ParseException e) {
            throw new ResponseStatusException(BAD_REQUEST, "Incorrect date format");
        }
    }
}
