
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
    wand = new Quadrat();
    fenster = new Quadrat();
    dach = new Dreieck();
    
    wand.vertikalBewegen(y);
    wand.groesseAendern(100);
    dach.groesseAendern(100,50);
    dach.horizontalBewegen(100);
    dach.vertikalBewegen(y+100);
    fenster.groesseAendern(10);
    fenster.vertikalBewegen(y+40);
    fenster.horizontalBewegen(45);
    wand.sichtbarMachen();
    dach.sichtbarMachen();
    fenster.sichtbarMachen();

    }

    // Dienste

}
