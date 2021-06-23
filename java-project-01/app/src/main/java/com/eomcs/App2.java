package com.eomcs;

import java.util.Scanner;

//01. main(): 프로그램 entry point
//02. 사용자로부터 명령어 입력 받기
//03. 사용자로부터 계속 명령어 입력 받기
//04. quit 명령어를 입력 받았을 때 반복 종료하기
//05. 명령어 별로 실행을 분기하기
//06. 게시글 입력 받기
//07. 배열을 이용하여 여러 개의 게시글 보관하기
//08. 상수(final 변수)를 이용하여 배열의 크기를 다루기
//09. 게시글 목록 출력하기
//10. 게시글 상세 조회
//11. 게시글 조회수 추가하기
//12. 게시글 등록일 추가하기
//13. 게시글 변경하기
//14. 게시글 삭제하기
//15. 메서드 문법을 이용하여 기능 별로 명령어를 묶어 관리하기
//16. 클래스를 이용하여 새 데이터타입을 정의하기
public class App {
  
  public static void main(String[] args) {
    
    final int BOARD_LENGTH = 3;
    String[] title = new String[BOARD_LENGTH];
    String[] content = new String[BOARD_LENGTH];
    String[] password = new String[BOARD_LENGTH];
    int size = 0;
    
    System.out.println("〈게시판 관리〉");
    
    Scanner keyboard = new Scanner(System.in);
    
    loop: while(true) {
      System.out.print("메뉴를 입력하세요. ");
      String command = keyboard.nextLine();
      
      switch(command) {
        case "list":
          System.out.println("글 목록");
          
          for(int i = 0; i < size; i++) {
            System.out.printf("%d, %s\n", i, title[i]);
          }
          break;
          
        case "add":
          System.out.println("글 작성");
          
          if(size == BOARD_LENGTH) {
            System.out.println("더 이상 게시글을 작성할 수 없습니다.");
            break;
          }
            
          System.out.print("제목: ");
          title[size] = keyboard.nextLine();
          System.out.print("내용: ");
          content[size] = keyboard.nextLine();
          System.out.print("비밀번호: ");
          password[size] = keyboard.nextLine();
          
          System.out.printf("제목: %s\n", title[size]);
          System.out.printf("내용: %s\n", content[size]);
          System.out.printf("비밀번호: %s\n", password[size]);
          
          size++;
          
          break;
        
        case "update":
          System.out.println("글 수정");
          break;
        
        case "delete":
          System.out.println("글 삭제");
          break;
          
        case "view":
          System.out.println("글 조회");
          System.out.print("조회하고자 하는 글 번호를 입력하세요. ");
          int index = Integer.parseInt(keyboard.nextLine());
            
            if(index < 0 || index >= size) {
              System.out.println("무효한 게시글 번호입니다.");
              break;
            }
            
            System.out.printf("제목: %s\n", title[index]);
            System.out.printf("내용: %s\n", content[index]);
            System.out.printf("암호: %s\n", password[index]);
          
          break; 
          
        case "quit":
          break loop;
          
        default:
          System.out.println("잘못된 명령어입니다.");
      }
    }
    
    keyboard.close();
    System.out.println("이용해 주셔서 감사합니다.");

  }
}







