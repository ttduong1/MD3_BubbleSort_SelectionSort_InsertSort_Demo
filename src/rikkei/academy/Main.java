package rikkei.academy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<NhanVien> nhanVienList = new ArrayList<>();

        nhanVienList.add(new NhanVien(1,"Nam" , 1000));
        nhanVienList.add(new NhanVien(2,"Bắc" , 4000));
        nhanVienList.add(new NhanVien(3,"Đông" , 2000));
        nhanVienList.add(new NhanVien(4,"Tây" , 3000));

//        NhanVienComparator nhanVienComparator = new NhanVienComparator();
//        long startTimeThu = System.nanoTime();
//        Collections.sort(nhanVienList,nhanVienComparator);
//        System.err.println(nhanVienList);
//        long endTimeThu = System.nanoTime();
//        System.out.println("bubbleSortThu " + (endTimeThu - startTimeThu));





        long startTime1 = System.nanoTime();
        bubbleSort(nhanVienList);
        System.err.println("======"+nhanVienList);
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
        long endTime1 = System.nanoTime();
        System.out.println("bubbleSort " + (endTime1 - startTime1));

        long startTime2 = System.nanoTime();
        selectionSort(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(  list[i] );
//        }
        long endTime2 = System.nanoTime();
        System.out.println("selectionSort " + (endTime2 - startTime2));

        long startTime3 = System.nanoTime();
        insertionSort(nhanVienList);
        System.out.println(nhanVienList);
//        System.out.println("Mảng sau khi sắp xếp: ");
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + " ");
//        }
        long endTime3 = System.nanoTime();
        System.out.println("insertionSort " + (endTime3 - startTime3));
    }

    // BubbleSort

    static int[] list = {8, 3, 6, 5, 1, 9, 2, 11, 46, 70, 22, 23, 45, 56, 57, 58, 70, 71, 72, 73, 75, 51};

    public static void bubbleSort(List<NhanVien>nhanVienList) {
//        boolean needNextPass = true;
        for (int k = 0; k < nhanVienList.size(); k++) {
            // Nếu mảng đã được sắp xếp mà không cần qua lần sắp xếp tiếp theo ?
//            needNextPass = false;
            for (int i = 0; i < nhanVienList.size() - k - 1; i++) {
                if (nhanVienList.get(i).getSalary() > nhanVienList.get(i+1).getSalary()) {
                    NhanVien temp =nhanVienList.get(i);
                    nhanVienList.set(i,nhanVienList.get(i+1))  ;
                    nhanVienList.set(i+1,temp);
//                    needNextPass = true;
                    // Nếu mảng đã được sắp xếp mà không cần thông qua lần sắp xếp từ vòng lặp ngoài nào ?
                }
            }
        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void insertionSort(List<NhanVien> nhanVienList) {

        for (int i = 0; i < nhanVienList.size(); i++) {
            NhanVien key = nhanVienList.get(i);
            int j = i - 1;
            while (j >= 0 && nhanVienList.get(j).getSalary() > key.getSalary()) {
                nhanVienList.set(j + 1 , nhanVienList.get(j));
                j = j - 1;
            }
            nhanVienList.set(j + 1 , key);
        }
    }



}