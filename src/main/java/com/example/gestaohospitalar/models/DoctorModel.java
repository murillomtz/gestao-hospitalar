package com.example.gestaohospitalar.models;

<<<<<<< HEAD
=======
import com.example.gestaohospitalar.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
>>>>>>> branch 'master' of https://github.com/murillomtz/gestao-hospitalar.git
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.example.gestaohospitalar.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table(name = "tb_doctor")
public class DoctorModel extends Employee implements Serializable {
	private static final long serialVersionUID = -7999235303120098773L;
	
	@JsonInclude(JsonInclude.Include.NON_NULL)
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private Long id;
    private String especialidade;
    private  Integer RMS;

    // @JsonBackReference // Nao permite que cliente serem serializados os pedidos
    @JsonIgnore
    @OneToMany(mappedBy = "doctor")
    private List<Appointmet> appointments;


    public DoctorModel(String name, String cpf, LocalDate birthDate, Long id, RoleEnum role, Unit unit, Double valueHour, Long id1, String especialidade, Integer RMS) {
        super(name, cpf, birthDate, id, role, unit, valueHour);
        this.id = id1;
        this.especialidade = especialidade;
        this.RMS = RMS;
    }

    public DoctorModel(Long id, RoleEnum role, Unit unit, Double valueHour, Long id1, String especialidade, Integer RMS) {
        super(id, role, unit, valueHour);
        this.id = id1;
        this.especialidade = especialidade;
        this.RMS = RMS;
    }

    public DoctorModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Integer getRMS() {
        return RMS;
    }

    public void setRMS(Integer RMS) {
        this.RMS = RMS;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DoctorModel that = (DoctorModel) o;
        return Objects.equals(id, that.id) && Objects.equals(especialidade, that.especialidade) && Objects.equals(RMS, that.RMS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, especialidade, RMS);
    }
}
