package com.example.orderapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "t_line_item")
@Data
public class LineItem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantity")
    private String quantity;


    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
}
