package de.ait.shop43.product.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

// ниже это все аннотации Lombok
@EqualsAndHashCode
@ToString
@Setter
@Getter
//создает пустой конструктор
@NoArgsConstructor
// все поля конструктора имеет благодаря этой аннотации
@AllArgsConstructor
// !! create patter Builder. Это стандартный паттерн.
@Builder

// здесь уже аннотации это другое это Spring Data JPA
@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "active")
    private boolean active;
}
