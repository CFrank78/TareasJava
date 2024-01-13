/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actarbolbin;

/**
 *
 * @author manff
 */
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoIzqierdo, hijoDerecho;
    public NodoArbol(int d, String nom){
    this.dato = d;
    this.nombre = nom;
    this.hijoDerecho = null;
    this.hijoIzqierdo = null;
    }
    
    public String toString(){
        return nombre + "Su Dato es " + dato;
    }
}
