package net.common;

import java.util.Scanner;

public class JyPrac {
  
  public static void main(String[] args) {
    Scanner pain = new Scanner(System.in);

    
    loop: while(true) {
      String will = null;
      will=pain.nextLine();
      if(will.equals("please choose me")){
      System.out.println("I love you!");
      } break loop;
    } pain.close();
  }
}