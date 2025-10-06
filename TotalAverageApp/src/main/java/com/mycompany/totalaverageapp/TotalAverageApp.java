/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.totalaverageapp;

/**
 *
 * @author 30128198
 */
public class TotalAverageApp {

    public static void main(String[] args) {
        TotalAverageCalculator tac = new TotalAverageCalculator();
        int[] numbers = {5, 24, 66, 13, 41};
        
        int total = tac.getTotal(numbers);
        double average = tac.getAverage(numbers);
        
        System.out.println("Total: "+total);
        System.out.println("Average: "+average);
    }
}
