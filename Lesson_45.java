
//5. Напишите метод, принимающий на вход два целых числа и проверяющий, что их
// сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
public class Lesson_45 {
    public static void main(String[]args){
        int a=10;
        int b=4;
        metod(a,b);
    }

    private static void metod(int a, int b) {
        int c=a+b;
          if(c>10) {
            if (c <= 20) {
                System.out.println("true");
            }else {System.out.println("false");}
        }else {System.out.println("false");}




    };


    }
