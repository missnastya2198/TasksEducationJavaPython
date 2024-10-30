import java.util.Arrays;

public class Lesson2And4And2Base {
        public static void main (String[]args) {
            int[] a1 = new int[]{0, 2, 2};
            int[] a2 = new int[]{1, 3};
        //public static void copy(int[] a1, int[] a2) {}


            /*int[] c = new int[a1.length + a2.length]; //создали массив размером суммы двух массивов
            int n = a1.length;
            int m = a2.length;
            int i = 0, j = 0, k = 0; //указатели для массивов, k-для нового массива c
            while (i < n && j < m) { //счетчик для сравнения двух массивов попарно
                if (a1[i] <= a2[j]){
                    c[k] = a1[i];
                    i++;
                }
                else {
                    c[k] = a2[j];
                    j++;
                }
                k++;
            }
            while (i < n) {   //счетчик если 1ый массив длиннее и остались значения
                c[k] = a1[i];
                i++;
                k++;
            }
            while (j < m) {   //счетчик если 2ой массив длиннее и остались значения
                c[k] = a2[j];
                j++;
                k++;
            }
            //return c;
            System.out.println(Arrays.toString(c));*/
            int n = a1.length, m = a2.length;
            int i = 0, j = 0;
            int[] array = new int[n + m];

            while (i < n || j < m)
                array[i + j] = (i < n && (j == m || a1[i] < a2[j])) ? a1[i++] : a2[j++];

            System.out.println(Arrays.toString(array));
        }


}

