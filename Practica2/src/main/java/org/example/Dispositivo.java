package org.example;

public class Dispositivo {
    private String marca;
    private float precio;
    private String tipo;
    private String modelo;

    public Dispositivo(String marca, float precio, String tipo, String modelo) {
        this.marca = marca;
        this.precio = precio;
        this.tipo = tipo;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}