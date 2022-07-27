package ro.backend.model.tables;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    private String username;
    private String password;

    private String role;

    public User() {
        // empty constructor is required
    }

    public User(String username,
                String password,
                String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }


    // region Getters
    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    //endregion
}
