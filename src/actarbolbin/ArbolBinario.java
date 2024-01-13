/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actarbolbin;

/**
 *
 * @author manff
 */
public class ArbolBinario {
    NodoArbol raiz;
    public ArbolBinario(){
        raiz = null;
    }
    
    // Metodo para insertar un nodo
    
    public void agregarNodo (int d, String nom){
        NodoArbol nuevo = new NodoArbol (d, nom);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol auxiliar = raiz;
            NodoArbol padre; 
            while(true){
                padre = auxiliar;
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hijoIzqierdo;
                    if(auxiliar == null){
                        padre.hijoIzqierdo = nuevo;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //Metodo para saber si arbol vacio
    public boolean estaVacia(){
        return raiz == null;
    }
    // Metodo para recorrer arbol inorder
    public void inOrder(NodoArbol r){
        if (r != null) {
            inOrder(r.hijoIzqierdo);
            System.out.println(r.dato + " - " + r.nombre);
            inOrder(r.hijoDerecho);
        }
    }
    
    public void preOrder(NodoArbol r){
        if (r != null) {
            System.out.println(r.dato + " - " + r.nombre);
            preOrder(r.hijoIzqierdo);           
            preOrder(r.hijoDerecho);
        }
    }
    
    public void postOrder(NodoArbol r){
        if (r != null) {
            postOrder(r.hijoIzqierdo);           
            postOrder(r.hijoDerecho);
            System.out.println(r.dato + " - " + r.nombre);
        }
    }
}
