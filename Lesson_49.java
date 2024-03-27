
//9. Напишите метод, который определяет, является ли год високосным, и возвращает boolean
// (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный.


public class Lesson_49 {
    public static void main(String[] args) {
        int year = 4;
        boolean a;
        if ((!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))) a = false;
        else a = true;
        {
            System.out.println(a);}

    }

}


