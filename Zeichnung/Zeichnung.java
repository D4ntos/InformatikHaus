public class Zeichnung
{
    //Bezugsobjekte deklarieren: Unsere Zeichnung hat (bis jetzt) ein Quadrat (wand) und ein Dreieck (dach).
    private Quadrat wand;
    private Dreieck dach;
    private Quadrat schornstein;
    private Quadrat fenster;
    private Quadrat tuer;
    private Kreis sonne;
    

    /**
     * Erzeuge ein Exemplar der Klasse Zeichnung
     */
    public Zeichnung()
    {
        // Die Bezugsobjekte werden erzeugt. Dies geschieht immer mit "new ..."
        wand = new Quadrat();
        dach = new Dreieck();    
        schornstein = new Quadrat();
        fenster = new Quadrat();
        tuer = new Quadrat();
        sonne = new Kreis ();
    }

    /**
     * Zeichne die Zeichnung.
     */
    public void zeichne()
    {   
        // Die Wand wird an die richtige Position verschoben und sichtbar gemacht.
        wand.vertikalBewegen(80);
        wand.groesseAendern(100);
        wand.sichtbarMachen();        
        
        tuer.vertikalBewegen(80);
        tuer.sichtbarMachen(); 
        // Das Dach wird an die richtige Position verschoben und sichtbar gemacht.
        dach.groesseAendern(50, 140);
        dach.horizontalBewegen(60);
        dach.vertikalBewegen(70);
        dach.sichtbarMachen();
        
        sonne.horizontalBewegen(200);
        sonne.sichtbarMachen();
        
        fenster.farbeAendern("blau");
        fenster.vertikalBewegen(100);
        fenster.horizontalBewegen(20);
        fenster.sichtbarMachen();
        
    }    
}
