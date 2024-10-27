/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.ArrayList;

/**
 *
 * @author josue
 */
public abstract class boleta implements reporte{
    ArrayList<medicamento> productos;
    int precioTotal;
    String codigo;
    String fecha;
    cliente cliente;

    public ArrayList<medicamento> getProductos() {
        return productos;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public cliente getCliente() {
        return cliente;
    }

    public void setProductos(ArrayList<medicamento> productos) {
        this.productos = productos;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setCliente(cliente cliente) {
        this.cliente = cliente;
    }
}
