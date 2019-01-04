package com.akalanka.riceMill.model;

import javax.persistence.*;

@Entity
public class LabourSalaryToPaid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private double salary;
    private double advance;
    private String date;
    private double amountTopaid;
    private String name;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name="labourId")
    private Labour labour;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getAdvance() {
        return advance;
    }

    public void setAdvance(double advance) {
        this.advance = advance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getAmountTopaid() {
        return amountTopaid;
    }

    public void setAmountTopaid(double amountTopaid) {
        this.amountTopaid = amountTopaid;
    }

    public Labour getLabour() {
        return labour;
    }

    public void setLabour(Labour labour) {
        this.labour = labour;
    }
}
