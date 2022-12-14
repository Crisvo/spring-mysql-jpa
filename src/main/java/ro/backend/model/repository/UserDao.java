package ro.backend.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.backend.model.tables.User;

@Repository
interface UserDao extends JpaRepository<User, Long> {
}
