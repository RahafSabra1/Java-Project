package com.mycompany.finalprojects;
public class TaskClass {
                                
         private int id  ;
         private boolean iscompleted = false ; 
         private String description;
         DateClass duedate=new DateClass();
                                            /* project langauge Java */
                                          /* student name : Rahaf Sabra */

         public TaskClass(){
             // this do >> Reference to the current object  اشارة للكائن الحالي
         }
         public TaskClass(int id, String description ,boolean iscompleted , DateClass duedate){
             this.id=id;
             this.description=description;
             this.duedate=duedate;
             this.iscompleted=iscompleted;
         }
  
         public void setDesc(String Desc){
             this.description=Desc;
         }
         
         public String getDesc(){
             return description;
         }
         
         public void setid(int id1){
             this.id=id1;
         }
         
         public int getid(){
             return id;
         }
         
         public void setcomp(boolean Aa){
             this.iscompleted=Aa;
         }
         
         public boolean getcomp(){
             return iscompleted;
         }
         
         public  DateClass getDate(){
             return duedate;
         }
         
         public void setDate(DateClass duedate){
             this.duedate=duedate;
         }
    }
