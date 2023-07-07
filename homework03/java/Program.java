// Пусть дан произвольный список целых чисел.

// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

package homework03.java;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList(Arrays.asList(20, 95, 108, 3, 65, 845, 563, 15, 44, 45, 66, 99, 222));
        System.out.println("Список чисел: " + list);
        System.out.println("Минимальное значение: " + Min(list));
        System.out.println("Максимальное значение: " + Max(list));
        System.out.println("Среднее значение: " + Midl(list));
        deleteEven(list);
    }
    static void deleteEven(List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            }
        } 
        System.out.println("Список без четных чисел: " + arrayList);
        
    }
    static Integer Max(List<Integer> arrayList) {
        int max = arrayList.get( 0); 
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) > max) {
                max = arrayList.get(i);
            }
        } 
        return max;
    }
    static Integer Min(List<Integer> arrayList) {
        int min = arrayList.get(0); 
        for (int i = 0; i < arrayList.size() - 1; i++) {
            if (arrayList.get(i) < min) {
                min = arrayList.get(i);
            }
        } 
        return min;
    }
     static Double Midl(List<Integer> arrayList) {
        int sum = 0; 
        double avrg;
        for (int i = 0; i < arrayList.size() - 1; i++) {
            sum += arrayList.get(i);
        } 
        avrg = sum / arrayList.size();
        return avrg;
    }
}