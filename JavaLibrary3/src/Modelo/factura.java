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
public class factura extends boleta implements reporte {
    
    String razonSocial;
    String RUC;

    @Override
    public void mostrar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getRUC() {
        return RUC;
    }
    
    @Override
    public ArrayList<medicamento> getProductos() {
        return productos;
    }

    @Override
    public int getPrecioTotal() {
        return precioTotal;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getFecha() {
        return fecha;
    }

    @Override
    public Modelo.cliente getCliente() {
        return cliente;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    @Override
    public void setProductos(ArrayList<medicamento> productos) {
        this.productos = productos;
    }

    @Override
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public void setCliente(Modelo.cliente cliente) {
        this.cliente = cliente;
    }
}
