package com.akalanka.riceMill.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class PaddyStock {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private String stockDate;
    private String stockVehicleNo;
    private String stockName;
    private String stockContact;
    private double stockTotalPrice;
    private double stockCash;
    private double stockCheque;
    private String stockChequeNo;
    private double stockCredit;

    @OneToMany(mappedBy = "amountPaddyStock",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    @JsonIgnore
    private List<PaddyAmount> paddyAmount;


    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockDate() {
        return stockDate;
    }

    public void setStockDate(String stockDate) {
        this.stockDate = stockDate;
    }

    public String getStockVehicleNo() {
        return stockVehicleNo;
    }

    public void setStockVehicleNo(String stockVehicleNo) {
        this.stockVehicleNo = stockVehicleNo;
    }

    public String getStockContact() {
        return stockContact;
    }

    public void setStockContact(String stockContact) {
        this.stockContact = stockContact;
    }

    public double getStockTotalPrice() {
        return stockTotalPrice;
    }

    public void setStockTotalPrice(double stockTotalPrice) {
        this.stockTotalPrice = stockTotalPrice;
    }

    public double getStockCash() {
        return stockCash;
    }

    public void setStockCash(double stockCash) {
        this.stockCash = stockCash;
    }

    public double getStockCheque() {
        return stockCheque;
    }

    public void setStockCheque(double stockCheque) {
        this.stockCheque = stockCheque;
    }

    public String getStockChequeNo() {
        return stockChequeNo;
    }

    public void setStockChequeNo(String stockChequeNo) {
        this.stockChequeNo = stockChequeNo;
    }

    public double getStockCredit() {
        return stockCredit;
    }

    public void setStockCredit(double stockCredit) {
        this.stockCredit = stockCredit;
    }

    public List<PaddyAmount> getPaddyAmount() {
        return paddyAmount;
    }

    public void setPaddyAmount(List<PaddyAmount> paddyAmount) {
        this.paddyAmount = paddyAmount;
    }
}
