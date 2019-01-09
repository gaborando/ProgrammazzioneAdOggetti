package uniupo.gaborgalazzo.rogue.model.elements;

public abstract class Element {

    private int x;
    private int y;
    private int room;

    public Element(int room, int x, int y){
        this.room = room;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }
}
