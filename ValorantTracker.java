package ValorantTracker;

import java.util.*;

public class Main {
    static double KDA;
    static int totalKills;
    static int totalDeaths;
    static int totalAssists;

    public static void main(String[] args) {
        Game gameOne = new Game(24, 13, 7);
        Game gameTwo = new Game(14, 19, 12);
        Game gameThree = new Game(34, 21, 2);
        Game gameFour = new Game(8, 20, 5);
        Game gameFive = new Game(16, 24, 9);
        // Game gameSix = new Game(11, 19, 9);

        Queue<Game> games = new LinkedList<Game>();
        totalKills = gameOne.kills + gameTwo.kills +
                gameThree.kills + gameFour.kills + gameFive.kills;

        totalDeaths = gameOne.deaths + gameTwo.deaths +
                gameThree.deaths + gameFour.deaths + gameFive.deaths;

        totalAssists = gameOne.assists + gameTwo.assists +
                gameThree.assists + gameFour.assists + gameFive.assists;

        KDA = (totalKills + totalAssists) / totalDeaths;

        games.add(gameOne);
        games.add(gameTwo);
        games.add(gameThree);
        games.add(gameFour);
        games.add(gameFive);

        System.out.println("For your past 5 previous games your total kills is " + totalKills);
        System.out.println("For your past 5 previous games your total deaths is " + totalDeaths);
        System.out.println("For your past 5 previous games your total assists is " + totalAssists);
        System.out.println("For your past 5 previous games your KDA is " + KDA);

    }

}
