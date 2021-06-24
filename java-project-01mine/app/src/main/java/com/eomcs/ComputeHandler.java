package com.eomcs;

import java.util.Scanner;

public class ComputeHandler {
  static Scanner keyScan;
  
  static void ohora() {
    while (true) {
      System.out.print("계산식: (이전 메뉴: back) (예: 100 * 4) ");
      String expression = keyScan.nextLine();
      
      if (expression.equals("back")) {
        break;
      }
      
      String[] arr = expression.split(" ");
      //공백을 기준으로 문자열을 잘라내어 나눈 후, 배열에 담아 리턴한다.
      if (arr.length != 3) {
        System.out.println("계산식의 입력이 잘못되었습니다.");
        continue; //break는 그 즉시 멈춘다. continue는 반복문의 처음으로 돌아가는 것 용도.
      }
      
      int a = Integer.parseInt(arr[0]);
      int b = Integer.parseInt(arr[2]);
      
      switch (arr[1]) {
        case "+":
          System.out.printf("%d + %d = %d\n", a, b, a + b);
          break;
        case "-":
          System.out.printf("%d - %d = %d\n", a, b, a - b);
          break;
        case "*":
          System.out.printf("%d * %d = %d\n", a, b, a * b);
          break;
        case "/":
          System.out.printf("%d / %d = %d\n", a, b, a / b);
          break;
        case "%":
          System.out.printf("%d %% %d = %d\n", a, b, a % b);
          break;
        default:
          System.out.println("이 연산은 지원하지 않습니다.");
          break;
      }
    }
  }
}
