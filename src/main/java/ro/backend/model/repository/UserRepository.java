package ro.backend.model.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ro.backend.model.dao.UserDao;

/**
 * Used to fetch data form database linked to users:
 * - user
 */
@Repository
public class UserRepository {
    private UserDao userDao;

    @Autowired
    public UserRepository(UserDao userDao) {
        this.userDao = userDao;
    }
}
