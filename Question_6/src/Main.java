import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("TreeSet: " + treeSet);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to search in the TreeSet:");
        int number = scanner.nextInt();

        if (treeSet.contains(number)) {
            System.out.println("The number " + number + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + number + " is not present in the TreeSet.");
        }

        System.out.println("Enter a number to remove from the TreeSet:");
        int numberToRemove = scanner.nextInt();
        treeSet.remove(numberToRemove);

        System.out.println("TreeSet after removal: " + treeSet);
    }
}