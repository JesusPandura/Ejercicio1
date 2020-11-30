/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author DELL
 * @param <E>
 */
public class IterEnlazada <String> implements Iterador<String> {
    private Nodo<String> actual;
public IterEnlazada(Nodo<String> a) {
actual = a;
}
    @Override
    public boolean hasNext() {
return actual.getNext() != null;
}
    @Override
    public String next() {
if (hasNext()) {
actual = actual.getNext();
return actual.getInfo();
} else {
return null;
}
}
    
}
