package com.lideratec;


public class Actividad3_3 {

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
        int buscado = 13;

        if (head != null && head.dato == buscado) {
            head = head.next;
            System.out.println("Nodo eliminado correctamente");
        } else {
            Nodo anterior = head;
            Nodo actual = (head != null) ? head.next : null;

            while (actual != null && actual.dato != buscado) {
                anterior = actual;
                actual = actual.next;
            }

            if (actual != null) {
                anterior.next = actual.next;
                System.out.println("Nodo eliminado correctamente");
            } else {
                System.out.println("Dato no encontrado");
            }
        }

        // Mostrar la lista después de eliminar
        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}
