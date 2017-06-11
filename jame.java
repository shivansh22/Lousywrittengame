package com.company;
import java.util.Scanner;
import java.math.MathContext;
class mean {

    public static void main(String[] args) {
	// write your code here
        Scanner scan= new Scanner(System.in);
    String momDig1 = "<MOM> wake up time to go to school!";
    System.out.println(momDig1);
    String[] payerDigs;
        payerDigs = new String[]{"ill wake up later", "ok mother", "i don't wanna go to school"};

        System.out.println("\t #YOUR OPTIONS ARE# \n " +"1 "+ payerDigs[0] + "\n 2 "+ payerDigs[1]+"\n 3 " +payerDigs[2]);
        int ans1 = scan.nextInt();
        String ans1k = payerDigs[ans1-1];
        System.out.println("REPLY: "+ans1k);
    if (ans1 == 1 ){System.out.println("<MOM> Shut up and get up!!");}
    if (ans1 == 2){System.out.println("<MOM> Here hold this. \n \n \t#YOUR MOM MADE YOU HOLD AN IGNITED GRENADE YOU DIED");}
    else{System.out.println("<MOM> k bro.");}
     publi int rollDice(){
     double rand = Math.random();
    int randonInt = (int) rand*6 + 1;
   randonInt*= 1;

    return randonInt;
    }int peep = rollDice();


    }



