package com.lideratec;


public class Actividad3_2 {

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
        Nodo n4 = new Nodo(13);
        Nodo n5 = new Nodo(21);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Nodo head = n1;
        Nodo actual = head;

        // Buscar el nodo con el dato 13
        while (actual != null && actual.dato != 13) {
            actual = actual.next;
        }
        if (actual != null) {
            actual.dato = 18;
            System.out.println("Dato modificado correctamente");
        } else {
            System.out.println("Dato no encontrado");
        }
        // Mostrar la lista actualizada
        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
