/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author sakura
 */
public class GradeStatistics {
    Scanner scanner;

    public GradeStatistics(Scanner scanner){
        this.scanner = scanner;

    }

    public void averages(){
        int sum = 0;
        int count = 0;
        int passingSum = 0;
        int passingCount = 0;
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }

            if(input < 0 || input > 100){
                continue;
            }

            if(input >= 50 && input < 100){
                passingSum = passingSum + input;
                passingCount ++;
            }

            sum = sum + input;
            count ++;

            int grade = getGrade(input);
            grades.add(grade);



        }
        double average =(double) sum/count;
        double averagePassing =(double) passingSum/passingCount;
        double passPercentage = (double) 100*passingCount/count;

        System.out.println("Point average (all): " + average);
        System.out.println("Point average (passing): " + averagePassing);
        System.out.println("Pass percentage:: " + passPercentage);
        System.out.println("Grade distribution:");
        printGrades(grades);



    }

    public int getGrade(int point){

        if(point < 50){
            return 0;
        }

        if(point < 60){
            return 1;
        }

        if(point < 70){
            return 2;
        }

        if(point < 80){
            return 3;
        }

        if(point < 90){
            return 4;
        }

        return 5;

    }

    public void printGrades (ArrayList<Integer> grades){

        int[] gradesCount = new int[6];
        for(int grade:grades){
            gradesCount[grade]++;
        }

        for(int i = gradesCount.length -1 ; i >=0; i--){
            System.out.print(i + ":");
            int count = gradesCount[i];
            if(count > 0){
                for(int j = 0 ; j < count ; j++){
                    System.out.print("*");
                }

            }
            System.out.println("\n");


        }




    }

}
