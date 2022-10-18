package com.example.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "fruit_table")
public class FruitEntity {

    @Id
    @Column(name = "id_fruit")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "fruit_name")
    private String fruitName;

    @Column(name = "provider_code")
    private Integer providerCode;

    //что бы в с классом можно было совершать манипуляции создается
    //пустой конструктор, геттеры, сеттеры и переопределяется метод toString()

    public FruitEntity(){ //пустой конструктор

    }

    public Integer getId() {
        return id;
    }

    //геттеры, сеттеры
    public String getFruitName() {
        return fruitName;
    }

    public FruitEntity setFruitName(String fruitName) {
        this.fruitName = fruitName;
        return this;
    }

    public Integer getProviderCode() {
        return providerCode;
    }

    public FruitEntity setProviderCode(Integer providerCode) {
        this.providerCode = providerCode;
        return this;
    }

    //переопределяем toString()
    @Override
    public String toString() {
        return "FruitEntity{" +
                "id=" + id +
                ", fruitName='" + fruitName + '\'' +
                ", providerCode=" + providerCode +
                '}';
    }
}