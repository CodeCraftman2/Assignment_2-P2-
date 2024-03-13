class Pair<K, V> {
    private K key;
    private V value;
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
}
public class Question_1 {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("One", 1);
        Pair<String, Double> pair2 = new Pair<>("Pi", 3.14);
        Pair<Character, String> pair3 = new Pair<>('A', "Apple");

        printPair(pair1);
        printPair(pair2);
        printPair(pair3);
    }
    public static <K, V> void printPair(Pair<K, V> pair) {
        System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
    }
}
