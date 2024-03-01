package iuh.fit.se.kientrucpmtuan5.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id", length = 20)
    private long id;
    private String name;
    private String address;
    private String email;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;
}
