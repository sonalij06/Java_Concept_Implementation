import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args)
    {
        //Creating HashMap
        HashMap<Integer, String> map = new HashMap<>();

        //Inserting elements in HashMap
        map.put(101,"Sonali");
        map.put(102,"Vishal");
        map.put(103,"Sunil");
        map.put(104,"Rohan");
        map.put(105,"Aman");
        map.put(106,"Shubham");
        map.put(107,"Sachin");
        map.put(108,"Vaibhav");
        map.put(109,"Anmol");
        map.put(110,"Ritu");

        //Fetch the value of a Key
        System.out.println("Element at key 108 : " + map.get(108));

        //Create a clone/copy of HashMap
        System.out.println("Clone of map : " +  map.clone());

        //Check if the given Key is in the Map
        System.out.println("Check if the 105 Key is in the Map : " + map.containsKey(105));

        //Check if the value is in the Map
        System.out.println("Check if the Vishal value is in the Map : " + map.containsValue("Vishal"));

        //Check if the map is empty
        System.out.println("Check if the map is empty : " + map.isEmpty());

        //Print the size of the Map to the console
        System.out.println("The size of the Map : " + map.size());

        //Print all the Keys of the map to the console
        System.out.println("All the Keys of the map : " + map.keySet());

        //Remove a specific Key-value pair
        map.remove(108,"Vaibhav");
        System.out.println(map);

        //Copy all the elements of the Map to another Map
        HashMap<Integer, String > mp = new HashMap<>();//Another Map
        mp.putAll(map);
        System.out.println(map);
        System.out.println(mp);
    }
}
