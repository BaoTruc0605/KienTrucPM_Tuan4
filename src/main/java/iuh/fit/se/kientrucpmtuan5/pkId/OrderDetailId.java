package iuh.fit.se.kientrucpmtuan5.pkId;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderDetailId implements Serializable {
    private long order;
    private long product;
}
