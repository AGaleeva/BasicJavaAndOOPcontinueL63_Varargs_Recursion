package homework63;

public class RecursionNatNumbers {
    /*
    Задание 1 рекурсия
    Дано натуральное число n. Выведите все числа от 1 до n.
    Иными словами, метод должен принимать натуральное число и выводить числа от 1 до это числа.
    Например, для параметра 6 -> выведет 1 2 3 4 5 6
    */

    public static void main(String[] args) {

        naturalNumbersPrint(10);
    }

    public static void naturalNumbersPrint(int num) {
        if (num > 1) {
            naturalNumbersPrint(num - 1);
            System.out.print(num + "\t");
        } else System.out.print(1 + "\t");
    }
}
