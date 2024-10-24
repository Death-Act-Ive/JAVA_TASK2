package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class insertDialog {
    private String question;
    Scanner in;

    public insertDialog(String question) {
        this.question = question;
        this.in = new Scanner (System.in);
    }

    public void printQuestion(){
        System.out.println(question);
    }

    public int openIntDialog(){
        int answer = 0;
        for(;;){
            printQuestion();
            try{
                answer = in.nextInt();
                return answer;
            } catch(InputMismatchException e) {
                System.out.println("Invalid input. Please, try again");
                in.nextLine();
            }
        }
    }
}
