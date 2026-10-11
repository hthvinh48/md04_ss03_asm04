package com.example.orderservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Lưu customerId dưới dạng số (Long) thay vì @ManyToOne/khóa ngoại vật lý
    @Column(nullable = false)
    private Long customerId;

    // Lưu productId dưới dạng số (Long) thay vì @ManyToOne/khóa ngoại vật lý
    @Column(nullable = false)
    private Long productId;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private LocalDateTime orderDate;

    @Column(nullable = false, precision = 14, scale = 2)
    private BigDecimal totalAmount;
}
