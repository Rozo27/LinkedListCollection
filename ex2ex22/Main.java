package ex2ex22;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> lista){
        ListIterator<Integer> it=lista.listIterator();
        while(it.hasNext()){
            Integer val=it.next();
            while (it.hasNext() && it.next()==val) {
                it.remove();
            }
            if(it.hasNext()==true)
                it.previous();

        }
        return lista;
    }
    public static LinkedList<Integer> removeAllDuplicates(LinkedList<Integer> lista){
        ListIterator<Integer> it=lista.listIterator();
        Integer val=it.next();
        while(it.hasNext()){
            boolean cond=true;

            while (it.hasNext() ) {
                int aux = it.next();
                if (val == aux) {
                    it.previous();
                    it.remove();
                    cond = false;
                } else if (!cond){
                    it.previous();
                    break;
                }
                val = aux;
            }
            if(cond==false){
                it.previous();
                it.remove();
            }


        }
        return lista;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        LinkedList<Integer> lista=new LinkedList<>(),lista2=new LinkedList<>();
        System.out.println("Introduceti n:");
        int n=sc.nextInt();
        System.out.println("Introduceti elementele din lista 1:");
        for(int i=0;i<n;i++)
            lista.add(sc.nextInt());
        lista=removeDuplicates(lista);
        System.out.println(lista);
        System.out.println("Introduceti elementele din lista 2:");
        for(int i=0;i<n;i++)
           lista2.add(sc.nextInt());
        lista2=removeAllDuplicates(lista2);
        System.out.println(lista2);
    }
}
