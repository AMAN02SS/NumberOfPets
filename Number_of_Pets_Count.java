import java.util.*;
class Animal {  
  public static void main(String args[]) { 
        try{
       Scanner scn = new Scanner(System.in);
     
     int heads = scn.nextInt();
     int legs = scn.nextInt();
          if((heads!=0 && legs!=0) && (legs%2==0 && legs%4==0)){
     int count =0;
     count = (legs)-2*(heads);
     count = count/2;
     if(count>0){
     System.out.println(count);
     System.out.println(heads-count);
     }
    else{
      System.out.println("Negitive output");
    }
    }
          else{
            System.out.println("Invalid Input");
          }
        }
    catch(Exception e){
      System.out.println("Error");
    }
  } 
}