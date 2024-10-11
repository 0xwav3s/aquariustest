package com.interview.aquariustest.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor // Add this Lombok annotation
@AllArgsConstructor // Add this Lombok annotation
@Entity
public class CryptoPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String exchange;
    private String symbol;
    private BigDecimal bidPrice; // Use BigDecimal for high precision
    private BigDecimal askPrice;
    private LocalDateTime timestamp;
}
