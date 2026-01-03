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

    public double getPreis(int eventid, boolean ermaessigt) { 
        // öffentliche Methode, um den Preis anhand von Bedingungen abzurufen

        double grundpreis = 0.0; // Variable Grundpreis erstellt und Standardwert zugeordnet

        switch (eventid) { // ordnet dem Event einen Preis zu
            case 1:
                grundpreis = 20.0;
                break; // Nahrungsversorgung von Ziegen
            case 2:
                grundpreis = 50.0;
                break; // Orca-Show
            case 3:
                grundpreis = 30.0;
                break; // Nahrungsversorgung von Loewen
            default: // Standardfall für ungültige ID
                grundpreis = 0.0;
                break;
        }

        if (ermaessigt) { // wenn ermäßigt, dann...
            grundpreis = grundpreis * 0.7;  
            // ...Multipliziere Grundpreis * 0,7 (Beispiel: 30 % Rabatt)
        }

        return grundpreis; // gibt den Grundpreis zurück
    }

    public String getName(int eventid) { // gibt den Namen des Events anhand der ID zurück
        switch (eventid) {
            case 1:
                return "Nahrungsversorgung von Ziegen";
            case 2:
                return "Orca-Show";
            case 3:
                return "Nahrungsversorgung von Loewen";
            default:
                return "Unbekanntes Event";
        }
    }

}
