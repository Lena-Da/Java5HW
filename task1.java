import java.util.HashMap;
import java.util.List;

//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

public class task1 {

    public static HashMap<String, List<String>> phBook = new HashMap<>();
    public static void main(String[] args) {
        addPhone();
        searchBook("Sergey");
    }

    public static void addPhone() {
        phBook.put("Sergey", List.of("+79119883377", "+79213334466"));
        phBook.put("Ivan", List.of("+79119883387", "+79223334466"));
        phBook.put("Elena", List.of("+79119883337", "89233334466"));
        phBook.put("Tatyana", List.of("+79119883327", "+79243334466"));
        phBook.put("Igor", List.of("89119883317", "+79253334466"));
        phBook.put("Yaroslav", List.of("+79119883307", "+79263334466"));
    }

    public static void searchBook(String name) {
        System.out.printf("%s: %s", name, phBook.get(name));
    }
}