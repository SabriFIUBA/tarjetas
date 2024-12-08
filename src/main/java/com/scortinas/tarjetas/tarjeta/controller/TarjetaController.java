package com.scortinas.tarjetas.tarjeta.controller;

//import com.scortinas.tarjetas.tarjeta.domain.Tarjeta;
import com.scortinas.tarjetas.tarjeta.service.TarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;


@Component
public class TarjetaController {
    

    @Autowired
    private TarjetaService service;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Alta\n2. Baja\n3. Modificación\n4. Mostrar todos\n5. Salir");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> addTarjeta(scanner);
                case 2 -> deleteTarjeta(scanner);
                case 3 -> updateTarjeta(scanner);
                case 4 -> listTarjetas();
                case 5 -> System.exit(0);
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }

    private void addTarjeta(Scanner scanner) {
        System.out.print("Ingrese el nombre de la tarjeta: ");
        String name = scanner.next();
        service.addTarjeta(name);
        System.out.println("Tarjeta agregada.");
    }

    private void deleteTarjeta(Scanner scanner) {
        System.out.print("Ingrese el ID de la tarjeta: ");
        Long id = scanner.nextLong();
        service.deleteTarjeta(id);
        System.out.println("Tarjeta eliminada.");
    }

    private void updateTarjeta(Scanner scanner) {
        System.out.print("Ingrese el ID de la tarjeta: ");
        Long id = scanner.nextLong();
        System.out.print("Ingrese el nuevo nombre: ");
        String name = scanner.next();
        service.updateTarjeta(id, name);
        System.out.println("Tarjeta actualizada.");
    }

    private void listTarjetas() {
        System.out.println("Listado de tarjetas:");
        service.getAllTarjetas().forEach(System.out::println);
    }
    

}
