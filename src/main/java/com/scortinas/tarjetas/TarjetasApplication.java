package com.scortinas.tarjetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.scortinas.tarjetas.tarjeta.controller.TarjetaController;

@SpringBootApplication
public class TarjetasApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TarjetasApplication.class, args);

        // Obtener el controlador y ejecutar el menú
        TarjetaController consoleController = context.getBean(TarjetaController.class);
        consoleController.run();
    }
}
