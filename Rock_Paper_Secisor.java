package com.company;

import java.util.Random;
import java.util.Scanner;

class Game1{
    public int userInput;
    public int computerInput;
    Game1(){
        Random random=new Random();
        this.computerInput=random.nextInt(3);
    }
    void userNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("--Enter a number--");
        System.out.println("--0 for Rock--");
        System.out.println("--1 for Paper--");
        System.out.println("--2 for Secisor--");
        userInput= sc.nextInt();
    }
    void correct(){
        if(userInput>=3 || userInput<=-1){
            System.out.println("Invalid Number");
        } else if  (userInput==computerInput) {
            System.out.println("Draw Both are same");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1) {
            System.out.println("You are Win!!");
            System.out.println("Computer choice :: "+computerInput);
        }
        else {
            System.out.println("Computer are Win");
            System.out.println("Computer choice :: "+computerInput);
            if(computerInput==0){
                System.out.println("Computer choice Rock");

            } else if (computerInput==1) {
                System.out.println("Computer choice is Paper ");
            } else if (computerInput==2) {
                System.out.println("Computer choice Secisor ");
            }
        }


    }
}
public class Game2_Rock_Paper_Secisor {
    public static void main(String[] args) {
        Game1 n=new Game1();
        n.userNumber();
        n.correct();
    }
}
