package com.eomcs;

import java.util.Scanner;

public class App {

  static Scanner keyScan = new Scanner(System.in);

  public static void main(String[] args) {

    // App 클래스의 Scanner 인스턴스를 각각 핸들러와 함께 쓴다.
    BoardHandler.keyScan = keyScan;
    MemberHandler.keyScan = keyScan;
    ComputeHandler.keyScan = keyScan;
    
    menuLoop: while(true) {
      System.out.println("[메뉴]");
      System.out.println("  1. 게시글 관리");
      System.out.println("  2. 회원 관리");
      System.out.println("  3. 계산기");
      System.out.print("메뉴를 선택하세요. (종료: quit) [1..3] ");
      String menuNo = keyScan.nextLine();
      
      switch (menuNo) {
        case "1":
          BoardHandler.execute();
          break;
        case "2":
          MemberHandler.service();
          break;
        case "3":
          ComputeHandler.ohora();
          break;
        case "quit":
          break menuLoop;
        default:
          System.out.println("메뉴 번호가 옳지 않습니다.");
      }
     
      System.out.println( );
      
    }
    
      keyScan.close();      
      System.out.println("이용해주셔서 감사합니다.");
      
    }
  }
