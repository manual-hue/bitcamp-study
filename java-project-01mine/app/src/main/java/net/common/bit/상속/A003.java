package net.common.bit.상속;

import net.common.bit.Dunkin;

public class A003 {
  public static void main(String[] args/*스트링 배열의 args를 받겠다, 이름 바꿔도 됨*/) {
    Bank bk = new Bank();
//    System.out.println( "password" + bk.pass );
    bk.cal(7890);
    Dunkin dd = new Dunkin();
//    String name = dd.coffee();
    dd.donuts(7);
    }
  }//class end
