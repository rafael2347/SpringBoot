package modelo.dao;

import modelo.EntidadEmpleado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoDAO extends CrudRepository<EntidadEmpleado, String> {
    static final Logger logger = LoggerFactory.getLogger(IEmpleadoDAO.class);

    // Método para guardar un empleado
    EntidadEmpleado save(EntidadEmpleado empleado);

    // Otros métodos de la interfaz, si los necesitas

    // Ejemplo de uso del logger en un método default (si estás usando Java 8 o superior)
    default void logExito() {
        logger.info("La acción se ha realizado con éxito");
    }
}
