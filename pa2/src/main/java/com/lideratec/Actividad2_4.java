package com.lideratec;


public class Actividad2_4 {

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
        Nodo actual = head;

        // Buscar el nodo con el dato 3
        while (actual != null && actual.dato != 3) {
            actual = actual.next;
        }

        if (actual != null) {
            Nodo nuevo = new Nodo(15);

            // Insertar después del nodo encontrado
            nuevo.next = actual.next;
            actual.next = nuevo;
        } else {
            System.out.println("Nodo no encontrado");
        }

        // Recorrer e imprimir la lista
        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}

