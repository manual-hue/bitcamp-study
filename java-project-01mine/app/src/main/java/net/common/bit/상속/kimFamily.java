package net.common.bit.상속;

import java.util.Scanner;

//엄마 아빠 재은 지윤 이하 우리가족의 인적사항을 출력하고 성별을 자동출력할 것이다.
public class kimFamily {
  public void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("이름을 입력하세요.");
    String name = sc.nextLine(); //문자열 이름을 키보드로 입력받겠다.
    
    System.out.println("주민등록번호 열세자리를 입력하세요.");
    String jumin = sc.nextLine();    
    
    sc.close();

    char gender = jumin.charAt(7);
    
    while(true) {
      switch (gender) {
        case '1': System.out.println("성별: 남"); break;
        case '2': System.out.println("성별: 여"); break;
      }
    }
    
    System.out.printf("이름: " + name);
    System.out.printf("성별: " + gender);
    System.out.printf("주민등록번호: " + jumin);
    

    
    System.out.println("이용해주셔서 감사합니다.");
    
  }
}