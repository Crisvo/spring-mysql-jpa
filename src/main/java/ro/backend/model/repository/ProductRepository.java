package ro.backend.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ro.backend.model.dao.ProductCategoryDao;
import ro.backend.model.dao.ProductDao;

@Repository
public class ProductRepository {
    private ProductCategoryDao productCategoryDao;
    private ProductDao productDao;

    @Autowired
    public ProductRepository(ProductCategoryDao productCategoryDao, ProductDao productDao) {
        this.productCategoryDao = productCategoryDao;
        this.productDao = productDao;
    }


}
