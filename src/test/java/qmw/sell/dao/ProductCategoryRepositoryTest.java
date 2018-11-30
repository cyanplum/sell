package qmw.sell.dao;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import qmw.sell.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveTest() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId(2);
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
        System.out.println(productCategory);
    }

    @Test
    public void findOneTest() {
        Optional<ProductCategory> byId = repository.findById(1);
        ProductCategory productCategory = byId.get();
        System.out.println(productCategory);
    }

    @Test
    public void findAllByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findAllByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }

}