
# README — Evaluación

> **Curso:** ALGORITMO Y ESTRUCTURA DE DATOS BASADOS EN INTELIGENCIA ARTIFICIAL
> **Código:** 4682
> **Evaluación:** PA2
> **Equipo:** Grupo 3

## 1. Integrantes

| Integrante | Rol | Aporte principal |
|---|---|---|
| Milisé Garcia Quezada | Desarrollo de actividades 1, 2, 3, 4 | Aporte |
| Nombre 2 | Rol | Aporte |
| Nombre 3 | Rol | Aporte |
| Nombre 4 | Rol | Aporte |
| Nombre 5 | Rol | Aporte |

---

El trabajo fue realizado de manera individual porque mis compañeros de grupo nunca se comunicaron.

## 2. Descripción y objetivo

**Problema:**

La organización necesita gestionar solicitudes de atención que cambian constantemente, ya que pueden ingresar nuevos casos, eliminarse solicitudes existentes o requerirse la navegación entre ellas en distintos sentidos.

**Objetivo:**

Aplicar estructuras de datos dinámicas mediante listas enlazadas para representar y gestionar solicitudes de atención, implementando operaciones de recorrido, inserción, búsqueda, modificación y eliminación.

**Solución desarrollada:**

Se desarrollaron algoritmos en Java para trabajar con una lista enlazada simple y se analizaron las ventajas de utilizar listas doblemente enlazadas y circulares según las necesidades del caso. Además, se incluyeron representaciones gráficas y explicaciones de las operaciones realizadas.

## 3. Cómo ejecutar o revisar


## Actividad 1. Fundamentos y representación de listas enlazadas
1.1 Expliquen qué es una lista enlazada, cómo se clasifica y cuál es su representación gráfica básica.
Las listas enlazadas son estructuras de datos lineales dinámicas compuestas por nodos conectados mediante referencias. 
La representación gráfica básica de una lista enlazada consiste en utilizar cajas para representar los nodos y flechas para indicar las conexiones entre ellos.
Se clasifican en:
- Listas enlazadas simples.

 inicio                                                     último
   ↓                                                          ↓
+----+---+   +----+---+   +----+---+   +----+---+   +----+------+
| 29 | → | → | 03 | → | → | 04 | → | → | 13 | → | → | 21 | NULL |
+----+---+   +----+---+   +----+---+   +----+---+   +----+------+

- Listas enlazadas dobles.

 inicio                                                     último
   ↓                                                          ↓
 NULL <--> [ 29 ] <--> [ 03 ] <--> [ 04 ] <--> [ 13 ] <--> [ 21 ] <--> NULL

- Listas enlazadas circulares.

        [ 29 ] ----> [ 03 ] ----> [ 04 ] ----> [ 13 ] ----> [ 21 ]
          ↑                                                   |
          +---------------------------------------------------+


- Listas enlazadas doblemente circular.

          +---------------------------------------------------+
          |                                                   |
          ↓                                                   |
        [ 29 ] <--> [ 03 ] <--> [ 04 ] <--> [ 13 ] <--> [ 21 ]
          ↑                                                   |
          +---------------------------------------------------+



1.2 Elaboren una representación gráfica de una lista enlazada con al menos 5 nodos asociados al caso 
planteado.

 inicio                                                     último
   ↓                                                          ↓
+----+---+   +----+---+   +----+---+   +----+---+   +----+------+
| 17 | → | → | 33 | → | → | 15 | → | → | 87 | → | → | 21 | NULL |
+----+---+   +----+---+   +----+---+   +----+---+   +----+------+


## Actividad 2. Recorrido e inserción
2.1 Diseñen el algoritmo de recorrido completo de la lista.

public class Actividad2_1 {

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

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.next;
        }
    }
}



 Recorrido completo: se comienza desde el nodo inicial (head) y se avanza mediante la referencia next hasta llegar a null. No se modifica ningún nodo ni enlace.

2.2 Diseñen el algoritmo de inserción al inicio.

public class Actuvidad2_2 {

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

        Nodo nuevo = new Nodo(10);
        nuevo.next = head;
        head = nuevo;

        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}



Inserción al inicio: se crea un nuevo nodo con el dato 10. Su referencia next apunta al antiguo primer nodo y después head pasa a apuntar al nuevo nodo. La lista queda: 10 -> 29 -> 3 -> 4 -> null.

2.3 Diseñen el algoritmo de inserción al final.

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

        Nodo nuevo = new Nodo(50);
        Nodo actual = head;

        while (actual.next != null) {
            actual = actual.next;
        }

        actual.next = nuevo;

        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}


Inserción al final: se recorre la lista hasta encontrar el último nodo, cuyo next es null. Después, se enlaza ese nodo con el nuevo nodo que contiene 50. La lista queda: 29 -> 3 -> 4 -> 50 -> null.


2.4 Diseñen el algoritmo de inserción después de un nodo dado.

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

        while (actual != null && actual.dato != 3) {
            actual = actual.next;
        }

        if (actual != null) {
            Nodo nuevo = new Nodo(15);
            nuevo.next = actual.next;
            actual.next = nuevo;
        } else {
            System.out.println("Nodo no encontrado");
        }

        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}



Se busca el nodo con dato 3. El nuevo nodo, que contiene 15, apunta al nodo que antes seguía al 3; luego, el nodo 3 apunta al nuevo nodo. La lista queda: 29 -> 3 -> 15 -> 4 -> null.


Expliquen brevemente cómo cambia la estructura después de cada operación.


## Actividad 3. Lista enlazada simple: búsqueda, modificación y eliminación
3.1 Diseñen un algoritmo de búsqueda para localizar un nodo según un criterio definido por el equipo.

El criterio elegido es buscar un nodo por el valor numérico de su dato. En este ejemplo, se buscará el dato 13.


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



3.2 Diseñen un algoritmo para modificar un nodo encontrado.


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

        while (actual != null && actual.dato != 13) {
            actual = actual.next;
        }

        if (actual != null) {
            actual.dato = 18;
            System.out.println("Dato modificado correctamente");
        } else {
            System.out.println("Dato no encontrado");
        }

        actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}



3.3 Diseñen un algoritmo para eliminar un nodo y expliquen cómo se reajustan los enlaces.


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
        } else {
            Nodo anterior = head;
            Nodo actual = head.next;

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

        Nodo actual = head;

        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.next;
        }

        System.out.println("null");
    }
}



Para eliminar el nodo que contiene el dato `13`, se localizan el nodo que se desea eliminar y su nodo anterior. Luego, se actualiza la referencia `next` del nodo anterior para que apunte al nodo siguiente del eliminado.

Antes:

`29 -> 3 -> 4 -> 13 -> 21 -> null`

Después:

`29 -> 3 -> 4 -> 21 -> null`

El nodo `4` pasa a apuntar directamente al nodo `21`, por lo que el nodo `13` deja de formar parte de la secuencia enlazada. Si se elimina el primer nodo, se actualiza `head` para que apunte al segundo nodo.


3.4 Comparen la eficiencia básica de inserción y eliminación según el punto de intervención.

Operación	     Complejidad	   Explicación
Inserción al inicio	  O(1)	       Solo se actualiza la referencia head y el enlace del nuevo nodo.
Inserción al final	  O(n)	       Se recorre la lista hasta encontrar el último nodo, si no se mantiene una referencia al final.
Búsqueda de un nodo   O(n)	       En el peor caso, se revisan todos los nodos.
Eliminación de un nodo	O(n)	   Se busca el nodo y se reajustan los enlaces.
Recorrido completo	  O(n)	       Se visita cada nodo una vez.


## Actividad 4. Listas dobles y circulares
4.1 Planteen una situación del caso en la que convenga usar una lista doble.
Una lista doble sería conveniente cuando el personal necesite revisar las solicitudes de atención anteriores y posteriores. Por ejemplo, si está revisando una solicitud y necesita regresar a la anterior para comprobar información, podría hacerlo directamente mediante la referencia al nodo anterior.


4.2 Planteen una situación del caso en la que convenga usar una lista circular.
Una lista circular sería conveniente cuando la organización necesite revisar continuamente las solicitudes pendientes. Al llegar a la última solicitud, el recorrido regresaría a la primera para comenzar otra revisión.


4.3 Representen gráficamente ambas propuestas y justifiquen por qué son más adecuadas que una lista 
simple.

a. Lista doblemente enlazada
Representación gráfica:
NULL ← [29] ⇄ [03] ⇄ [04] ⇄ [13] ⇄ [21] → NULL


En esta lista, cada nodo tiene una referencia al anterior y otra al siguiente.
Es la más adecuada que una lista simple cuando se necesita avanzar y retroceder entre las solicitudes, porque permite recorrer la estructura en ambos sentidos. 

b. Lista enlazada circular
Representación gráfica:
       ┌────────────────────────────────────┐
       ↓                                    │
     [29] → [03] → [04] → [13] → [21] ──────┘


En esta lista, el último nodo apunta nuevamente al primero.
Es más adecuada cuando se necesita revisar las solicitudes repetidamente, porque el recorrido puede continuar desde el inicio después de llegar al último nodo, sin que la lista termine en null.



**Pasos de revisión:**
1. Ingresar al repositorio y localizar el archivo PA2.java.
2. Revisar la implementación de las actividades
3. Comparar los resultados obtenidos durante la ejecución con los valores esperados descritos en este README.

## 4. Evidencias

![Evidencia](imagenes/imagen2_1.png)
![Evidencia](imagenes/Imagen2_2.png)
![Evidencia](imagenes/Imagen2_3.png)
![Evidencia](imagenes/imagen2_4.png)
![Evidencia](imagenes/imagen3_!.png)
![Evidencia](imagenes/imagen3_3.png)
![Evidencia](imagenes/imagen3_2.png)
 
## 5. Matriz de participación

| Integrante | Desarrollo | Pruebas | Documentación | Exposición | Evidencia de participación |
|---|---|---|---|---|---|
| [Milisé GArcia Quezada] | [Alta] | [Alta] | [Alta] | [No] | [Desarrollo de las actividades 1, 2 ,3 ,4] |
| [Nombre 2] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Sí/No] | [Actividades 1, 2, 3, 4] |
| [Nombre 3] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Sí/No] | [Commits, avances, etc.] |
| [Nombre 4] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Sí/No] | [Commits, avances, etc.] |
| [Nombre 5] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Alta/Media/Baja] | [Sí/No] | [Commits, avances, etc.] |

## 6. Video de exposición

**Video público de YouTube:** No se realizó.

## 7. Conclusiones

1. Las listas enlazadas permiten organizar información y agregar o eliminar datos fácilmente.
2. Aprendim a recorrer, buscar, modificar e insertar datos dentro de una lista enlazada.
3. Comprendi que las listas simples, dobles y circulares se utilizan según las necesidades del problema, como avanzar, retroceder o revisar los datos continuamente.


**Última actualización:** [12/10/2026]