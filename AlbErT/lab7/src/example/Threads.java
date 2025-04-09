
package example;

class firstthread implements Runnable{
public void run(){
    for(int i=2;i<50;i++){
        System.out.println(+i);
    }
}
}
class secondthread implements Runnable{
  public void run(){
      
      for(int i=2;i<200;i++){
          int prime=0;
          
      for(int j=2;j<=i/2;j++){
          
        if(i%j==0){
            prime=1;
            break;
        }  
          
      }
      
     if(prime==0){
         System.out.println(+i);
     }
      }
  }  

}

public class Threads {
    
    public static void main(String[]args){
        
        Thread t1=new Thread(new firstthread);
        Thread t2=new Thread(new secondthreads); 
        
        t1.start();
        t2.start();
    }
    
}
