import java.awt.*;
import java.util.*;

public class SandLab
{
    //add constants for particle types here
    public static final int EMPTY = 0;
    public static final int METAL = 1;
    public static final int SAND = 2;
    public static final int WATER = 3;

    //do not add any more fields!
    private int[][] grid;
    private SandDisplay display; //SandDisplay is the GUI class

    public SandLab(int numRows, int numCols)
    {
        String[] names = new String[4];

        names[EMPTY] = "Empty";
        names[METAL] = "Metal";
        names[SAND] = "Sand";
        names[WATER] = "Water";

        display = new SandDisplay("Falling Sand", numRows, numCols, names);
        grid = new int[numRows][numCols];
    }

    /** called when the user clicks on a location using the given tool */
    private void locationClicked(int row, int col, int tool)
    {
        grid[row][col] = tool;
    }

    /** copies each element of grid into the display */
    public void updateDisplay()
    {
        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                int tool = grid[r][c];
                Color color = new Color(0,0,0);
                if(tool == EMPTY){
                    color = Color.BLACK;
                }else if(tool == METAL){
                    color = Color.GRAY;
                }else if(tool == SAND){
                    color = Color.YELLOW;
                }else if(tool == WATER){
                    color = Color.BLUE;
                }
                display.setColor(r, c, color);
            }
        }
    }

    /** called repeatedly, causes one random particle to maybe do something */
    public void step()
    {
        int rand1 = (int) (grid.length * Math.random());
        int rand2 = (int) (grid[0].length * Math.random());
        if((grid[rand1][rand2] == SAND)){
            if(rand1 == grid.length - 1){
            }else if(grid[rand1 + 1][rand2] == EMPTY){
                grid[rand1][rand2] = EMPTY;
                grid[rand1 + 1][rand2] = SAND;
            }else if(grid[rand1 + 1][rand2] == WATER){
                grid[rand1][rand2] = WATER;
                grid[rand1 + 1][rand2] = SAND;
            }
        }else if(grid[rand1][rand2] == WATER){
            int rand3 = (int) (3 * Math.random());
            if(rand3 == 0){
                if(rand1 == grid.length - 1){
                }else if(grid[rand1 + 1][rand2] == EMPTY){
                    grid[rand1][rand2] = EMPTY;
                    grid[rand1 + 1][rand2] = WATER;
                }
            }else if(rand3 == 1){
                if(rand2 == grid[0].length - 1){
                }else if(grid[rand1][rand2 + 1] == EMPTY){
                    grid[rand1][rand2] = EMPTY;
                    grid[rand1][rand2 + 1] = WATER;
                }
            }else if(rand3 == 2){
                if(rand2 == 0){
                }else if(grid[rand1][rand2 - 1] == EMPTY){
                    grid[rand1][rand2] = EMPTY;
                    grid[rand1][rand2 - 1] = WATER;
                }
            }
        }
    }

    //do not modify!
    public void run()
    {
        while (true)
        {
            for (int i = 0; i < display.getSpeed(); i++)
                step();

            updateDisplay();

            display.repaint();

            display.pause(1);  //wait for redrawing and for mouse

            int[] mouseLoc = display.getMouseLocation();

            if (mouseLoc != null)  //test if mouse clicked
                locationClicked(mouseLoc[0], mouseLoc[1], display.getTool());
        }
    }
}
