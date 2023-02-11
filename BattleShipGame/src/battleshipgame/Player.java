package BattleShipGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    protected String id;
    protected int points;
    private List<Torpedo> torpedos = new ArrayList<>(45);
    private List<Ship> ships = new ArrayList<>(6);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public List<Torpedo> getTorpedos() {
        return torpedos;
    }

    public void setTorpedos(List<Torpedo> torpedos) {
        this.torpedos = torpedos;
    }

    public List<Ship> getShips() {
        return ships;
    }

    public void setShips(List<Ship> ships) {
        this.ships = ships;
    }
    
    

    public void placeShip() {

    }

    public void fireTorpedo() {

    }

    public void checkHits() {

    }

    public void addPoints() {

    }

}
