
//6. Напишите метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
// положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
public class Lesson_46 {
    public static void main(String[] args){
        int a=0;
        metod(a);
    }
    public static void metod(int a){
        if(a<0){
            System.out.println("отрицательное");
        }
        if(a>=0){
            System.out.println("положительное");
        }
    }
}
