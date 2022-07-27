package ro.backend.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
