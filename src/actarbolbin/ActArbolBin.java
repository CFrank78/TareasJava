/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actarbolbin;

import javax.swing.JOptionPane;

/**
 *
 * @author manff
 */
public class ActArbolBin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0, elemento;
        String nombre;
        ArbolBinario arbol = new ArbolBinario();
        do {
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un Nodo\n" + 
                        "2.Recorrido InOrder\n" + "3.Recorrido PreOrder\n" + "4.Recorrido PostOrder\n" + "5.Salir\n"
                + "Eliger una Opcion" , "Arboles Binarios", JOptionPane.QUESTION_MESSAGE));
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero del Nodo",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE));
                        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Nodo", 
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento, nombre);
                        break;
                    case 2:
                        if (!arbol.estaVacia()) {
                            arbol.inOrder(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"Arbol Vacio", "Atencion", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 3:
                        if (!arbol.estaVacia()) {
                            arbol.preOrder(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"Arbol Vacio", "Atencion", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if (!arbol.estaVacia()) {
                            arbol.postOrder(arbol.raiz);
                        }else{
                            JOptionPane.showMessageDialog(null,"Arbol Vacio", "Atencion", 
                                JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null,"Aplicacion Finalizada", "Fin", 
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion Incorrecta", "Cuidado", 
                                JOptionPane.INFORMATION_MESSAGE);
                        
                }
            }catch(NumberFormatException n){
                JOptionPane.showMessageDialog(null, "error" + n.getMessage());
            }
        } while (opcion!=5);
    }
    
}
