package ex1;

import java.util.LinkedList;

public class Ex1 {

    public static void main(String[] args) {
        OrderedList orase=new OrderedList();
        Town element;
        element=new Town("Timisoara", 100);
        orase.addInOrder(element);
        element=new Town("Arad", 150);
        orase.addInOrder(element);
        element=new Town("Bucuresti", 0);
        orase.addInOrder(element);
        element=new Town("Ploiesti", 30);
        orase.addInOrder(element);
        orase.print();

    }
}
