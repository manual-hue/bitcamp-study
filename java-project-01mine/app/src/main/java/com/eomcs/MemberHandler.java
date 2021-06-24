package com.eomcs;

import java.util.Scanner;

public class MemberHandler implements Handler {
  
  static Scanner keyScan;
  
  public void execute() {
    loop: while (true) {
      System.out.println("[회원 관리]"); 
      String command = keyScan.nextLine();
      
       switch (command) {
         case "list": BoardHandler.list(); break;
         case "add": BoardHandler.add(); break;
         case "update": BoardHandler.update(); break;
         case "delete": BoardHandler.delete(); break;
         case "view": BoardHandler.view(); break;
         case "back":
           break loop;
         default:
           System.out.println("지원하지 않는 명령입니다.");
         }
     
         System.out.println( );  
      }
    }
  }
