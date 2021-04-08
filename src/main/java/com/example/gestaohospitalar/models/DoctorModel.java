package com.example.gestaohospitalar.models;


import com.example.gestaohospitalar.enums.RoleEnum;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeName;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "tb_doctor")
@JsonTypeName("doctorModel")
public class DoctorModel extends Employee implements Serializable {
    private static final long serialVersionUID = -7999235303120098773L;


    private String especialidade;
    private Integer RMS;

    // @JsonBackReference // Nao permite que cliente serem serializados os pedidos
    @JsonIgnore
    @OneToMany(mappedBy = "doctor")
    private List<Appointmet> appointments;

    public DoctorModel() {

    }

    public DoctorModel(String name, String cpf, LocalDate birthDate,
                       Long id, RoleEnum role, Unit unit, Double valueHour,
                       String especialidade, Integer RMS, List<Appointmet> appointments) {

        super(name, cpf, birthDate, id, role, unit, valueHour);
        this.especialidade = especialidade;
        this.RMS = RMS;
        this.appointments = appointments;
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
        return Objects.equals(especialidade, that.especialidade) && Objects.equals(RMS, that.RMS) && Objects.equals(appointments, that.appointments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), especialidade, RMS, appointments);
    }
}
