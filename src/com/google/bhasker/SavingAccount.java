package com.google.bhasker;

public class SavingAccount {

  private void withdraw(int amount, double balanceAmount) {
    if(amount <= 0)
    {
      System.out.println("Amount should be greater than Zero");
    }
    else if (amount > balanceAmount) {
      System.out.println("Insufficient balance ");
    } else if(amount%5 !=0){
      System.out.println("Enter amount should be multiple of 5");
    }
    else {
      balanceAmount = balanceAmount - amount - 0.50;
    }

    System.out.println("balanceAmount :"+ balanceAmount);
  }
  public static void main (String[] args) throws java.lang.Exception
  {
    // your code goes here
    SavingAccount obj = new SavingAccount();
    obj.withdraw(-1, 120);
  }

}
