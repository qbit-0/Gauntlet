import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TeleFlash2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TeleFlash2 extends Particle
{
    BackgroundPlayer display;

    public TeleFlash2()
    {
        super();
        getImage().setTransparency(0);
        display = new BackgroundPlayer(this);
        display.add("default", "Particle", 256, 256, 18, 20);
        addPlayer(display);
        display.setOffset(0, -128);
        display.play("default", false, 10);
    }

    public void start()
    {
        super.start();
        Greenfoot.playSound("Randomize92.wav");
    }

    public void update()
    {
        super.update();
        if (isAtEdge())
            setV(0, 0);
        applyVel();

        if (display.isEnd())
            delete();
    }
}
