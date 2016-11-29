public class main {


    public static void main(String[] args) {

        int[] ar = new int[20];

        System.out.print("Массив без сортировка: ");

        for (int i = 0; i < ar.length; i++) {
            ar[i] = (int) (Math.random()*101);
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        // после сортировки выбором
        selectsort(ar);

        // после сортировки пузырьком
        bubblesort(ar);
    }
    public static void selectsort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];                               // предполагаем что 1 элемент минимальный
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {        // ищем ест ли элемент меньше

                if (arr[j] < min) {                         // если есть сохраняем индекс
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {                               // меняем местами если элемент меньше
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        System.out.print("Сортировка выбором: ");
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");
        }
        System.out.println();
    }       // сортировка выбором
    public static void bubblesort(int[] arr){

        for(int i = arr.length-1 ; i > 0 ; i--){        // сокращаем фрагмент массива по длине
            for(int j = 0 ; j < i ; j++){               // переставляем в конец бОльший элемент фрагмента

                if( arr[j] > arr[j+1] ){                // сраниванием элементы попарно
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.print("Сортировка пузырьком: ");
        for (int q = 0; q < arr.length; q++) {
            System.out.print(arr[q] + " ");
        }
        System.out.println();
    }       // сортировка пузырьком
}

