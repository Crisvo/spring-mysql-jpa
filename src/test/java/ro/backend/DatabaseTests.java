package ro.backend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ro.backend.model.dao.ProductCategoryDao;
import ro.backend.model.dao.ProductDao;
import ro.backend.model.dao.UserDao;
import ro.backend.model.tables.Product;
import ro.backend.model.tables.ProductCategory;
import ro.backend.model.tables.User;

@SpringBootTest
class DatabaseTests {

    @Autowired
    private UserDao userDao;
    @Autowired
    private ProductCategoryDao productCategoryDao;
    @Autowired
    private ProductDao productDao;


    @Test
    void testAddUser() {
        User user = new User("username", "passowrd", "role");
        user = userDao.save(user);

        var userSaved = userDao.findById(user.getId());

        Assertions.assertNotNull(userSaved);
    }

    @Test
    void testAddProductCategory(){
        ProductCategory pc = new ProductCategory();
        pc.setCategoryName("TEST");

        pc = productCategoryDao.save(pc);
        var a = 1;
    }

    @Test
    void testAddProduct(){
        ProductCategory pc = new ProductCategory();
        pc.setCategoryName("TEST1");

        pc = productCategoryDao.save(pc);

        Product product = new Product();
        product.setProductName("name");
        product.setProductCategory(pc);

        product = productDao.save(product);

    }
}
