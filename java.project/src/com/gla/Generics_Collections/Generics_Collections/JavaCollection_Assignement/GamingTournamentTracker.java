package JavaCollection_Assignement;
import java.util.*;

class Player {
    int id;
    String name;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int hashCode() {
        return Objects.hash(id);
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Player)) return false;
        Player p = (Player) obj;
        return this.id == p.id;
    }

    public String toString() {
        return id + " - " + name;
    }
}

class Match {
    Player p1, p2;

    public Match(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public String toString() {
        return p1.name + " vs " + p2.name;
    }
}

class Result {
    Match match;
    Player winner;

    public Result(Match match, Player winner) {
        this.match = match;
        this.winner = winner;
    }

    public String toString() {
        return match + " -> Winner: " + winner.name;
    }
}

class Score implements Comparable<Score> {
    Player player;
    int points;

    public Score(Player player, int points) {
        this.player = player;
        this.points = points;
    }

    public int compareTo(Score s) {
        if (s.points != this.points) {
            return s.points - this.points;
        }
        return this.player.id - s.player.id;
    }

    public String toString() {
        return player.name + " : " + points;
    }
}

public class GamingTournamentTracker {
    public static void main(String[] args) {

        Set<Player> players = new HashSet<>();
        players.add(new Player(1, "Aman"));
        players.add(new Player(2, "Riya"));
        players.add(new Player(3, "Rahul"));
        players.add(new Player(1, "Duplicate"));

        Queue<Match> matchQueue = new LinkedList<>();

        Iterator<Player> it = players.iterator();
        Player a = it.next();
        Player b = it.next();
        Player c = it.next();

        matchQueue.add(new Match(a, b));
        matchQueue.add(new Match(b, c));

        List<Result> results = new ArrayList<>();
        Map<Player, Integer> scoreMap = new HashMap<>();

        for (Player p : players) {
            scoreMap.put(p, 0);
        }

        while (!matchQueue.isEmpty()) {
            Match m = matchQueue.remove();

            Player winner = m.p1;
            Result r = new Result(m, winner);
            results.add(r);

            scoreMap.put(winner, scoreMap.get(winner) + 10);
        }

        TreeSet<Score> leaderboard = new TreeSet<>();

        for (Map.Entry<Player, Integer> entry : scoreMap.entrySet()) {
            leaderboard.add(new Score(entry.getKey(), entry.getValue()));
        }

        System.out.println("Results:");
        for (Result r : results) {
            System.out.println(r);
        }

        System.out.println("\nLeaderboard:");
        for (Score s : leaderboard) {
            System.out.println(s);
        }
    }
}