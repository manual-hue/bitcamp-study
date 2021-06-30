package net.common.bit.상속;

import java.util.Scanner;

public class Work02emp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sabun = 0; //입력받을 상수
    String name = null; //입력받을 이름
    
    while(true) {
      
      System.out.println("사번을 입력해주세요. :");
      sabun = Integer.parseInt(sc.nextLine());
    }
  
  
  }
}
//  public static void main(String[] args) {

//    InputStream is = System.in;
//    Scanner sc = new Scanner(is);
//    int sabun = 0;
//    String name = null;
//    // Q. 키보드 입력 Scanner 클래스, 반복문, 예외 처리, 형 변환
//    while(true) {
//      try {
//      System.out.print("사번 입력 >>> ");
//      sabun=Integer.parseInt(sc.nextLine());
//      System.out.print("이름 입력 >>> ");
//      name = sc.nextLine();
//        if(name.equals(" ") || name.equals(null)) {continue;}
//        break;
//      } catch (Exception e) {
//      System.out.println("정확한 값을 입력하세요.");
//      } 
//    }
//    System.out.println( );    
//    System.out.println("사번 = " + sabun);
//    System.out.println("이름 = " + name);
//    sc.close();
//    }
//}
