package src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fullname")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FullName {
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "mid_name")
    private String midName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "status")
    private String status;

    @Getter
    @Setter
    @Id
    private Long id;
}
