import java.util.*;

public class Game {
    private Team team1;
    private Team team2;
    private int week;
    private HashMap<Player, Integer> fantasyPoints;

    public Game(Team t1, Team t2, int week) {
        team1 = t1;
        team2 = t2;
        this.week = week;
        fantasyPoints = new HashMap<>();
    }

    public void addPlayerPoints(Player p, int points) {
        fantasyPoints.put(p, points);
    }

    public int getWeek() {
        return week;
    }
}
