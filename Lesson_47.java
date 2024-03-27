
//7. Напишите метод, которому в качестве параметра передается целое число. Метод должен вернуть
// true, если число отрицательное, и вернуть false если положительное.
public class Lesson_47 {
    public static void main(String[] args){
        int a= -1;
        metod(a);

    }
    public static void metod(int a){
        boolean A =a<0;
        System.out.println(A);
    }

}
