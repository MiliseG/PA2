package com.lideratec;


public class Actividad2_2 {

    static class Nodo {
        int dato;
        Nodo next;

        Nodo(int dato) {
            this.dato = dato;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Nodo n1 = new Nodo(29);
        Nodo n2 = new Nodo(3);
        Nodo n3 = new Nodo(4);

        n1.next = n2;
        n2.next = n3;

        Nodo head = n1;

        // Insertar un nuevo nodo al inicio
        Nodo nuevo = new Nodo(10);
        nuevo.next = head;
        head = nuevo;

        // Recorrer e imprimir la lista
        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
