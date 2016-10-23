package pl.ania;

import org.junit.Assert;
import org.junit.Test;

public class BoardTest {

    @Test
    public void shouldCreateBoard() throws Exception {
        //given
        int width = 10;
        int heigth = 10;
        //when
        Board board = new Board(width, heigth);
        //then

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < heigth; j++) {
                Assert.assertFalse(board.getCell(i, j).isAlive());
            }
        }
    }

    @Test
    public void setAlive() throws Exception {
        //given
        int width = 10;
        int height = 10;
        Board board = new Board(width, height);

        //when
        board.setCellAlive(2, 7);

        //then
        Assert.assertTrue(board.getCell(2, 7).isAlive());
    }

    @Test
    public void shouldCalculateNextStage() throws Exception {
        //given
        int width = 3;
        int height = 3;
        Board board = new Board(width, height);
        //when
        board.setCellAlive(0, 0);
        board.setCellAlive(0, 2);
        board.setCellAlive(1, 1);
        board.setCellAlive(2, 0);
        board.setCellAlive(2, 2);
        board.nextRound();

        //then
        Assert.assertTrue(board.getCell(0, 1).isAlive());
        Assert.assertTrue(board.getCell(1, 0).isAlive());
        Assert.assertTrue(board.getCell(1, 2).isAlive());
        Assert.assertTrue(board.getCell(2, 1).isAlive());
    }

    @Test
    public void shouldCountNeighbours() throws Exception {
        //given
        int width = 3;
        int height = 3;
        Board board = new Board(width, height);
        board.setCellAlive(0, 0);
        board.setCellAlive(0, 2);
        board.setCellAlive(1, 1);
        board.setCellAlive(2, 0);
        board.setCellAlive(2, 2);

        //when
        int aliveNeighbours = board.countAliveNeighbours(0, 0);

        //then
        Assert.assertEquals(1, aliveNeighbours);
        Assert.assertEquals(4, board.countAliveNeighbours(1,1));
    }
}
