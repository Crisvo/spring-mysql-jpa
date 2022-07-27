package ro.backend.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Long> {
}
