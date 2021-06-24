package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class MemberHandler implements Handler {
  
  // 사용자 정의 데이터 타입
  // => 도메인 객체(domain)\
  // => 값 객체(value object)
  // => 데이터 전송 객체(Data Transfer Object; DTO)
  // => 모델 객체(model)
  
  static class Member {
    String name;
    String email;
    String password;
    boolean working;
    Date registeredDate;
  }
  
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
