package qmw.sell.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import qmw.sell.dataobject.ProductCategory;

import java.util.List;

@Component
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory>findAllByCategoryTypeIn(List<Integer> categoryTypeList);
}
