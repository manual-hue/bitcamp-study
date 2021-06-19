package com.eomcs.lang.ex07;

import java.util.Scanner;

public class prac {
  public static void main(String[] args) {
    
  Scanner Keyboard = new Scanner(System.in);
    System.out.print("지금은 몇 년도? (네 자리 수로 기입하시오.) ");
    int year = Keyboard.nextInt();
    int age;
    Keyboard.close();
  
  for(year = 2007 ; year < 2100 ; year++ ) {
    for(age = 0 ; age < 100 ; age++ );  {
      System.out.printf("%d년 지윤의 나이: %d살\n", year, age);
      }
    }
  }
}
