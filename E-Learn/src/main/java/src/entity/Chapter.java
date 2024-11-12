package src.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "chapter")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chapter{

    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private String status;
    @Column(name = "`order`")
    private Integer order;

    @Getter
    @Setter
    @Id
    private Long id;
}
