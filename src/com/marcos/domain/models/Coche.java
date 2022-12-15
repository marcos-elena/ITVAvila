package com.marcos.domain.models;

public class Coche implements Vehiculo{
    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private String annoMatriculacion;
    private Integer numeroPuertas;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnnoMatriculacion(String annoMatriculacion) {
        this.annoMatriculacion = annoMatriculacion;
    }

    @Override
    public String getMatricula() {
        return matricula;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getAnnoMatriculacion() {
        return annoMatriculacion;
    }

    public Integer getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(Integer numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}
