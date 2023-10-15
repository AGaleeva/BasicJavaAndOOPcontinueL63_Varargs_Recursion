package homework63;

public class Palindrome {
    /*
    Задание 2 рекурсия (супер опциональное)
    Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.
    Выведите yes, если является и no - если не является.

    P.S. Палиндром - это слово, которое одинаково читается слева направо, например: око, потоп.
    */
    public static void main(String[] args) {

        System.out.println(palindromeOrNo("radar"));
    }

    public static String palindromeOrNo(String str) {
        if (str.isEmpty() || str.length() == 1) {
            return "yes";
        } else if (!(str.charAt(0) == str.charAt(str.length() - 1))) {
            return "no";
        }
//        String res = palindromeOrNo(str.substring(1, str.length() - 1));
        return palindromeOrNo(str.substring(1, str.length() - 1));
    }
}
