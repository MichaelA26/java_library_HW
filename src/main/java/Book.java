import java.util.HashMap;

public class Book {
    public static void main(String[] args) {
        HashMap<String, String> books = new HashMap<String, String>();

        books.put("I Have No Mouth and I Must Scream", "Harlan Ellison");
        books.put("Girl In A Band", "Kim Gordon");
        books.put("From Russia With Love", "Ian Fleming");

        System.out.println(books.get("Girl In A Band"));
    }
}