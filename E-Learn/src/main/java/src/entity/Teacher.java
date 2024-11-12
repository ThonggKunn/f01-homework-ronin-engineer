package src.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Teacher{
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private String status;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;

    @Getter
    @Setter
    @Id
    private Long id;

}
