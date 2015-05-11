
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4
         *  0 - - X - - - - -
         *  1 - - - - X - - -
         *  2 - X X - - X X X
         *  3 - - - - - - - -
         *  4 - - - - - - - -
         *  
         *  
         *  
         *  0 - - - - - - - -
         *  1 - X X X - X X -
         *  2 - - - - - X X -
         *  3 - - - - - - X -
         *  4 - - - - - - - -
         *  
         *  0 - - X - - - - -
         *  1 - - X - X X X -
         *  2 - - X - X - - X
         *  3 - - - - - X X -
         *  4 - - - - - - - -
         *  
         *  
         *  0 - - - X - X - -
         *  1 - X X - X X X -
         *  2 - - - - X - - X
         *  3 - - - - - X X -
         *  4 - - - - - - - -
         *  
         *  
         *  0 - - - X - X - -
         *  1 - X X - X X X -
         *  2 - - - - X - - X
         *  3 - - - - - X X -
         *  4 - - - - - - - -
         *  
         *  
         *  0 - - X X - X X -
         *  1 - - X - - - X -
         *  2 - - - X X - - X
         *  3 - - - - - X X -
         *  4 - - - - - - - -
         *  
         */

        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
               // System.out.println("does it get here?");
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 0 && col == 2) ||
                (row == 2 && col == 0) ||
                (row == 2 && col == 1))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
         */
        //int count = 10;
        //assertEquals(10, count, 1e-6);
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        for(int x = 0; x<COLS; x++)
        {
            for(int y = 0; y<ROWS; y++)
            {
                if(    (x == 0 && y == 2) ||
                (x == 2 && y == 0) ||
                (x == 2 && y == 1))
                {
                    assertNotNull("expected alive cell at (" + x + ", " + y + ")");
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + x + ", " + y + ")");
                }

            }
        }

        // ...
    }
}

