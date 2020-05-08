package ex1;

import java.util.LinkedList;
import java.util.ListIterator;

public class OrderedList {
    private LinkedList<Town> orase=new LinkedList<>();
    ListIterator<Town> i=orase.listIterator();
    public boolean addInOrder(Town element) {
        i=orase.listIterator();
        while (i.hasNext()) {

            boolean cond=i.next().equals(element);
            if(cond==true)
                return false;
            i.previous();
            if (i.next().getKm() > element.getKm()) {
//                System.out.println("am ajuns aici");
                i.previous();
                i.add(element);
                return true;
            }
        }
        i.add(element);
//        System.out.println("am ajuns acolo");
        return true;
    }
    public void print(){
        i=orase.listIterator();
        while(i.hasNext()){
            System.out.print(i.next().getName()+" ");
            i.previous();
            System.out.println(i.next().getKm());
        }
    }
}
