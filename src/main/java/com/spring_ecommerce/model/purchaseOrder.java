package com.spring_ecommerce.model;

import java.util.Date;

public class purchaseOrder {
    private Integer id;
    private String name;
    private Date creationDate;
    private Date finalizationDate;
    private double total;

    public purchaseOrder() {
    }

    public purchaseOrder(Integer id, String name, Date creationDate, Date finalizationDate, double total) {
        this.id = id;
        this.name = name;
        this.creationDate = creationDate;
        this.finalizationDate = finalizationDate;
        this.total = total;
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
