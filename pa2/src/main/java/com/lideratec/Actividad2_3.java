package com.lideratec;


public class Actividad2_3 {

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

        // Crear el nuevo nodo
        Nodo nuevo = new Nodo(50);

        // Buscar el último nodo
        Nodo actual = head;

        while (actual.next != null) {
            actual = actual.next;
        }

        // Enlazar el último nodo con el nuevo
        actual.next = nuevo;

        // Recorrer e imprimir la lista
        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
