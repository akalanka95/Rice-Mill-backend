package com.akalanka.riceMill.model;

import javax.persistence.*;

@Entity
public class LabourSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private double salary;
    private double advance;
    private double amountTopaid;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="labourId")
    private Labour labour;

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