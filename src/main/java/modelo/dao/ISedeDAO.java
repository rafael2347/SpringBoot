package modelo.dao;

import modelo.EntidadSede;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ISedeDAO<EntidadSed> extends CrudRepository<EntidadSed, Integer> {
}