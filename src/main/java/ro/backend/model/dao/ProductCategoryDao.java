package ro.backend.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.ProductCategory;

@Repository
public interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {
}
