package com.marcos.presentation;

import com.iesam.itvavila.demo.presentation.DemoMain;
import com.marcos.domain.models.Camion;
import com.marcos.domain.models.Coche;
import com.marcos.domain.models.Inspeccion;
import com.marcos.domain.models.Propietario;

public class Main {

    public static void main() {
        //Añadir datos a propietario
        Propietario propietario = new Propietario();
        propietario.setDni("70838846L");
        propietario.setNombre("Marcos");
        propietario.setApellidos("Elena");
        propietario.setDireccion("Calle Castilla");
        propietario.setProvincia("Avila");
        propietario.setPoblacion("Avila");
        propietario.setTelefono("666666666");

        Camion camion = new Camion();
        camion.setMatricula("4732 LGD");
        camion.setMarca("Volvo");
        camion.setModelo("37683764");
        camion.setColor("Blanco");
        camion.setAnnoMatriculacion("2022");
        camion.setTara(20000);
        camion.setLongitud(6);

        Coche coche = new Coche();
        coche.setMatricula("3222 LGD");
        coche.setMarca("Audi");
        coche.setModelo("R8");
        coche.setColor("Rojo");
        coche.setAnnoMatriculacion("2020");
        coche.setNumeroPuertas(2);

        Inspeccion inspeccion = new Inspeccion();
        inspeccion.setCodigo(1);
        inspeccion.setFecha("10/10/2022");
        inspeccion.setResultado(true);
        inspeccion.setVehiculo(camion);
        inspeccion.setPropietario(propietario);

        System.out.println("codigo"+inspeccion.getCodigo());
        System.out.println("fecha"+inspeccion.getFecha());
        System.out.println("resultado"+inspeccion.getResultado());
        System.out.println("vehiculo"+inspeccion.getVehiculo());
        System.out.println("propietario"+inspeccion.getPropietario());
    }
}
