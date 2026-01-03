/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author Maddox
 */
public class Move {

    public double getPreis(int anreiseWahl) { 
        // öffentliche Methode, um den Preis anhand von Bedingungen abzurufen

        double anreisePreis = 0.0; 
        // Variable anreisePreis erstellt und Standardwert zugeordnet

        switch (anreiseWahl) { // ordnet der Anreise einen Preis zu
            case 1:
                anreisePreis = 8.0;
                break; // PKW bis 3,5t 8€
            case 2:
                anreisePreis = 15.0;
                break; // Bus/Wohnmobil 15€
            case 3:
                anreisePreis = 0.0;
                break; // eigene Anreise 0€
            default: // Standardfall für ungültige ID
                anreisePreis = 0.0;
                break;
        }

        return anreisePreis; // gibt den anreisePreis zurück
    }

    public String getName(int anreiseWahl) { // gibt den Namen der Anreiseoption zurück
        switch (anreiseWahl) {
            case 1:
                return "PKW bis 3,5t";
            case 2:
                return "Bus/Wohnmobil";
            case 3:
                return "eigene Anreise";
            default:
                return "Unbekannte Anreise Option";
        }
    }

}
