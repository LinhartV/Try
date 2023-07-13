package com.mycompany.dali;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class Dali {    
    public static void main(String[] args) {
        
        TestForm form = new TestForm();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);
        /*int[] array = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271};
        int[] nextArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        int user;
        int modulo;
        int findNext = 0;
        int x = 0;
        System.out.println("Ahoj");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();

        while (true) {
            for (int i = 0; i < array.length; i++) {
                modulo = user % array[i];
                if (modulo == 0) {
                    nextArray[x] = array[i];
                    findNext = user / array[i];
                    x++;
                    user = findNext;
                    break;
                }
            }
            if (user == 1) {
                break;
            }
        }for (int i = 0; i < nextArray.length; i++) {
            System.out.println(nextArray[i]);
        }*/

    }
}