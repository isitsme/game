
package game;

public class player {
    String name ;
    int speed,healthpoin,damage,armor;
            
    void run(){
        int speed = 0; 
    System.out.println(name + "is running....");
    System.out.println("speed"+speed);
    }     
    void attack(String name){   
    System.out.println(name + "attacking....");  
    System.out.println("damege"+damage);
    }
    void defend(){
    System.out.println(name +"defending..." );
    System.out.println("defend"+armor);
    }
   boolean isdead(){
       if(healthpoin <=0)
       {
           return true;
       } 
       else{
       return false;   
       }
    }
    }
    
