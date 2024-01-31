package modelo.dao;

import modelo.EntidadDepartamento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IDepartamentoDAO<EntidadSed> extends CrudRepository<EntidadSed, Integer> {
}
