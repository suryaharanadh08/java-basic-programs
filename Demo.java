import java.util.*;
class Demo{
    
    public static void main(String args[]){
       String s = "nain";
       String temp = "";
       int count;
       for(int i=0;i<s.length();i++){
         count=0;
          for(int j=0;j<s.length();j++){
               if(s.charAt(i)==s.charAt(j)){
                    count++;
               }
          }
          if(count==1){
               temp=temp+s.charAt(i);
          }
       }
       System.out.println(temp);
        
    }
}