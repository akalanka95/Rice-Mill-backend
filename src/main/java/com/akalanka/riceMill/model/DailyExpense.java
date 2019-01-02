package com.akalanka.riceMill.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DailyExpense {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private String date;
    private String name;
    private String code;
    private String type;
    private double expense;
    private double income;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getExpense() {
        return expense;
    }

    public void setExpense(double expense) {
        this.expense = expense;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
