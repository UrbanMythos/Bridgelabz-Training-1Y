package JavaCollection_Assignement;
import java.util.*;

class Team implements Comparable<Team> {
    int id;
    String name;
    int points;

    public Team(int id, String name) {
        this.id = id;
        this.name = name;
        this.points = 0;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Team)) return false;
        Team t = (Team) obj;
        return this.id == t.id;
    }

    public int compareTo(Team t) {
        if (t.points != this.points) {
            return t.points - this.points;
        }
        return this.id - t.id;
    }

    public String toString() {
        return name + " | Points: " + points;
    }
}

class GameMatch {
    Team t1, t2;

    public GameMatch(Team t1, Team t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public String toString() {
        return t1.name + " vs " + t2.name;
    }
}

class MatchResult {
    GameMatch match;
    Team winner;

    public MatchResult(GameMatch match, Team winner) {
        this.match = match;
        this.winner = winner;
    }

    public String toString() {
        return match + " -> Winner: " + winner.name;
    }
}

public class SportsTournamentScheduler {
    public static void main(String[] args) {

        Set<Team> teams = new HashSet<>();

        Team a = new Team(1, "TeamA");
        Team b = new Team(2, "TeamB");
        Team c = new Team(3, "TeamC");

        teams.add(a);
        teams.add(b);
        teams.add(c);

        Queue<GameMatch> matchQueue = new LinkedList<>();
        matchQueue.add(new GameMatch(a, b));
        matchQueue.add(new GameMatch(b, c));
        matchQueue.add(new GameMatch(a, c));

        List<MatchResult> results = new ArrayList<>();

        while (!matchQueue.isEmpty()) {
            GameMatch m = matchQueue.remove();
            Team winner = m.t1;
            winner.points += 3;
            results.add(new MatchResult(m, winner));
        }

        TreeSet<Team> leaderboard = new TreeSet<>(teams);

        System.out.println("Results:");
        for (MatchResult r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Team t : leaderboard) {
            System.out.println(t);
        }
    }
}