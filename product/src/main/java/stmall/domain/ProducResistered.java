package stmall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import stmall.domain.*;
import stmall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProducResistered extends AbstractEvent {

    private Long id;
    private String productname;
    private Integer stock;

    public ProducResistered(Inventory aggregate) {
        super(aggregate);
    }

    public ProducResistered() {
        super();
    }
}
//>>> DDD / Domain Event