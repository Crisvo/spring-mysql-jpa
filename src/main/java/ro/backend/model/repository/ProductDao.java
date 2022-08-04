package ro.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.Product;

@Repository
interface ProductDao extends JpaRepository<Product, Long> {
}
