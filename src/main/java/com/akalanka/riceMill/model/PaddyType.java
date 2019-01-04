package com.akalanka.riceMill.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class PaddyType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO	)
    private Integer id;
    private String paddyName;

    @OneToMany(mappedBy = "amountPaddyType",
            cascade = {CascadeType.DETACH,CascadeType.MERGE,
                    CascadeType.REFRESH})
    @JsonIgnore
    private List<PaddyAmount> paddyAmount;

    public List<PaddyAmount> getPaddyAmount() {
        return paddyAmount;
    }

    public void setPaddyAmount(List<PaddyAmount> paddyAmount) {
        this.paddyAmount = paddyAmount;
    }

    public String getPaddyName() {
        return paddyName;
    }

    public void setPaddyName(String paddyName) {
        this.paddyName = paddyName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
