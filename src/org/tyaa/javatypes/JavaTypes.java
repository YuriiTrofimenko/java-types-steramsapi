/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.javatypes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author student
 */
public class JavaTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* System.out.println("Hello");
        boolean b1 = true;
        char c1 = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println(c1++);
        }
        
        BigDecimal bd1 = new BigDecimal(10.99);
        bd1 = bd1.setScale(3, RoundingMode.DOWN);
        bd1 = bd1.add(new BigDecimal(10));
        System.out.println(bd1); */
        
        // String s1 = new String();
        /* String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2); */
        
        /*String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);*/
        
        Integer[] arr1 = {1, 2, 6};
        Integer[][] arr2 = new Integer[2][];
        arr2[0] = arr1;
        arr2[1] = new Integer[] {0, -5, 11, 100};
        
        /*for (int[] subArray : arr2) {
            for (int x : subArray) {
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println("");
        }*/
        
        List integers = Arrays.asList(arr1);
        /*integers.forEach(new Consumer() {
            @Override
            public void accept(Object x) {
                System.out.print(x + " ");
            }
        });
        System.out.println("");
        integers.forEach((x) -> {
            System.out.print(x + " ");
        });
        System.out.println("");
        integers.forEach(System.out::print);*/
        
         /* integers.stream().filter((x) -> {
            return ((Integer)x) < 5 && ((Integer)x) > 0;
        }).map((x) -> {
            String result = "Unknown";
            switch ((Integer)x){
                case 1: result = "One"; break;
                case 2: result =  "Two"; break;
                case 3: result = "Three"; break;
                case 4: result = "Four"; break;
            }
            return result;
        }).forEach((x) -> {
            System.out.print(x + " ");
        }); */
         
         List<String> strings =
                 (List<String>) integers.stream().filter((x) -> {
            return ((Integer)x) < 5 && ((Integer)x) > 0;
        }).map((x) -> {
            String result;
            switch ((Integer)x){
                case 1: result = "One"; break;
                case 2: result =  "Two"; break;
                case 3: result = "Three"; break;
                case 4: result = "Four"; break;
                default: result = "Unknown";
            }
            return result;
        }).collect(Collectors.toList());
         
         strings.forEach(System.out::print);
    }
    
}
