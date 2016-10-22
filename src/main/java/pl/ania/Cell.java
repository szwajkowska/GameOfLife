package pl.ania;

public class Cell {

    private boolean alive;

    public Cell(boolean alive) {
        this.alive = alive;
    }

    public boolean isAlive() {
        return alive;
    }

    public void checkNeighbours(int i) {
        if (alive) {
            if (i < 2 || i > 3) {
                alive = false;
            }

        } else {
            if (i == 3) {
                alive = true;
            }
        }

    }
}
