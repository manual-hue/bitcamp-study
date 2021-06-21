package com.eomcs.lang.ex07;

import java.util.Calendar;
import java.util.Scanner;

public class prac {
  public int getJy(int birthYear, int birthMonth, int birthday) {
    
    Calendar current = Calendar.getInstance();
    int currentYear = current.get(Calendar.YEAR);
    int currentMonth = current.get(Calendar.MONTH) +1 ;
    int currentDay = current.get(Calendar.DAY_OF_MONTH);
    
    int age = currentYear - birthYear;
    //생일이 안 지났으면 -1
    if (birthMonth * 100  + birthday > currentMonth * 100 + currentDay)
    age--;
    
    
    if 
    System.out.print("연도를 입력하시오. (네 자리 숫자): ");
    
    return age;        
  }
}