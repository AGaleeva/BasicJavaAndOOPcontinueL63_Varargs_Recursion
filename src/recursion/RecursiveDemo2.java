package recursion;
public class RecursiveDemo2 {
    public static void main(String[] args) {
        recursivePrint(2);
    }
    public static void recursivePrint(int num) { // распечатает цифры в обратном порядке: 2, 1, 0
        if (num == 0) {                // базовый случай - условие выхода
            System.out.println(0);
            return;
        }
        System.out.println(num);
        recursivePrint(num - 1); // (num - 1) - шаг рекурсии
    }

//    4. recursivePrint(2)
//    6.  num = 2
//    7. (2 == 0) --> false
//    11. sout num, который равен в этом scope 2
//    12. recursivePrint(2 - 1)
//    открывается новый scope
//      6. num = 1
//      7. 1 == 0 --> false
//      11. sout num, который равен в этом scope 1
//      12. recursivePrint(1 - 1)
//          6. num == 0
//          7. 0 == 0 --> true и это базовый случай
//          8. sout num, который равен в этом scope 0
//          9. return - выпадаем из метода recursivePrint(0)
//    программа дошла до конца
}
