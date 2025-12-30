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
    public double getPreis(int biomeid, boolean ermaessigt) { //öffentliche Methode um den Preis anhand von Bedingungen abzurufen
        double grundpreis = 0.0; //Variable Grundpreis erstellt und Standard wert zugeordnet
        switch (biomeid) { //ordnet dem biom ein Preis zu
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
                break; // Suedamerika
            case 5:
                grundpreis = 20.0;
                break; // Australien & Ozeanien
            case 6:
                grundpreis = 22.0;
                break; // Tropisches Zentrum
            case 7:
                grundpreis = 24.0;
                break; // Meereswelt
            default: // Standardfall fals üngültige ID
                grundpreis = 0.0;
                break;
        }
        if (ermaessigt) { // wenn ermäßigt dann...
            grundpreis = grundpreis * 0.7; //...Multipliziere grundpreis * 0,7 // Beispiel: 30 % Rabatt
        }
        return grundpreis; // gebe denn Grundpreis zurück
    }
}
