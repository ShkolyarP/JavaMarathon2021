package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        Player player1 = new Player(random.nextInt(99) + 90);
        Player player2 = new Player(random.nextInt(99) + 90);
        Player player3 = new Player(random.nextInt(99) + 90);
        Player player4 = new Player(random.nextInt(99) + 90);
        Player player5 = new Player(random.nextInt(99) + 90);
        Player player6 = new Player(random.nextInt(99) + 90);
        Player player7 = new Player(random.nextInt(99) + 90);
        while (player3.getStamina() > 0) player3.run();
        System.out.println(Player.getCountPlayers());

    }
}

class Player {
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private int stamina;

//    public void setStamina(int playerStamina) {
//      this.stamina = stamina;
//}

    public int getStamina() {
        return stamina;
    }

    private static int countPlayers;

    public static int getCountPlayers() {
        return countPlayers;
    }

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6) countPlayers = 6;
    }

    void run() {
        stamina = stamina - 1;
        if (stamina == 0)
            countPlayers--;
    }

    public static void info() {
        if (countPlayers == 6)
            System.out.println("На поле нет свободных мест");
        else
            System.out.println("На поле ещё есть " + (6 - countPlayers) + "свободных мест");
    }
}