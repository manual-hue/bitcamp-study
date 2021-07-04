package net.common;

import java.util.Scanner;

public class JyPrac {
  
  public static void main(String[] args) {
    Scanner sysy = new Scanner(System.in);
    String enter = null;
    
    System.out.println("언니한테 인사합시다 : ");
    enter = sysy.nextLine();

    loop: while(true) {
    if ( enter.equals("안녕")) {
      System.out.println("지윤아 사랑행!!");
      break;
    } else {
      System.out.println("제대로 쓰라 했다ㅡㅡ");
    } break;
      }
    sysy.close();
  }
}
