
/**
 * @author 
 * @version 
 */



public class Haus
{
    // Bezugsobjekte
    public int y = 0;
    public boolean ein = false;
    public byte stock = 0;
    public Quadrat wand;
    public Quadrat fenster;
    public Dreieck dach;
    

    // Attribute
   
    

   
    // Konstruktor
    public Haus()
    {
    wand= new Quadrat();
        wand.vertikalBewegen(y);
    dach.groesseAendern(100,50);
    dach.horizontalBewegen(100);
    dach.vertikalBewegen(y+100);
    wand.groesseAendern(50);

    }

    // Dienste

}
