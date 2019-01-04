package com.akalanka.riceMill.model;

import javax.persistence.*;

@Entity
public class PaddyAmount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private double amountAmount;
    private double amountPrice;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "paddyStock_id")
    private PaddyStock amountPaddyStock;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.REFRESH})
    @JoinColumn(name = "paddyType_id")
    private PaddyType amountPaddyType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getAmountAmount() {
        return amountAmount;
    }

    public void setAmountAmount(double amountAmount) {
        this.amountAmount = amountAmount;
    }

    public double getAmountPrice() {
        return amountPrice;
    }

    public void setAmountPrice(double amountPrice) {
        this.amountPrice = amountPrice;
    }

    public PaddyStock getAmountPaddyStock() {
        return amountPaddyStock;
    }

    public void setAmountPaddyStock(PaddyStock amountPaddyStock) {
        this.amountPaddyStock = amountPaddyStock;
    }

    public PaddyType getAmountPaddyType() {
        return amountPaddyType;
    }

    public void setAmountPaddyType(PaddyType amountPaddyType) {
        this.amountPaddyType = amountPaddyType;
    }
}
