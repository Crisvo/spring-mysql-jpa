package ro.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.ProductCategory;

@Repository
interface ProductCategoryDao extends JpaRepository<ProductCategory, Long> {
}
