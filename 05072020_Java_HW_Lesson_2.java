package ru.geekbrains.Lesson_2_HW;

public class Main {

    public static void main(String[] args) {
        int[] massive = {1, 1, 0, 0, 1, 0, 1, 1, 0, 1};
        int maxMassive = massive.length;

        for (int i = 0; i < maxMassive; i++) {

            if (massive[i] == 1)
                massive[i] = 0;
            } else massive[i] = 1;
        for (int i = 0; i < maxMassive; i++) {
            System.out.println(i + "-" + massive[i]);
        }
    }
}



public class Main {
    public static void main(String[] args)
    {
        int[] array = new int[8];
        int a = 0;
        int filling = array.length;
        for(int i = 0; i < filling; ++i)
        {
            System.out.print (i + "-" + array[i]+" ");
        }
        System.out.println (" ");
        for(int i = 0; i < filling; ++i, a = a + 3)
        {array[i] = a;
        }

        for(int i = 0; i < filling; i++)
        {
            System.out.print (i + "-" + array[i]+" ");
        }
    }
}

//

public class Main {
    public static void main(String[] args)
    {
        int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6)
                mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
        {
            System.out.print (i + "-" + mas[i]+" ");
        }
    }
}

//

for (int a = 0; a < 2; a++) {
for (int b = 0; b < 2; b++) {
    if (a < b) {
        squareArr[a][b] = 0;
        } else if (a > b) {
        squareArr[a][b] = 1;
        } else {
        squareArr[a][b] = 1;
        }
        System.out.print(squareArr[a][b] + " ");
        }


   //


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 78, 52, 12, 98, 47, 23, 39, 63, 70, 86};
        int max = getMax(array);
            System.out.println("Максимальный элемент - " + max + "");
        int min = getMin(array);
            System.out.println("Минимальный элемент - " + min + "");
        }

        public static int getMax(int[] inputArray) {
        int maxValue = inputArray [0];
        for(int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > maxValue) {
                maxValue = inputArray[i];
            }
        }
        return maxValue;
        }
    public static int getMin(int[] inputArray) {
        int minValue = inputArray [0];
        for(int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < minValue) {
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}