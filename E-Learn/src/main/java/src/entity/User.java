package src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User{
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "status")
    private String status;
    @Column(name = "nickname")
    private String nickname;
    @Transient
    private String email;

    @OneToOne(mappedBy = "user")
    private FullName fullName;

    @ManyToMany()
    @JoinTable(
            name = "user_address",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private List<Address> address;

    @OneToMany(mappedBy = "user")
    private List<UserCourse> userCourses = new ArrayList<>();

    @Getter
    @Setter
    @Id
    private Long id;

}
