package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(7000000);
        System.out.println("счет с банка" + bankAccount.getAmount() + "com.");
        System.out.println("сколько взять");
        System.out.println("ввзять 40000");
        System.out.println("------------------------------------");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextByte();


        while (true) {
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withDraw(a);
            } catch (LimitException e) {
                System.out.println(e.getMessage());
            }
            try {
                bankAccount.withDraw((int) bankAccount.getAmount());


            }catch (LimitException limitException){
                limitException.printStackTrace();
            }
            break; 

        }

    }
}




