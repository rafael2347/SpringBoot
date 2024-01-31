package modelo;

import java.util.Collection;
import java.util.Objects;

public class EntidadSede {
    private int idSede;
    private String nomSede;
    private Collection<EntidadDepartamento> departamentosByIdSede;

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    public String getNomSede() {
        return nomSede;
    }

    public void setNomSede(String nomSede) {
        this.nomSede = nomSede;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EntidadSede that = (EntidadSede) o;
        return idSede == that.idSede && Objects.equals(nomSede, that.nomSede);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSede, nomSede);
    }

    public Collection<EntidadDepartamento> getDepartamentosByIdSede() {
        return departamentosByIdSede;
    }

    public void setDepartamentosByIdSede(Collection<EntidadDepartamento> departamentosByIdSede) {
        this.departamentosByIdSede = departamentosByIdSede;
    }
}
