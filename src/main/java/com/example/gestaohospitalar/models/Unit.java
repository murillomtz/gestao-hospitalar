package com.example.gestaohospitalar.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tb_unit")
public class Unit implements Serializable {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Long id;

    private String name;
    private String cep;
    private String spot;
    private String telephone;

    @OneToMany(mappedBy="unit", cascade=CascadeType.ALL)
    private List<Appointmet> appointmet;

    public Unit(String name, String cep, String spot, String telephone) {
        super();
        this.name = name;
        this.cep = cep;
        this.spot = spot;
        this.telephone = telephone;
    }

    public Unit() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getSpot() {
        return spot;
    }

    public void setSpot(String spot) {
        this.spot = spot;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Unidade [nome=" + name + ", cep=" + cep + ", local=" + spot + ", telefone=" + telephone + "]";
    }

}
