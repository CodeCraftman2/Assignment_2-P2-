import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Address> treeMap = new TreeMap<>();

        treeMap.put("Ankit", new Address("Plot 51", "Street 1", "City 1"));
        treeMap.put("Ritik", new Address("Plot 49", "Street 2", "City 2"));

        Iterator<Map.Entry<String, Address>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Address> entry = iterator.next();
            System.out.println("Name: " + entry.getKey() + ", Address: " + entry.getValue());
        }
    }
}