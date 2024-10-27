/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author josue
 */
public class medicamento {
    int idMedicamento;
    String nombre;
    double precio;
    int stock;
    String viaAdministrativa;
    String info;
    String imagen;
    String fechaVenc;

    public medicamento(int idMedicamento, String nombre, double precio, int stock, String viaAdministrativa, String info, String imagen, String fechaVenc) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.viaAdministrativa = viaAdministrativa;
        this.info = info;
        this.imagen = imagen;
        this.fechaVenc = fechaVenc;
    } 
    
    public double consultarPrecio(String nombre){
        return precio;
    }
    
    public int consultarStock(String nombre){
        return stock;
    }
}
