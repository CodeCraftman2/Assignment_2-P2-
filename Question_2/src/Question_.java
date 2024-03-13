import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
class ArrayListUser {
    private ArrayList<User> users;
    public ArrayListUser() {
        this.users = new ArrayList<>();
    }
    public void addUser(User user) {
        users.add(user);
    }
    public void printUsers() {
        System.out.println("Users:");
        for (User user : users) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }
    public void sortByAge() {
        Collections.sort(users, Comparator.comparingInt(User::getAge));
    }
}
public class Question_ {
    public static void main(String[] args) {
        ArrayListUser arrayListUser = new ArrayListUser();

        arrayListUser.addUser(new User("Aman", 25));
        arrayListUser.addUser(new User("Ankit", 30));
        arrayListUser.addUser(new User("Yagya", 20));

        System.out.println("Before Sorting:");
        arrayListUser.printUsers();

        arrayListUser.sortByAge();

        System.out.println("\nAfter Sorting:");
        arrayListUser.printUsers();
    }
}
