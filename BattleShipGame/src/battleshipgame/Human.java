package BattleShipGame;

public class Human extends Player {

    public Human(String name) {
        this.name = name;
    }

    public Human() {
    }

    public Human(String id, int points, String name) {
        this.id = id;
        this.points = points;
        this.name = name;
    }

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
