/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 * @param <String> 
 */
public interface Lista <String>{
    // añadir un objeto de tipo E en la posición index de la lista
void add(int index, String element) throws PosicIncE;
// añadir un objeto de tipo E al final de la lista
void add(String element);
// eliminar el elemento que está en la posición index, lo devuelve
void remove(int index) throws PosicIncE;
//eliminar el objeto x de la lista

void remove(String x) throws ElemNoEncE;
// contiene la lista el objeto x?
boolean contains(String x);
//obtener el objeto que está en la posición index
String get(int index) throws PosicIncE;




// obtener el índice en el que está el objeto x
int getIndex(String x);
// poner en la posicion index el elemento (cambia el que está)
void set(int index, String element) throws PosicIncE;
// eliminar todos los elementos de la lista, limpiarla
void clear();
// obtener un iterador de la lista
Iterador iter();
// obtener el tamaño de la lista.
int size();
// está la lista vacía?
boolean isEmpty();
}
