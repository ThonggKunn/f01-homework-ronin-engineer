package src.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table(name = "address")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "country")
        private String country;
        @Column(name = "city")
        private String city;
        @Column(name = "district")
        private String district;
        @Column(name = "street")
        private String street;
        @Column(name = "address_detail")
        private String addressDetail;
    }
