package src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.util.Date;

@Entity
@Table(name = "user_course")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCourse {

    @Column(name = "rating")
    private Integer rating;
    @Column(name = "review")
    private String review;
    @Column(name = "status")
    private String status;
    @Column(name = "created_date")
    @CreatedDate
    private Date createdDate;
    @Column(name = "updated_date")
    @LastModifiedDate
    private Date updatedDate;

    @Getter
    @Setter
    @Id
    private Long id;

}
