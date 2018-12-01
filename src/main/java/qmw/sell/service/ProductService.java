package qmw.sell.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import qmw.sell.dataobject.ProductInfo;

import java.util.List;

/**
 * 商品
 * */
public interface ProductService {

    ProductInfo findOne(String productId);

    /**
     * 查询所有在架商品
     * */
    List<ProductInfo> findUpAll();


    /**
     * 分页查找所有
     * */
    Page<ProductInfo> findAll(Pageable pageable);

    ProductInfo save(ProductInfo productInfo);


    //加库存


    //减库存
}
