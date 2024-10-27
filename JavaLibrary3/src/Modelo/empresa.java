/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author josue
 */
public abstract class empresa {
    String nombre;
    String RUC;
    String direccion;
    String telefono;
    String delivery;

    public String getNombre() {
        return nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }
}