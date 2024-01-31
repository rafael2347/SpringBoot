package modelo;

import java.util.Objects;

public class EntidadEmpleado {
    private String dni;
    private String nomEmp;
    private EntidadDepartamento departamentoByIdDepto;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNomEmp() {
        return nomEmp;
    }

    public void setNomEmp(String nomEmp) {
        this.nomEmp = nomEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadEmpleado that = (EntidadEmpleado) o;
        return Objects.equals(dni, that.dni) && Objects.equals(nomEmp, that.nomEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nomEmp);
    }

    public EntidadDepartamento getDepartamentoByIdDepto() {
        return departamentoByIdDepto;
    }

    public void setDepartamentoByIdDepto(EntidadDepartamento departamentoByIdDepto) {
        this.departamentoByIdDepto = departamentoByIdDepto;
    }
}
