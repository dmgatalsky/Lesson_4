
//12. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
// и числа меньшие 6 умножить на 2;
public class Lesson_412 {
    public static void main(String[]args){
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i=0; i<array.length;i++){
            if (array[i]<6)  array[i] = array[i]*2;
            }
        for (int i = 0; i < array.length; i++) {        //проверка
            System.out.print(array[i] + " ");
        }

    }
}

