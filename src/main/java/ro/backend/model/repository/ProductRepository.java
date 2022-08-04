package ro.backend.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.Product;
import ro.backend.model.tables.ProductCategory;

import java.util.List;

@Repository
public class ProductRepository {
    private ProductCategoryDao productCategoryDao;
    private ProductDao productDao;

    @Autowired
    public ProductRepository(ProductCategoryDao productCategoryDao, ProductDao productDao) {
        this.productCategoryDao = productCategoryDao;
        this.productDao = productDao;
    }

    public List<Product> getAllProducts(){
        return productDao.findAll();
    }

    public List<ProductCategory> getAllProductCategories(){
        return productCategoryDao.findAll();
    }
}
