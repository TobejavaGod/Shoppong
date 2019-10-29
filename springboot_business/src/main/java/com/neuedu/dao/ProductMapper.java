package com.neuedu.dao;

import com.neuedu.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface ProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    List<Product> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table neuedu_product
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Product record);

    /**
     * 商品上下架
     * @param productId
     * @param status 0 在售 2 下架 3 删除
     * @return
     */
    int updateStatusById(@Param("productId") Integer productId, @Param("status") Integer status);


    /**
     * 根据商品名和商品编号查询
     * @param productName 模糊查询
     * @param productId
     * @return
     */
    List<Product> selectProductsByNameAndId(@Param("productName")String productName,@Param("productId")Integer productId);

    /**
     * 扣库存
     * @param productId
     * @param stock
     * @return
     */
    int reduceProductStock(@Param("productId") Integer productId,@Param("stock") Integer stock);

    /**
     * 用户查询商品
     * @param productId
     * @return
     */
    Product findProductForUser(@Param("productId") Integer productId);

    /**
     * 商品列表for用户
     * @param category
     * @param orderBy
     * @return
     */
    List<Product> findProductsByCategoryForUser(@Param("categoryId") Integer categoryId,@Param("orderBy") String orderBy);
}