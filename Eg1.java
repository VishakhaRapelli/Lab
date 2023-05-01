package String;
public class Eg1 {
	public static void main(String[] args) {
	 String str = "Welcome to Java World";

     // Returns the character at 5th position and display it.
     char ch = str.charAt(4);
     System.out.println("Character at position 5: " + ch);

     // Compares the above String with "Welcome" lexicographically ignoring case differences and display the result.
     String str2 = "Welcome";
     int compare = str.compareToIgnoreCase(str2);
     System.out.println("Comparison result with 'Welcome': " + compare);

     // Concatenates "- Let us learn" to the above string and display it.
     String str3 = str.concat("- Let us learn");
     System.out.println("Concatenated string: " + str3);

     // Returns the position of the first occurrence of character 'a' and display it.
     int index = str.indexOf('a');
     System.out.println("Index of first 'a': " + index);

     // Replaces all the occurrences of 'a' character with the new 'e' and display it.
     String str4 = str.replace('a', 'e');
     System.out.println("Replaced string: " + str4);

     // Returns string between 4th position and 10th position and display it.
     String str5 = str.substring(3, 10);
     System.out.println("Substring: " + str5);

     // Returns the lowercase of the string and display it.
     String str6 = str.toLowerCase();
     System.out.println("Lowercase string: " + str6);
 }
}


