package org.example.springboot;

import modelo.dao.IEmpleadoDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // Ejemplo de uso de la interfaz IEmpleadoDAO
    private IEmpleadoDAO IEmpleadoDAO;


}
