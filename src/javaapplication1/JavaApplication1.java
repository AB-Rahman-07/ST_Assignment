/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
/**
 *
 * @author mohammad.abdurrehman
 */
public class JavaApplication1 {
    /**
     * @param args the command line arguments
     */  
     boolean b; 
 public boolean func(int n){    
  int i,m=0,flag=0;     
  m=n/2;      
  if(n==0||n==1){  
   System.out.println(n+" is not prime number");  
   b = false;
  }else{  
   for(i=2;i<=m;i++){      
    if(n%i==0){      
     System.out.println(n+" is not prime number");      
     flag=1;
     b = false;
     break;      
    }      
   }      
   if(flag==0)  { System.out.println(n+" is prime number");
   b = true;
   }  
  }//end of else  
  return b;
}
    public static void main(String[] args) {
        // TODO code application logic here
        JavaApplication1 p = new JavaApplication1();
        p.func(5);
    }
}
