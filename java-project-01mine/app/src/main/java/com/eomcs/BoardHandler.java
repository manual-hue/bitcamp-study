package com.eomcs;

import java.util.Date;
import java.util.Scanner;

public class BoardHandler implements Handler {

  // 한 개의 게시글을 담을 복합 데이터의 변수를 설계
  static class Board {
    String title;
    String content;
    String password;
    int viewCount;
    Date createdDate;
  }
  
  static Scanner keyScan;
  
  static ArrayList boardList = new ArrayList();
  
  // BoardHandler에서 사용할 ArrayList의 인스턴스를 준비한다.
  //규칙을 따를 때 static을 붙이면 안 된다. static void > public void
  //정해진 규칙을 준수하지 않을 경우 바로 에러가 뜬다.
  public void execute() {
    loop: while(true) {
      System.out.print("게시글 관리> ");
      String command = keyScan.nextLine();
      
      switch (command) {
        case "list": list(); break;
        case "add": add(); break;
        case "update": update(); break;
        case "delete": delete(); break;
        case "view": view(); break;
        case "back":
          break loop;
        default:
          System.out.println("지원하지 않는 명령입니다.");
        }
    
        System.out.println( );  
     
      }
    }
  
  

  static void list() {
    System.out.println("[게시글 목록]");

    Object[] arr = ArrayList.toArray(boardList);
    int i = 0;
    for (Object item : arr) {
      Board board = (Board) item;
      System.out.printf("%d, %s, %s, %d\n", 
          i++, 
          board.title, 
          String.format("%1$tY-%1$tm-%1$td", board.createdDate),
          board.viewCount);
    }
  }

  static void add() {
    System.out.println("[게시글 등록]");

    if (boardList.size == ArrayList.MAX_LENGTH) {
      System.out.println("더 이상 게시글을 추가할 수 없습니다.");
      return;
    }

    // 한 개의 게시글 데이터를 저장할 변수를 준비한다.
    Board board = new Board(); // Board 설계도에 따라 변수를 만들고 그 주소를 리턴한다.

    System.out.print("제목: ");
    board.title = keyScan.nextLine();

    System.out.print("내용: ");
    board.content = keyScan.nextLine();

    System.out.print("비밀번호: ");
    board.password = keyScan.nextLine();

    board.createdDate = new Date(); // 현재의 날짜와 시간을 생성하여 배열에 저장한다.

    ArrayList.append(boardList, board);

    System.out.println("게시글을 등록했습니다.");
  }

  static void update() {
    System.out.println("[게시글 변경]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) ArrayList.retrieve(boardList, index);

    System.out.printf("제목(%s)? ", board.title);
    String title = keyScan.nextLine();

    System.out.printf("내용(%s)? ", board.content);
    String content = keyScan.nextLine();

    System.out.print("정말 변경하시겠습니까?(y/n) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 변경이 취소 되었습니다.");
      return;
    } 

    board.title = title;
    board.content = content;

    System.out.println("게시글이 변경되었습니다.");
  }

  static void delete() {
    System.out.println("[게시글 삭제]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    System.out.print("정말 삭제하시겠습니까?(y/n) ");
    if (!keyScan.nextLine().equals("y")) {
      System.out.println("게시글 삭제가 취소되었습니다.");
      return;
    } 

    ArrayList.remove(boardList, index);

    System.out.println("게시글이 삭제 되었습니다.");
  }

  static void view() {
    System.out.println("[게시글 조회]");

    System.out.print("번호? ");
    int index = Integer.parseInt(keyScan.nextLine());

    if (index < 0 || index >= boardList.size) {
      System.out.println("무효한 게시글 번호입니다.");
      return;
    }

    Board board = (Board) ArrayList.retrieve(boardList, index);

    board.viewCount++;

    System.out.printf("제목: %s\n", board.title);
    System.out.printf("내용: %s\n", board.content);
    System.out.printf("조회수: %d\n", board.viewCount);
    System.out.printf("등록일: %1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS\n", board.createdDate);
  }
}
