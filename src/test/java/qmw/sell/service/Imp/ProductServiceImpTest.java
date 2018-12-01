package qmw.sell.service.Imp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;
import qmw.sell.dataobject.ProductInfo;
import qmw.sell.enums.ProductStatusEnum;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImpTest {

    @Autowired
    private ProductServiceImp productService;

    @Test
    public void findOne() {
        ProductInfo productInfo = productService.findOne("123456");
        Assert.assertEquals("123456",productInfo.getProductId());
        System.out.println(productInfo);
    }

    @Test
    public void findUpAll() {

        List<ProductInfo> productInfoList = productService.findUpAll();
        Assert.assertNotNull(productInfoList);
        System.out.println(productInfoList);
    }

    @Test
    public void findAll() {
        PageRequest request = new PageRequest(0,2);
        Page<ProductInfo> productInfoPage = productService.findAll(request);
        Assert.assertNotEquals(0,productInfoPage);
        //System.out.println(productInfoPage.getTotalElements());
        System.out.println(productInfoPage);
    }

    @Test
    public void save() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("123457");
        productInfo.setProductName("皮皮虾");
        productInfo.setProductPrice(new BigDecimal(3.2));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("很好喝的虾");
        productInfo.setProductIcon("Http://xxxxx.jpg");
        productInfo.setProductStatus(ProductStatusEnum.DOWN.getCode());
        productInfo.setCategoryType(2);
        productService.save(productInfo);
        Assert.assertNotNull(productInfo);
    }
}