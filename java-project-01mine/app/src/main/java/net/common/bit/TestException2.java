package net.common.bit;

public class TestException2 {
  public static void main(String[] args) {
    
    int su1 = 9;
    int su2 = 5;
    int mul=0, mok=0, kook=0; //국어 영어 합계
    
    mul = su1*su2 ;
    mok = su1/su2 ; // 실행 중 에러발생 try{}catch(Exception ex){
    System.out.println(su1 + "*" + su2 + "=" + mul);
    System.out.println(su1 + "/" + su2 + "=" + mul);
    
//    boolean[] camp = new boolean[5];
//    System.out.println(camp[11]);
//    System.out.println(camp[4]);
    
    System.out.println("\n***** 까사노의 1학기 점수 *****");
    System.out.println("국어=90");
    System.out.println("영어=85");
    System.out.println("총점175");
    
    System.out.println("");

  }//end
} // class END
