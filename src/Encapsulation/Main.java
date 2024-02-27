package Encapsulation;

public class Main {
    public static void main(String[] args) {
//
//        Player player = new Player();
//        player.name = "Gil";
//        player.health = 30;
//        player.weapon = "Machine Gun";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 499;
//        player.loseHealth(21);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer gil = new EnhancedPlayer("Gil", 200, "Sword");
        System.out.println("Initial health is: " + gil.healthRemaining());
        // This gives back control to EnhancedPlayer Class
        //You are not affecting any other code (Black BOX)
        //More control over its data


    }
}
