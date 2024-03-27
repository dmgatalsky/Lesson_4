
//14. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
// одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.

public class Lesson_414 {
    public static void main(String[] args) {
        int len = 3;
        int initialValue = 6;
        printArray(Array(len, initialValue));
    }
        public static int[] Array (int len, int initialValue){
            int array[] = new int[len];
            for (int i = 0; i < array.length; i++) {
                array[i] = initialValue;
            }
            return array;
        }
        public static void printArray (int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }