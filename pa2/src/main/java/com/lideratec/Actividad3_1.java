package com.lideratec;


public class Actividad3_1 {

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

        int buscado = 13;
        boolean encontrado = false;

        // Buscar el dato indicado
        while (actual != null) {
            if (actual.dato == buscado) {
                System.out.println("Dato encontrado: " + actual.dato);
                encontrado = true;
                break;
            }
            actual = actual.next;
        }
        if (!encontrado) {
            System.out.println("Dato no encontrado");
        }
    }
}
