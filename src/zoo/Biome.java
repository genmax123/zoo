/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoo;

/**
 *
 * @author Maddox
 */
public class Biome {

    public double getPreis(int biomeid, boolean ermaessigt) { // Öffentliche Methode, um den Preis anhand von Bedingungen abzurufen
        double grundpreis = 0.0; // Variable Grundpreis erstellt und Standardwert zugeordnet

        switch (biomeid) { // ordnet dem Biom einen Preis zu
            case 1:
                grundpreis = 20.0;
                break; // Eurasien
            case 2:
                grundpreis = 18.0;
                break; // Afrika
            case 3:
                grundpreis = 19.0;
                break; // Nordamerika
            case 4:
                grundpreis = 18.0;
                break; // Südamerika
            case 5:
                grundpreis = 20.0;
                break; // Australien & Ozeanien
            case 6:
                grundpreis = 22.0;
                break; // Tropisches Zentrum
            case 7:
                grundpreis = 24.0;
                break; // Meereswelt
            default: // Standardfall für ungueltige ID
                grundpreis = 0.0;
                break;
        }

        if (ermaessigt) { // wenn ermäßigt, dann...
            grundpreis = grundpreis * 0.7; // ...multipliziere Grundpreis * 0.7 (Beispiel: 30 % Rabatt)
        }

        return grundpreis; // gibt den Grundpreis zurueck
    }

    public String getName(int biomeid) { // getName-Methode, um für die ausgewaehlte ID den passenden Namen zurückzugeben
        switch (biomeid) {
            case 1:
                return "Eurasien";
            case 2:
                return "Afrika";
            case 3:
                return "Nordamerika";
            case 4:
                return "Suedamerika";
            case 5:
                return "Australien und Ozeanien";
            case 6:
                return "Tropisches Zentrum";
            case 7:
                return "Meereswelt";
            default:
                return "Unbekanntes Biom";
        }
    }

}
