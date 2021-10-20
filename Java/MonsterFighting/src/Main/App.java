package Main;

import Creatures.Player;
import Weapons.Sword;

public class App {
    public static void main(String[] args) {
        Story story = new Story();
        Player player = new Player();

        System.out.println(story.greeting());
        player.setWeapon(
                new Sword((int)(Math.random()*10 + 10), "Меч")
        );
        System.out.println(player);
        for (int i = 0; i < 5; i++) {
            if (story.moveOn()){
                System.out.println("Бой " + (i + 1));
                if (player.fighting(i)){
                    System.out.println(story.win());
                    player.setHealth(player.restoreHealth());
                }else{
                    System.out.println(story.death());
                    break;
                }
            }
        }
        if (player.getHealth() > 0){
            System.out.println(story.goBackVillage());
        }
        System.out.println("Игра окончена");
    }
}
