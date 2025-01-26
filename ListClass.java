package com.mycompany.finalprojects;
import java.util.Scanner;
public class ListClass {

    Scanner in =new Scanner(System.in);
    public static TaskClass[] tasks=new TaskClass[100];
    public static int nextId=1;
    public static int size=0;
    
     public  void run(){
        Scanner in= new Scanner(System.in);
        while(true){
        System.out.println("\nWhat would you like to do?");
        
        System.out.println(" 1.Add a new task \n 2.Remove an existing task \n 3.Edit a task \n 4.Mark a task as completed \n 5.List all task \n 6.Sort tasks by date \n 7.Exit");
        System.out.println("choose number 1..7:");
        int x= in.nextInt();
        switch(x){
        case 1:
            addTask();  
               System.out.println("\n\n\n\n***Task added successfully***\n\n");
               break;
        case 2:removeTask();
               break;
        case 3:editTask();
               break;
        case 4:System.out.println("ENTER THE ID:");
               int id=in.nextInt();
               MarkTaskAsCompleted(id);
               System.out.println("\nTask marked as completed\n");
               break;
        case 5:System.out.println("\nHere are all the tasks :\n");
               ListTask();
               break;
        case 6:sortTaskbydate();
               break;
        case 7:System.exit(0);
               break;
    }
        }
     }
    
    public   void addTask(){
    Scanner in= new Scanner(System.in);
    System.out.println("Enter Task Description:");
    String task=in.next();
    System.out.println("Enter task year:");
    int year=in.nextInt();
    System.out.println("Enter task mounth:");
    int mounth=in.nextInt();
    System.out.println("Enter task day:");
    int day=in.nextInt();
    System.out.println("Enter task IsCompleted:");
    boolean isCompleted1=in.nextBoolean();
    DateClass dueDate =new DateClass(day,mounth,year);
    tasks[size]=new TaskClass(nextId,task,isCompleted1,dueDate);
    size++;
    nextId++;
    }
 
    public  void editTask(){
        System.out.println("Enter ID:");
        int id1=in.nextInt();
        System.out.println("Enter Task Description:");
        String Desc=in.next();
        System.out.println("Enter task year:");
        int year=in.nextInt();
        System.out.println("Enter task mounth:");
        int mounth=in.nextInt();
        System.out.println("Enter task day:");
        int day=in.nextInt();
        System.out.println("Enter task IsCompleted:");
        boolean isCompleted1=in.nextBoolean();
        DateClass dueDate=new DateClass(day,mounth,year);
        tasks[id1-1].setid(id1);
        tasks[id1-1].setDesc(Desc);
        tasks[id1-1].setcomp(isCompleted1);
        tasks[id1-1].setDate(dueDate);
        }
    
       public void removeTask(){
        System.out.println("Enter ID:");
        int id1=in.nextInt();
        for(int i=--id1;i<size;i++){
            tasks[i]=tasks[i+1];
        }--size;
        for (int i = 0; i < size; i++) { 
            tasks[i].setid(i + 1);
        }
          System.out.println("\nTask removed successfully\n");
    }
public void ListTask(){
           System.out.println("Id\t\t\tDescriptions\t\tDue Date\t\tStatue ");
        for(int i=0;i<size;i++){
            System.out.println(tasks[i].getid()+"\t\t\t"+tasks[i].getDesc()+"\t\t"+tasks[i].getDate().toString()+"\t\t"+tasks[i].getcomp());  
            System.out.println("\n");
        }
    }
      public  void sortTaskbydate(){
          TaskClass temp ; // To Make Swap
          for (int i = 0; i <size; i++) {
          for (int j = i+1; j < size; j++) {     
           if(tasks[i].duedate.getDay()>tasks[j].duedate.getDay())
           {    
                 temp = tasks[i];    
                 tasks[i] = tasks[j];    
                 tasks[j] = temp;    
               } 
           if(tasks[i].duedate.getMounth()>tasks[j].duedate.getMounth())
           {   
                 temp = tasks[i];    
                 tasks[i] = tasks[j];    
                 tasks[j] = temp;    
               } 
           if(tasks[i].duedate.getYear()>tasks[j].duedate.getYear())
           {   
                 temp = tasks[i];    
                 tasks[i] = tasks[j];    
                 tasks[j] = temp;    
               } 
            }     
        }    
      }
          
      
      public   void MarkTaskAsCompleted(int id){
          tasks[id-1].setcomp(true);
         }
      }