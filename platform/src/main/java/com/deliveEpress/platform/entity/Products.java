package com.deliveEpress.platform.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(name = "original_price", nullable = false)
    private Double originalPrice;

    @Column(name = "reduced_price")
    private Double reducedPrice;

    @Column(name = "discount_rate")
    private Double discountRate;

    @Enumerated(EnumType.STRING)
    @Column(name = "stock_status", nullable = false)
    private StockStatus stockStatus;

    @Enumerated(EnumType.STRING)
    @Column(name = "product_badge")
    private ProductBadge productBadge;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @Column(nullable = false)
    private double quantity;

    @Getter
    @Column(nullable = false, unique = true)
    private String ref;

    public enum StockStatus {
        IN_STOCK,
        LOW_STOCK,
        OUT_OF_STOCK
    }

    public enum ProductBadge {
        NONE,
        HOT,
        NEW,
        TRENDING,
        BEST_SELLER
    }

    public enum Category {
        ELECTRONICS,
        BOOKS,
        SPORTS,
        HOME_LIVING
    }
}
