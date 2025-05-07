package com.spring_ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "order")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Date creationDate;
    private Date finalizationDate;
    private double total;

    @ManyToOne
    private User user;
    @OneToOne(mappedBy = "purchaseOrder")
    private OrderDetail detail;

    public PurchaseOrder() {
    }

    public PurchaseOrder(Integer id, String name, Date creationDate, Date finalizationDate, double total, User user,OrderDetail detail) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
        this.total = total;
        this.user = user;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getFinalizationDate() {
        return finalizationDate;
    }

    public void setFinalizationDate(Date finalizationDate) {
        this.finalizationDate = finalizationDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public OrderDetail getDetail() {
        return detail;
    }

    public void setDetail(OrderDetail detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "purchase{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creationDate=" + creationDate +
                ", finalizationDate=" + finalizationDate +
                ", total=" + total +
                '}';
    }
}
