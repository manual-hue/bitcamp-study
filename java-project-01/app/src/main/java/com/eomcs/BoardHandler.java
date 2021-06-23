package com.eomcs;

import java.util.Date;
import java.util.Scanner;
import com.eomcs.App.Board;

public class BoardHandler {
  
  static final int BOARD_LENGTH = 100;
  static Board[] boards = new Board[BOARD_LENGTH];
  static int size = 0;
  static Scanner keyScan;
  
  static void list {
    System.out.println();
  }
  
  for (int i = 0;)
    
 System.out.println("");
  
    loop: while (true) {
      System.out.print("명령> ");
      String command = keyScan.nextLine();
    
  switch (command) {
    case "list": BoardHandler.add; break;
    case "add": BoardHandler.add(); break;
    case "update": BoardHandler.update(); break;
    case "delete": BoardHandler.delete(); break;
    case "view": BoardHandler.view(); break;
    case "quit":
      break loop;
    default:
      System.out.println("지원하지 않는 명령입니다.");
  }

}
