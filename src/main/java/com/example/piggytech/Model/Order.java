package com.example.piggytech.Model;

import jakarta.persistence.*;
import java.util.Date;
import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "order_tbl")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private double totalAmount;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, updatable = false)
    private Date orderDate;

    @Column(nullable = false) // Add this line to specify NOT NULL constraint
    private String email; // New field for email

    @ManyToOne
    @JoinColumn(name = "userAuth_id", nullable = false)
    private UserAuth userAuth;

    public Order() {}

    public Order(double totalAmount, Date orderDate, String email, UserAuth userAuth) {
        this.totalAmount = totalAmount;
        this.orderDate = orderDate;
        this.email = email; // Initialize email
        this.userAuth = userAuth;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public UserAuth getUserAuth() {
        return userAuth;
    }
    public void setUserAuth(UserAuth userAuth) {
        this.userAuth = userAuth;
    }
}

