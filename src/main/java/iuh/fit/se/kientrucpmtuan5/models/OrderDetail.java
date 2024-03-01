package iuh.fit.se.kientrucpmtuan5.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "orderDetail")
public class OrderDetail {
    @Id
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    private int quantity;
    @Column(columnDefinition = "nvarchar(255)")
    private String note;

}
