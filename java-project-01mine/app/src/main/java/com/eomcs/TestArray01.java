package com.eomcs;

public class TestArray01 {
  public static void main(String[] args) {
    //배열의 초기화, 배열의 장단점
    String[] dong = new String[5];
    for(int i=0; i<dong.length; i++) {
      System.out.println(dong[i] +" ");
    }
    System.out.println();
    boolean[] camp = new boolean[5]; //false기본값출력
    for(int i=0; i<camp.length; i++) {
      System.out.println(camp[i] +" ");
    }
     
    double[] pi = new double[5]; //false기본값출력
    for(int i=0; i<pi.length; i++) {
      System.out.println(pi[i] +"  ");
      }
       
    System.out.println();
    //배열은 같은 타입으로만 구성, 크기 사이즈 고정
    //채팅구성원 정보 닉이름String, 나이int, 성별boolean =>배열 구성비권장
    //web 게시판 글쓴이, 제목, 이미지, 조회수, 날짜, 좋아요 정보 닉이름String, 나이int, 성별boolean =>배열 구성비권장
    //채팅, 쇼핑몰, 게시판 구성시 배열의 한계 극복 collection모음 List 계열
    //java.util 패키지 List 인터페이스 상속 - ArrayList 클래스,Vector 클래스
    //java.util 패키지 Map 인터페이스, Set인터페이스, List인터페이스
    //같은 타입 구성, 크기가 고정인 배열의 단점을 List인터페이스를 상속
    //같은 타입 구성, 크기 고정인 1차원 배열
    //boolean[] camp = new boolean[5]; //false 기본값 출력
    //배열 및 문자열의 시작 위치는 0번째부터입니다.
    //자바 표춘출력 모니터 System.out ==> PrintStream
    //자바 표준입력 키보드 System.in ==> Scanner 클래스
    
  }//end
}//class END
