/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.totalaverageapp;

/**
 *
 * @author 30128198
 */
public class TotalAverageCalculator {
    
    public TotalAverageCalculator() {}
    
    public int getTotal(int[] nos) {
        int total = 0;
        for (int no : nos) {
            total+=no;
        }
        return total;
    }
    
    public double getAverage(int[] nos) {
        double total = 0;
        int size = nos.length;
        for (int no : nos) {
            total+=no;
        }
        return (total/size);
    }
}
