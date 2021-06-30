package net.common.bit.상속;

import java.io.InputStream;

public class Work02emp {
  public static void main(String[] args) {
    try {
    // 자바 표준 입력 ASCII 코드 byte 형태
    // 자바 표준입력 System.in 키보드 입력
    //  java.util 패키지 Scanner 생성자 3번째(InputStream)
    InputStream is = System.in; // static InputStream in 필드 표준    
    System.out.println("단 입력 >>> ");
    int dan = is.read();
    for(int a=1; a<10; a++) {
        System.out.println(dan+"*"+a+"="+(dan*a));
        }
      }catch (Exception e) { }
    }
  }
