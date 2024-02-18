package com.valarchi.valarvoom.accessingdatamysql;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Income {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)

    private Integer id;
    private String name;
    private String incomeType;
    private String income;

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
    public String getIncomeType() {
        return incomeType;
    }
    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }
    public String getIncome() {
        return income;
    }
    public void setIncome(String income) {
        this.income = income;
    }
}
