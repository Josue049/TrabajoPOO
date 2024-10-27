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
}
