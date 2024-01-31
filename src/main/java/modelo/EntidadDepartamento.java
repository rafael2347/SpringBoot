package modelo;

import java.util.Collection;
import java.util.Objects;

public class EntidadDepartamento {
    private int idDepto;
    private String nomDepto;
    private EntidadSede sedeByIdSede;
    private Collection<EntidadEmpleado> empleadosByIdDepto;

    public int getIdDepto() {
        return idDepto;
    }

    public void setIdDepto(int idDepto) {
        this.idDepto = idDepto;
    }

    public String getNomDepto() {
        return nomDepto;
    }

    public void setNomDepto(String nomDepto) {
        this.nomDepto = nomDepto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadDepartamento that = (EntidadDepartamento) o;
        return idDepto == that.idDepto && Objects.equals(nomDepto, that.nomDepto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDepto, nomDepto);
    }

    public EntidadSede getSedeByIdSede() {
        return sedeByIdSede;
    }

    public void setSedeByIdSede(EntidadSede sedeByIdSede) {
        this.sedeByIdSede = sedeByIdSede;
    }

    public Collection<EntidadEmpleado> getEmpleadosByIdDepto() {
        return empleadosByIdDepto;
    }

    public void setEmpleadosByIdDepto(Collection<EntidadEmpleado> empleadosByIdDepto) {
        this.empleadosByIdDepto = empleadosByIdDepto;
    }
}
