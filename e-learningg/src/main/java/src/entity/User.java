package src.entity;

import jakarta.persistence.*;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String name;
    private boolean isActive = true;

    @OneToMany(mappedBy = "user")
    private List<UserCourse> userCourses;

}

