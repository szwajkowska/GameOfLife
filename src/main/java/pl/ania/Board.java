package pl.ania;

public class Board {

    private  Cell[][] cells;
    private  Cell[][] newCells;

    public Board(int width, int height) {
        cells = new Cell[width][height];
        newCells = new Cell[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                cells[i][j] = new Cell(false);
                newCells[i][j] = new Cell(false);
            }
        }
    }

    public Cell getCell(int i, int j) {
        return cells[i][j];
    }

    public void setCellAlive(int i, int j) {
        cells[i][j] = new Cell(true);
    }

    public void nextRound() {

        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                int i1 = countAliveNeighbours(i, j);
                System.out.println("Sasiady dla komorki" + i + ", " + j + " " + i1);

                newCells[i][j] = new Cell(cells[i][j].checkNeighbours(i1));
                System.out.println("Ustawilem komorke " + i + ", " + j + " na " + newCells[i][j].isAlive());
            }
        }
        cells = newCells;
    }

    protected int countAliveNeighbours(int i, int j) {
        int count = 0;
        for (int k = i - 1; k <= i + 1; k++) {
            for (int l = j - 1; l <= j + 1; l++) {
                if (k >= 0 && k < cells.length && l >= 0 && l < cells[k].length && cells[k][l] != cells[i][j]) {
                    if (cells[k][l].isAlive()) {
                        count++;
                    }
                }

            }

        }
        return count;
    }
}
