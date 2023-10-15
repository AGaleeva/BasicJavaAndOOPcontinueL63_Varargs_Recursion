package varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class VarargsDemo {
    public static void main(String[] args) {
        print("apple");
        print("apple", "orange");
        print("apple", "orange", "pear");

        System.out.println(sumArguments(2, 4, 6));

        List<String> list = getListOfStrings("apple", "orange", "pear");
        System.out.println(list);
        list.add("mango");
        System.out.println(list);
    }

//    Создайте метод, который принимает произвольное кол-во интов, а возвращает их сумму
//    назвать метод sumArguments   // sumArguments(1, 2) --> 3
    public static void print(String...args) {
//      работать с этим методом (varargs) придется как с массивом
        for (String arg : args){
            System.out.println(arg);
        }
    }
    public static int sumArguments(int...numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /*public static List<String> getListOfStrings(String...args) {
        List<String> res = new ArrayList<>();
        for (String str : args) {
            res.add(str);
        }
        return res;
    }*/

    public static List<String> getListOfStrings(String...args) {
        return new ArrayList<>(Arrays.asList(args));
    }

    public static String getStringOfSpecifiedLength(int length, String...args) {
        for (String str : args) {
            if (str.length() == length) return str;
        } return null;
    }

    public static Optional<String> getStringOptionalOfSpecifiedLength(int length, String...args) {
        for (String str : args) {
            if (str.length() == length) return Optional.of(str);
        } return Optional.empty(); // Optional.ofNullable(null); - первый вариант предпочтителен
    }
}
