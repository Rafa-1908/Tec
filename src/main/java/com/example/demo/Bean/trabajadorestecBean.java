package com.example.demo.Bean;

import javax.persistence.*;

@Entity
@Table(name = "trabajadortec")
public class trabajadorestecBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idtienda;
    private String dni;
    private String nombtrabajador;
    private String apellidomaterno;
    private String apellidopaterno;
    private Integer edad;
    private Boolean estado;
// Con el Get hacemos la invocacion a los id
    public Integer getIdtienda() {
        return idtienda;
    }
// Con el Set para colocar nuevos valores
    public void setIdtienda(Integer idtienda) {
        this.idtienda = idtienda;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombtrabajador() {
        return nombtrabajador;
    }
// Aqui se esat creando el llamado
    public void setNombtrabajador(String nombtrabajador) {
        this.nombtrabajador = nombtrabajador;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
