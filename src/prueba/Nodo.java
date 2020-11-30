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
public class Nodo <String>{
    private String info;
private Nodo<String> next;
public Nodo(String info, Nodo<String> next){
this.info=info;
this.next=next;
}
public Nodo(String info){
this(info, null);
}
// metodos get y set...

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Nodo<String> getNext() {
        return next;
    }

    public void setNext(Nodo<String> next) {
        this.next = next;
    }
}
