package src.com.vetias.java.workshop.workshop.basics.string;

public class Untitled2 {

public static void main(String[] args) {
    String str = "Hello, World!";
    String substring = str.substring(7, 12);
    System.out.println("Substring: " + substring); // Output: World
    System.out.println("Length of substring: " + substring.length()); // Output: 5

    String replacedStr = str.replace("World", "Java");
    System.out.println("Replaced String: " + replacedStr); // Output: Hello, Java!
    
    String upperCaseStr = str.toUpperCase();
    System.out.println("Uppercase String: " + upperCaseStr); // Output: HELLO, WORLD!
    
}
}
