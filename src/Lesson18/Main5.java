package Lesson18;

import Lesson19.CopyWithCommanI0;

import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        String from = "C:\\Users\\cmp1\\Desktop\\Board\\YDXJ0123.MP4";
        CopyFileWithJava7 copyFileWithJava7 = new CopyFileWithJava7();
        long startTime = System.currentTimeMillis();
        try {
            copyFileWithJava7.copy(from,"C:\\Users\\cmp1\\Desktop\\Board\\YDXJ012311.MP4");
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Потрачено времени " + (endTime - startTime));


//        CopyWithCommanI0 copyWithCommanI0 = new CopyWithCommanI0();
//        long startTime3 = System.currentTimeMillis();
//        try {
//           CopyWithCommanI0(from,"C:\\Users\\cmp1\\Desktop\\Board\\YDXJ0123111.MP4");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        long endTime3 = System.currentTimeMillis();
//        System.out.println("Потрачено времени " + (endTime - startTime));


    }
}
