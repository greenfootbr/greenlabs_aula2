import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo1 extends World
{
    
    private int quadroAtual = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(296, 260, 1); 
        
        
        
    }
    
    public void act(){
        GreenfootImage cenario = new GreenfootImage("quadros/Mickey_e_Minnie_"+quadroAtual+".png");
        setBackground(cenario);
        quadroAtual++;
        if(quadroAtual == 14){
            quadroAtual =1;
        }
    }
}
