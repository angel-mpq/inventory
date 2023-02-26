package com.anperez.inventory.mapper;

import com.anperez.inventory.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.sql.Timestamp;
import java.util.List;

@Mapper
public interface ProductMapper {

    @Select(" SELECT brand_id AS brandId" +
            "        , start_date AS startDate" +
            "        , end_date AS endDate" +
            "        , price_list AS priceList" +
            "        , product_id AS productId" +
            "        , priority" +
            "        , price" +
            "        , curr" +
            " FROM product " +
            " WHERE brand_id = #{brandId} AND product_id = #{id}"
    )
    List<Product> getProductByBrandAndId(@Param("brandId") int brandId, @Param("id") int id);

    @Select(" SELECT brand_id AS brandId" +
            "        , start_date AS startDate" +
            "        , end_date AS endDate" +
            "        , price_list AS priceList" +
            "        , product_id AS productId" +
            "        , priority" +
            "        , price" +
            "        , curr" +
            " FROM product " +
            " WHERE brand_id = #{brandId} " +
            " AND product_id = #{id} " +
            " AND start_date <= #{dateTime} " +
            " AND (end_date IS NULL OR end_date >= #{dateTime})" +
            " ORDER BY priority DESC"
    )
    List<Product> getProductByBrandAndIdAndDate(
            @Param("brandId") int brandId,
            @Param("id") int id,
            @Param("dateTime") Timestamp dateTime
    );
}
