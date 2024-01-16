
package game;



public class Drone {
   class game {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi--;
        if(energi > 10){
            ketinggian++;
            System.out.println("Dorne terbang...");
        } else {
            System.out.println("Energi lemah: Drone nggak bisa terbang");
        }
    }
  void matikanMesin(){
     if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang");
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }
    void turun(){
      
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }
    void belok(){
        energi--;
        System.out.println("Drone belok");
        // belok ke mana? perlu dicek :)
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }
    void mundur(){
        energi--;
        System.out.println("Drone mundur");
        kecepatan++;
    }
   }
}