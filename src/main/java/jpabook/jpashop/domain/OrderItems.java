package jpabook.jpashop.domain;

import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class OrderItems {

    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private long id;

    private Item itme;

    @ManyToOne
    @JoinColumn(name="order_id")
    private Order order;

    private int orderPrice;  //주문 가격
    private int count; //주문 수량

}
