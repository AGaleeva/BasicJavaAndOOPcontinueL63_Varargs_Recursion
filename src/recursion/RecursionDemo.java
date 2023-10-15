package recursion;

public class RecursionDemo {
    public static void main(String[] args) {
//        first(n, m);
        System.out.println("-------------------------------");
        recursivePrint2(3);

    }
    public static void first(int n, int m) {
        if (n < m) {
//            stop  -  базовый случай рекурсии, когда она не запускается дальше
            return;
        }
        first(n, m);
    }

//    печатает числа от указанного числа до нуля

    public static void recursivePrint2(int num) {
        if (num > 0) {
            recursivePrint2(num - 1);
            System.out.println(num);
        }  else  {
            System.out.println(0); // прямой порядок 0, 1, 2
        }
    }

//    20. recursivePrint2(2) num = 2;
//    21. 2 > 0 --> true
//    22. recursivePrint2(2 - 1)
//      20. recursivePrint2(1) num = 1
//      21. 1 > 0 --> true
//      22. recursivePrint2(1 - 1)
//          20. recursivePrint2(0) num = 0
//          21. 0 > 0 --> false
//          24.25. sout: распечатывается 0
//      23. sout: распечатывается 1
//    23. sout: распечатывается 2   ----> все строчки кода закрыты
}
