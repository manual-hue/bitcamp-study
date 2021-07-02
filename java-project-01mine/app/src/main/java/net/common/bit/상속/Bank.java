package net.common.bit.상속;
  
public class Bank {
// 자바언어는 객체지향언어 OOP
// 챕 6-5 Constructor 생성자 *기본 생성자만 기술 -> 기본 생성자 생략 가능
// 비번으로 입금,송금,계좌이체,인출,잔액
// 우리은행거래
  private int pass = 1234; // private 키워드는 현재 클래스에만 적용
  Bank() { }//생성자 private 키워드
  
//챕 6-4 Overloading 메서드 중복, 생성자 중복 가능
  void cal() {System.out.println(pass);}
  public void cal(int m) {} //입금
  public void cal(String name, int m) { } //어느 은행, 입금
  }//class END