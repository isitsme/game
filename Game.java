
package game;

public class Game {

    public static void main(String[] args) {
      //membuat objek
      player enemy = new player();
      player hero = new player();
    hero.name = "AB shadow";
    hero.speed = 31;
    hero.healthpoin =100;
    hero.damage = 20;
    hero.armor = 80;
    
    enemy.name = "SB KingKong"; 
    enemy.speed =30;
    enemy.healthpoin = 100;
    enemy.damage = 17;
    enemy.armor = 75;
    
    hero.run();
    hero.attack(enemy.name);
    enemy.attack(hero.name);
    if(hero.isdead());
    if(enemy.isdead());
        System.out.println("Game Over :(");
    }
    Drone moon
        
    }
}


