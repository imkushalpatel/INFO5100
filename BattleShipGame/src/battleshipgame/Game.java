package BattleShipGame;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String startTime;
    private String endTime;
    private String type;
    private List<Round> rounds = new ArrayList<>();
    private List<Player> players = new ArrayList<>(2);

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Round> getRounds() {
        return rounds;
    }

    public void setRounds(List<Round> rounds) {
        this.rounds = rounds;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void removePlayer(Player p) {
        players.remove(p);
    }

    public void addRound(Round r) {
        rounds.add(r);
    }

    public void removeRound(Round r) {
        rounds.remove(r);
    }

    public void startRound() {

    }

    public void endRound() {

    }

    public void addPlayerInRound() {

    }

    public void startGame() {

    }

    public void endGame() {

    }

}
