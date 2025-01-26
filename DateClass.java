package com.mycompany.finalprojects;
public class DateClass {
                                           /* project langauge Java */
                                        /* student name : Rahaf Sabra */

    private int year; 
            private int mounth ;
                 private int day;
                 
    public DateClass(int day,int mounth,int year){
              this.day=day;
              this.mounth=mounth;
              this.year=year;
          }
    public DateClass(){
          }
    public int getDay(){
        return day ;
    }
    public int getMounth(){
        return mounth;
    }
    public int getYear(){
        return year ;
    }
    public void setDay(int day){
        this.day=day;
    }
     public void setMounth(int mounth){
        this.mounth=mounth;
    }
     public void setYear(int year){
        this.year=year;
    }
     public String toString(){
         return (mounth+"/"+day+"/"+year);
     }
}
