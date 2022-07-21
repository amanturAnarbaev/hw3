package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BankAccount bankAccount= new BankAccount();
        bankAccount.deposit(20000);
        LimitException limitException= new LimitException(null);

        while (true){
            System.out.println("enter the amount that you want to take");
            Double sum=6000.0;
            try {
                bankAccount.withDraw(sum);
                System.out.println("you take " +sum+ "soms from your Bank Account and you left "+ bankAccount.getAmount()+"soms");
            } catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    System.out.println("you want to take the amount that you don't have . you have "+bankAccount.getAmount());
                    System.out.println("so we take " + bankAccount.getAmount() + "feom your bank account");
                    limitException.setRemainingAmount(bankAccount.getAmount());
                    bankAccount.withDraw(limitException.getRemainingAmount());

                } catch (LimitException ex) {
                    System.out.println(limitException.getMessage());
                }
                System.out.println("Now you left " + bankAccount.getAmount()+ " soms on your bank account");

                System.out.println("thank you for choosing us "+
                        "\nBye Bye");
                break;
            }

        }



    }
}
