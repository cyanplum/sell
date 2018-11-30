package qmw.sell.service.Imp;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import qmw.sell.dataobject.ProductCategory;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImpTest {

    @Autowired
    private CategoryServiceImp categoryServiceImp;

    @Test
    public void findOne(){

        ProductCategory productCategory = categoryServiceImp.findOne(2);
        Assert.assertEquals(new Integer(2),productCategory.getCategoryId());
        System.out.println(productCategory);
    }

    @Test
    public void findAll() {
        List<ProductCategory> productCategoriesList = categoryServiceImp.findAll();
        Assert.assertNotEquals(0,productCategoriesList.size());
        System.out.println(productCategoriesList);
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList = categoryServiceImp.findByCategoryTypeIn(Arrays.asList(1,2,3));
        Assert.assertNotEquals(0,productCategoryList.size());
        System.out.println(productCategoryList);
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("小孩最爱",3);
        ProductCategory result = categoryServiceImp.save(productCategory);
        Assert.assertNotNull(result);
        System.out.println(result);
    }
}