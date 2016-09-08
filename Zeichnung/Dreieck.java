import java.awt.Polygon;

/**
 * Ein Dreieck, das manipuliert werden kann und sich selbst auf einer Leinwand
 * zeichnet.
 * 
 * @author Michael K�lling und David J. Barnes
 * @version 2006.03.30
 */

public class Dreieck {
    //Attribute
    private int hoehe;

    private int breite;

    private int xPosition;

    private int yPosition;

    private String farbe;

    private boolean istSichtbar;

    /**
     * Erzeuge ein Dreieck mit einer Standardfarbe an einer Standardposition.
     */
    public Dreieck() {
        hoehe = 30;
        breite = 40;
        xPosition = 50;
        yPosition = 15;
        farbe = "gruen";
        istSichtbar = false;
    }

    /**
     * Mache dieses Dreieck sichtbar. Wenn es bereits sichtbar ist, tue nichts.
     */
    public void sichtbarMachen() {
        istSichtbar = true;
        zeichnen();
    }

    /**
     * Mache dieses Dreieck unsichtbar. Wenn es bereits unsichtbar ist, tue
     * nichts.
     */
    public void unsichtbarMachen() {
        loeschen();
        istSichtbar = false;
    }

    /**
     * Bewege dieses Dreieck einige Bildschirmpunkte nach rechts.
     */
    public void nachRechtsBewegen() {
        horizontalBewegen(20);
    }

    /**
     * Bewege dieses Dreieck einige Bildschirmpunkte nach links.
     */
    public void nachLinksBewegen() {
        horizontalBewegen(-20);
    }

    /**
     * Bewege dieses Dreieck einige Bildschirmpunkte nach oben.
     */
    public void nachObenBewegen() {
        vertikalBewegen(-20);
    }

    /**
     * Bewege dieses Dreieck einige Bildschirmpunkte nach unten.
     */
    public void nachUntenBewegen() {
        vertikalBewegen(20);
    }

    /**
     * Bewege dieses Dreieck horizontal um 'entfernung' Bildschirmpunkte.
     */
    public void horizontalBewegen(int entfernung) {
        loeschen();
        xPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Dreieck vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void vertikalBewegen(int entfernung) {
        loeschen();
        yPosition += entfernung;
        zeichnen();
    }

    /**
     * Bewege dieses Dreieck langsam horizontal um 'entfernung'
     * Bildschirmpunkte.
     */
    public void langsamHorizontalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            xPosition += delta;
            zeichnen();
        }
    }

    /**
     * Bewege dieses Dreieck langsam vertikal um 'entfernung' Bildschirmpunkte.
     */
    public void langsamVertikalBewegen(int entfernung) {
        int delta;

        if (entfernung < 0) {
            delta = -1;
            entfernung = -entfernung;
        } else {
            delta = 1;
        }

        for (int i = 0; i < entfernung; i++) {
            yPosition += delta;
            zeichnen();
        }
    }

    /**
     * �ndere die H�he in 'neueHoehe' und die Breite in 'neueBreite'. Beide
     * Angaben m�ssen gr��er gleich Null sein.
     */
    public void groesseAendern(int neueHoehe, int neueBreite) {
        loeschen();
        hoehe = neueHoehe;
        breite = neueBreite;
        zeichnen();
    }

    /**
     * �ndere die Farbe dieses Dreiecks in 'neueFarbe'. G�ltige Angaben sind
     * "rot", "gelb", "blau", "gruen", "lila" und "schwarz".
     */
    public void farbeAendern(String neueFarbe) {
        farbe = neueFarbe;
        zeichnen();
    }

    /**
     * Zeichne dieses Dreieck mit seinen aktuellen Werten auf den Bildschirm.
     */
    private void zeichnen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            int[] xpoints = { xPosition, xPosition + (breite / 2),
                    xPosition - (breite / 2) };
            int[] ypoints = { yPosition, yPosition + hoehe, yPosition + hoehe };
            leinwand.zeichne(this, farbe, new Polygon(xpoints, ypoints, 3));
            leinwand.warte(10);
        }
    }

    /**
     * L�sche dieses Dreieck vom Bildschirm.
     */
    private void loeschen() {
        if (istSichtbar) {
            Leinwand leinwand = Leinwand.gibLeinwand();
            leinwand.entferne(this);
        }
    }
}
