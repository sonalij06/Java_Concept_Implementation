import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
    public static void main(String[] args)
    {
        //Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();

        //Adding 10 elements to ArrayList
        arrayList.add("ab");
        arrayList.add("cd");
        arrayList.add("ef");
        arrayList.add("gh");
        arrayList.add("ij");
        arrayList.add("kl");
        arrayList.add("mn");
        arrayList.add("op");
        arrayList.add("qr");
        arrayList.add("st");

        //Iterating through ArrayList using Iterator
        Iterator<String> it = arrayList.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //Adding element at index
        arrayList.add(1, "uv");

        //Printing array list
        System.out.println(arrayList);

        //Removing eleement at index
        arrayList.remove(6);

        //Printing array list
        System.out.println(arrayList);

        //Updating element at index
        arrayList.set(0,"xx");

        //Printing array list
        System.out.println(arrayList);

        //Check presence of element at particular index
        String key = "sp";
        int index = 9;
        String  element = (String) arrayList.get(index);
        if(element.equals(key))
        {
            System.out.println(key + "is present at " + index);
        }
        else
            System.out.println("NO");

        //Get an element at a particular index
        String  ele = (String) arrayList.get(5);
        System.out.println("Get an element at a particular index : " + ele);

        //Find out the size of the ArrayList
        System.out.println("Size of Array List is : " + arrayList.size());

        //Check the given element is present in the ArrayList
        System.out.println("Check the given element is present in the ArrayList : " + arrayList.contains("sona"));

        //Remove all elements of the ArrayList
        arrayList.clear();

        //Printing array list
        System.out.println(arrayList);
    }

}
