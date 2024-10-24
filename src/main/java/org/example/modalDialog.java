package org.example;

import java.util.Scanner;

// USES MAPPING
public class modalDialog <T>  {
    private String question;
    private String [] variants;
    private T [] results;

    Scanner in;

    public modalDialog(String question, String [] variants, T [] results) {
        if(variants.length != results.length){
            throw new ArrayIndexOutOfBoundsException("Answers and result arrays aren't equal by lengths");
        }
        else{
            this.question = question;
            this.variants = variants;
            this.results = results;
            this.in = new Scanner (System.in);
        }
    }

    public void printQuestion(){
        System.out.println(question);
    }

    public void printAnswers(){
        int i = 1;
        for (String a : variants) {
            System.out.print("<" + a+"> ");
            i++;
        }
        System.out.println();
    }

    public T openDialog(){
        printQuestion();
        printAnswers();
        String ans = in.nextLine().toLowerCase();
        int idx = java.util.Arrays.asList(variants).indexOf(ans);
        return results[idx];
    }
}
