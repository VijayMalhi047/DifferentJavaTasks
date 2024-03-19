import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lab13T2StringSorting {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> strings = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      System.out.println("Enter string " + (i + 1) + ": ");
      strings.add(scanner.nextLine());
    }

    Collections.sort(strings);
System.out.println("Here are the sorted strings");
    for (String string : strings) {
      System.out.println(string);
    }
  }
}