/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author Maddox
 */
public class Event {
    public double getPreis(int eventid, boolean ermaessigt) { //öffentliche Methode um den Preis anhand von Bedingungen abzurufen
        double grundpreis = 0.0; //Variable Grundpreis erstellt und Standard wert zugeordnet
        switch (eventid) { // ordnet dem Event ein Preis zu
            case 1:
                grundpreis = 20.0;
                break; // Nahrungsversorgung von Ziegen
            case 2:
                grundpreis = 50.0;
                break; // Orca-Show
            case 3:
                grundpreis = 30.0;
                break; // Nahrungsversorgung von Loewen
            default: // Standardfall fals üngültige ID
                grundpreis = 0.0;
                break;
        }
        if (ermaessigt) { // wenn ermäßigt dann...
            grundpreis = grundpreis * 0.7;  // ...Multipliziere grundpreis * 0,7 // Beispiel: 30 % Rabatt
        }
        return grundpreis; // gebe denn Grundpreis zurück
    }
    public String getName(int eventid) {
    switch (eventid) {
        case 1: return "Nahrungsversorgung von Ziegen";
        case 2: return "Orca-Show";
        case 3: return "Nahrungsversorgung von Löwen";
        default: return "Unbekanntes Event";
    }
}

}
