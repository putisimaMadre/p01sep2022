package com.formatoweb.proyecto01sep22.entity;

import javax.persistence.*;

@Entity
@Table(name = "PERSONA", schema = "CURSO_ORACLE", catalog = "")
public class Persona {
    private String nombre;
    private String apellido;
    private Long idPersona;

    @Basic
    @Column(name = "NOMBRE")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "APELLIDO")
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "persona_sec")
    @SequenceGenerator(sequenceName = "persona_sec", allocationSize = 1, name = "persona_sec")
    @Column(name = "ID_PERSONA")
    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona that = (Persona) o;

        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (idPersona != null ? !idPersona.equals(that.idPersona) : that.idPersona != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nombre != null ? nombre.hashCode() : 0;
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (idPersona != null ? idPersona.hashCode() : 0);
        return result;
    }
}
