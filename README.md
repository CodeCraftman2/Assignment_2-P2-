# Generics and Collections

This document outlines various programming tasks related to generics and collections in Java. These tasks were assigned in the CSW2 (CSE3141) subject session from February 2024 to April 2024 for the CSE&CSIT branch, applicable to all sections.

## Task 1

Create a generic class `Pair<K,V>` with private variables `key` and `value`. The class `Pair` should define a parameterized constructor and getter and setter methods for these attributes. After addition of objects, the main class should retrieve and print the pair of key and value.

## Task 2

Write a Java code snippet that comprises a `User` class and an `ArrayListUser` class. The `User` class should define private fields for `name` and `age`, along with a parameterized constructor and getter/setter methods for these attributes. Create an `ArrayListUser` class of `User` objects. After addition of objects, the `ArrayListUser` class should retrieve and print the name and age of users. Then, it should sort the user according to age using getter methods and print the updated array list of users.

## Task 3

Write a Java code snippet that comprises a `Car` class and a `CarApp` class. The `Car` class should define private fields for `ModalNo` (int), `name` (string), and `stock` (int). Define a parameterized constructor and override the `compareTo` method as `public int compareTo(Car car)` to sort the car on the basis of the total number of stock. Create an `ArrayList` of `Car` objects and print the updated sorted list.

## Task 4

Create a class `Student` having member variables `name`, `age`, and `mark` and required getter and setter methods. Create a `LinkedList` of `Student` type and perform the below operations on it:
- Display the list
- Ask the user to enter a `Student` object and print the existence of the object. Specify if the object is searched according to reference or contains.
- Remove a specified `Student` object.
- Count the number of objects present in the list.
- Override `equals` method checking if the two `Student` objects share all the same values.

## Task 5

Create a class `Book` that has `id`, `name`, `author`, and `quantity` for each book issued. The `Book` class should define a parameterized constructor. Design a class `Library` that creates a `HashMap` of books which contains an entry of key as `Integer` and value as `Book` object. Instantiate at least two `Book` objects and display the collection of books in the `HashMap`. Use proper methods of `HashMap` class to return the following:
- Check if a particular book name is present in the map
- Remove the value associated with a particular key value which will remove the book entry.

## Task 6

Write a program to create a `TreeSet` of `Integer` type and perform the below operations on it:
- Display the `TreeSet`
- Ask the user to enter a number and search if that number is present in the list or not.
- Remove an element from the tree.

## Task 7

Write a Java code that comprises of a class `Address`, having member variables `plot no`, `at`, `post` and required parameterized constructor. Create a `TreeMap` having keys as the name of a person and value as an address. Insert required key and value in the created tree map and use an iterator to display it.

## Task 8

Find if two strings are anagrams, where an anagram is a word or phrase formed by reordering the letters of another word or phrase. Declare two strings `str1` and `str2` and initialize. Create a `HashMap<Character, Integer>` and use methods `containsKey()`, `put()`, `get()` to check the strings.

## Task 9

Given an array of integers, print the repeating integers in the array with the help of a `HashSet`.

## Task 10

In a given large string, find the most occurring words in the string. Steps:
- Create a `Hashtable` which will keep track of `<word, frequency>`.
- Iterate through the string and keep track of word frequency by inserting into the Hashtable.
- When encountering a new word, insert it into the Hashtable with frequency 1. For all repetitions of the word, increase the frequency.
- Keep track of the most occurring words.

## Task 11

Given an unsorted array of integers from 1 to 10, find the smallest positive number missing in the array. Use a hash map `HashMap<Integer, Integer>` to keep track of elements.

## Task 12

Declare an array of integers `int[] arr = {1,2,10,8,7,3,4,6,5,9};`. Then create a min heap of elements from the array using `PriorityQueue` class. Dequeue elements of Priority Queue using appropriate methods.
