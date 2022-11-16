import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности Имени.

public class task2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        String workers = "Иван Иванов " + "Светлана Петрова " + "Кристина Белова " + "Анна Мусина " + "Анна Крутова " + "Иван Юрин " + "Петр Лыков " + "Павел Чернов " + "Петр Чернышов " +
                        "Мария Федорова " + "Марина Светлова " + "Мария Савина " + "Мария Рыкова " + "Марина Лугова " + "Анна Владимирова " + "Иван Мечников " + "Петр Петин " + "Иван Ежов ";
        String [] listWorkers = workers.split(" ");

        for(int i = 0; i < listWorkers.length; i++){
            if(map.containsKey(listWorkers[i])){
                map.replace(listWorkers[i], map.get(listWorkers[i])+1);
            } else {
                map.put(listWorkers[i], 1);
            }
        }
        System.out.println("Неотсортированный список: \n" + map);

        Map<String, Integer> newMap = new LinkedHashMap<>();
        int max = 1;
        for (int count : map.values()) {
            if (count > max){
                max = count;
            }
        }

        for (int i = max; i > 0; i--){
            for(Map.Entry<String, Integer> entry : map.entrySet()){
                String key = entry.getKey();
                if(map.get(key) == i){
                    newMap.put(key, map.get(key));
                }
            }
        }
        System.out.println("Отсортированный список: \n" + newMap);
    }
}
