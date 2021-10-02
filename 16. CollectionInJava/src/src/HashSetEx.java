import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
    public static void main(String[] args)
    {
        //Creating hashset
        HashSet<String> set = new HashSet<>();

        // Adding elements into HashSet using add()
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        set.add("f");
        set.add("g");
        set.add("h");
        set.add("i");
        set.add("j");
        set.add("j");//Adding duplicate element
        set.add("d");//Adding duplicate element

        // Displaying the HashSet
        System.out.println(set);

        //Check whether set contains the value
        System.out.println("List contains India or not:" + set.contains("India"));

        set.remove("f");
        // Displaying the HashSet
        System.out.println(set);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());

        //Printing size of HashSet
        System.out.println("Size of set id : " + set.size());

        //checking whether set is empty
        System.out.println("whether set is empty : " + set.isEmpty());

        //Printing hashcode of set
        System.out.println("Hashcode of set : " + set.hashCode());
    }
}
