package Inheritance;

public class Inheritance1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Accessing Cricket player");
        CricketPlayer cp = new CricketPlayer();
        cp.exercise();
        cp.PlayMatch();

        System.out.println("\nAccessing Football player");
        FootballPlayer fp = new FootballPlayer();
        fp.exercise();
        fp.PlayMatch();

        System.out.println("\nAccessing Hockey player");
        HockeyPlayer hp = new HockeyPlayer();
        hp.exercise();
        hp.PlayMatch();
    }
}

class Player {  //PARENT CLASS
    public void exercise() {
        System.out.println("Player is exercising!");
    }

    public void PlayMatch() {
        System.out.println("Player is Playing!");
    }
}

//CHILD CLASS
class CricketPlayer extends Player {

}
//CHILD CLASS
class FootballPlayer extends Player {

}
//CHILD CLASS
class HockeyPlayer extends Player {

}

