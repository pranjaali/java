# java
javacodes for practice
//creating gui window in java ,which is not responsive
import java.lang.*;
import java.awt.*;
class MarvellousFrame
{
    public Frame fobj;
    public MarvellousFrame(String name)
    {
        fobj = new Frame(name);
        fobj.setSize(600,600);
        fobj.setVisible(true);
    }
}

public class Framedemo2 {
public static void main(String arg[])
{
    System.out.println("Print data on the console:");

    Frame fobj=new Frame("Marvellous");
    fobj.setSize(600,400);
    fobj.setVisible(true);
}
    
}
