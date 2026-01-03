package zoo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Maddox
 */
public class Generator {

    public String getTicketnr() { // Erstellung einer getMethode zur Erstellung einer Ticketnummer
        long zeit = System.currentTimeMillis(); //Erstellung lokale Variable zeit mit Zeitstempel in ms
        int zufall = (int) (Math.random() * 1000); // Erstellung lokale Variable zufall 0-999
        String Ticketnr = "Zoo_GG_GmbH" + zeit + "-" + zufall; // Erstellung der Ticketnummer (String mit Prefix und den Variablen)
        return Ticketnr; //Rückgabewert der Ticketnummer
    }

    public String getBarcode() { //Erstellung einer getMethode zur Barcode Erstellung
        String Barcode = ""; // Erstellung einer lokalen Variable Barcode mit default Wert leer
        int laenge = 25; // lokale Variable zur Definition der Länge des Barcodes
        for (int i = 0; i < laenge; i++) { // for Schleife mit int i als Startwert = 0 | i muss kleiner 25 (länge) | für jeden Durchgang i um 1 erweitern
            if (Math.random() < 0.5) { // wenn zufällige Zahl kleiner 0.5... --> Warscheinlichkeit 50%
                Barcode += "|";   //...Balken
            } else { //anderenfalls
                Barcode += " ";   //...Lücke
            }
        }
        return Barcode; // Rückgabewert des Barcodes 
    }
}
