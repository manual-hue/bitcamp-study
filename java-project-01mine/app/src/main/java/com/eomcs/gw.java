package com.eomcs;

import java.util.Scanner;

public class gw {
  public static void main(String[] args) {
    
    
    final int BOARD_LENGTH = 5;
    String[] title = new String[BOARD_LENGTH];
    String[] content = new String[BOARD_LENGTH];
    String[] password = new String[BOARD_LENGTH];
    int size = 0;
    
    System.out.println("<STRIKER 게시판 관리>");
    
    Scanner keyboard = new Scanner(System.in);
    
    loop: while(true) {
      System.out.print("액세스하고자 하는 메뉴를 입력하세요. ");
      String command = keyboard.nextLine();
      
      switch (command) {
        case "list":
          System.out.println( );
          System.out.println("글 목록");
          System.out.println( );
          
          for (int i=0; i<size; i++) {
            System.out.printf("%d, %s\n", i, title[i]);
          }
          
          break;
        case "view":
          System.out.println("글 조회");
          break;
        case "add":
          System.out.println( );
          System.out.println("글 작성");
          System.out.println( );
          System.out.print("title? > ");
          title[size] = keyboard.nextLine();
          
          System.out.print("content? > ");
          content[size] = keyboard.nextLine();
          
          System.out.print("password? > ");
          password[size] = keyboard.nextLine();
          
          System.out.println("Success");
          
          System.out.printf("title > %s\n", title[size]);
          System.out.printf("content > %s\n", content[size]);
          System.out.printf("password > %s\n", password[size]);
          
          size++;

          System.out.println( );
          
          break;
        case "update":
          System.out.println("글 변경");
          break;
        case "delete":
          System.out.println("글 삭제");
          break;
        default:
          System.out.println("잘못된 명령입니다.");
          break;
        case "quit":
          break loop; 
      }
    }
    
    keyboard.close();
    System.out.println("이용해주셔서 감사합니다.");
    
    }
  }