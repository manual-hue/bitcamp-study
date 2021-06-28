package com.eomcs;

import java.util.Scanner;

public class MyTest {
  public static void main(String[] args) {
    
    int ROOM_BOOKING = 5;
    int size = 0;
    String[] roomNum = new String[ROOM_LENGTH];
    
    System.out.println( );
    System.out.println("> TEST HOTEL MENU <");
    System.out.println( );
    
    Scanner kb = new Scanner(System.in) ;
    
    System.out.println("원하시는 메뉴를 입력하세요. (1. 예약 2. 퇴실 3. 보기 4. 종료 > ");
    String command = kb.nextLine();
    
    
    switch (command) {
      case "add":
        System.out.println( );
        System.out.println("ROOM BOOKING");
        System.out.println( );
        System.out.println("Choose num > ");
        
        if (size == )
        break;
        
      case "out":
        System.out.println( );
        System.out.println("ROOM OUT");
        System.out.println( );
        break;
      case "view":
        System.out.println( );
        System.out.println("ROOM VIEW");
        System.out.println( );
        break;
      case "quit":
        System.out.println( );
        System.out.println("이용해주셔서 감사합니다.");
        break;

      default:
        System.out.println("잘못된 명령입니다. 다시 입력해주세요.");
        break;
    }
    
    

  }

}
