[# PlurasightHw](https://www.youtube.com/watch?v=QvHBHuuddYk




ArrayList:
It's like a resizable list where you can add, remove, and access items.
Used for storing a collection of items in Java.
Example:
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
String fruit = list.get(0); // Access the first item

HashSet:
It's a set that ensures unique elements; no duplicates are allowed.
Used when you need to keep a collection of distinct items.
Example:

HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1); // Ignored because it's a duplicate
Comparator:
It's a tool to help you compare and sort objects that don't have a natural order.
You create a custom comparison rule and use it for sorting.
Example:

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}
Comparable:
It's a way for objects to define their own natural order.
Objects implement the Comparable interface and define how they should be compared.
Example:

class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}
In a nutshell, ArrayList and HashSet are for storing collections of items, while Comparator and Comparable are used
 for customizing how items are compared or sorted in Java.)https://www.youtube.com/watch?v=QvHBHuuddYk




ArrayList:
It's like a resizable list where you can add, remove, and access items.
Used for storing a collection of items in Java.
Example:
ArrayList<String> list = new ArrayList<>();
list.add("Apple");
list.add("Banana");
String fruit = list.get(0); // Access the first item

HashSet:
It's a set that ensures unique elements; no duplicates are allowed.
Used when you need to keep a collection of distinct items.
Example:

HashSet<Integer> set = new HashSet<>();
set.add(1);
set.add(2);
set.add(1); // Ignored because it's a duplicate
Comparator:
It's a tool to help you compare and sort objects that don't have a natural order.
You create a custom comparison rule and use it for sorting.
Example:

class CustomComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.length() - str2.length();
    }
}
Comparable:
It's a way for objects to define their own natural order.
Objects implement the Comparable interface and define how they should be compared.
Example:

class Person implements Comparable<Person> {
    private String name;

    @Override
    public int compareTo(Person otherPerson) {
        return this.name.compareTo(otherPerson.name);
    }
}
In a nutshell, ArrayList and HashSet are for storing collections of items, while Comparator and Comparable are used
 for customizing how items are compared or sorted in Java.
