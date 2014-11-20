import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.*;

/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 100;
    private final int COLS = 100;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    
    private void makeActor(int x, int y){
        Grid<Actor> grid = world.getGrid();
        Rock rock1 = new Rock();
        Location loc1 = new Location(x, y);
        grid.put(loc1, rock1);
    }
    
    
    
    
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        makeActor(20,21);
        makeActor(20,20);
        makeActor(18,21);
        makeActor(18,21);
        makeActor(19,23);
        makeActor(20,24);
        makeActor(20,25);
        makeActor(20,25);
        makeActor(20,26);
        
        
        /*
        
        makeActor(20,20);
        makeActor(21,20);
        makeActor(22,20);
        makeActor(30,30);
        makeActor(31,30);
        makeActor(30,31);
        makeActor(31,31);
     */
    }
    
    private int neighbors(int x,int y){
        Grid<Actor> grid = world.getGrid();
        Location l = new Location(x,y);
        ArrayList n = grid.getNeighbors(l);
        int neighbor = n.size();
        return neighbor;

   
    }
    private void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        Grid<Actor> grid = world.getGrid();
        // create the grid, of the specified size, that contains Actors
        try {
             Thread.sleep(1000);                 //1000 milliseconds is one second.
          } catch(InterruptedException ex) {
          Thread.currentThread().interrupt();
          }

        ArrayList<Location> alive = new ArrayList<Location>(grid.getOccupiedLocations());
        ArrayList<Location> dead = new ArrayList<Location>();
        ArrayList<Location> kill = new ArrayList<Location>();
        ArrayList<Location> birth = new ArrayList<Location>();
        
        //fills dead array
        for (int x = 0; x<=this.COLS; x++){
            for (int y = 0; y<=this.ROWS; y++){
                Location l = new Location(x,y);
                if(!alive.contains(l)){
                    dead.add(l);
                }
                
            }
        }
        int n = 0;
        for(int x = 0;x <=this.COLS; x++){
            for(int y = 0; y<=this.ROWS; y++){
               

                n = neighbors(x,y);
                Location l = new Location(x,y);
                if (alive.contains(l)){
                    if (n<2 || n>3){
                        kill.add(l);
                    }
                
                }else{
                    if (n == 3){
                        //Rock r = new Rock();
                        //grid.put(l,r);
                        birth.add(l);
                    }
                }
        }
        }
        
        for(int x1 = 0; x1<=this.COLS; x1++){
            for(int y = 0; y<this.ROWS; y++){
                Location l = new Location(x1,y);
                if (kill.contains(l)){
                    grid.remove(l);
                }
                if(birth.contains(l)){
                    Rock r = new Rock();
                    grid.put(l,r);
                }
            }
        }
        
        world.show();
        
        
        
    }

        
        
        
        // insert magic here...
        
    
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args)
    {
        GameOfLife game = new GameOfLife();
        for(int i = 0; i<=100;){
        game.createNextGeneration();
    }
    }

}
