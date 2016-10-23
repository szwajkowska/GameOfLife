package pl.ania;

import org.junit.Assert;
import org.junit.Test;

public class CellTest {

    @Test
    public void shouldSurvive(){
        //given
        Cell cell = new Cell(true);
        //when
        cell.checkNeighbours(2);
        //then
        Assert.assertTrue(cell.isAlive());
    }

    @Test
    public void shouldDieWithLoneliness() throws Exception {
        //given
        Cell cell = new Cell(true);
        //when

        //then
        Assert.assertFalse(cell.checkNeighbours(1));
    }

    @Test
    public void shouldRemainDead() throws Exception {
        //given
        Cell cell = new Cell(false);
        //when
        cell.checkNeighbours(2);
        //then
        Assert.assertFalse(cell.isAlive());
    }

    @Test
    public void shouldRemainAlive() throws Exception {
        //given
        Cell cell = new Cell(true);
        //when
        cell.checkNeighbours(2);
        //then
        Assert.assertTrue(cell.isAlive());
    }

    @Test
    public void shouldDieWithOverpopulation() throws Exception {
        //given
        Cell cell = new Cell(true);
        //when

        //then
        Assert.assertFalse(cell.checkNeighbours(5));
    }

    @Test
    public void shouldBeAliveAgain() throws Exception {
        //given
        Cell cell = new Cell(false);
        //when

        //then
        Assert.assertTrue(cell.checkNeighbours(3));
    }
}
