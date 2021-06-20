package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Whileprac {
  
  static void main01(String[] args) {
  // 입력 받은 길의 값에 맞춰 피라미드를 세워라
  
  Scanner Keyboard = new Scanner(System.in);
  System.out.println("길의 개수는?: ");
  //int gil = Keyboard.nextInt();
  Keyboard.close();  
  }



  public static void main(String[] args) {
    int i, j;
    for( i=2; i<10; i++ ) {
      for( j=1; j<10; j++ ) {
        System.out.printf("%d X % d = %d\n", i, j, i*j);
    } System.out.println( );
  } 
 }
}
