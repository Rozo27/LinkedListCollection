package ex1;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

public class Town {
    private String name;
    private int km;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return km == town.km && Objects.equals(name, town.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, km);
    }


    public Town(String name, int km){
        this.name=name;
        this.km=km;
    }
    public int getKm(){
        return this.km;
    }
    public String getName(){
        return this.name;
    }




}
