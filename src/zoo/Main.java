/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoo;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Maximillian Genrich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        boolean running = true; // bool Variable festgelegt --> wert auf wahr gestellt
        Scanner scanner = new Scanner(System.in); // Variable Scanner festgelegt und objekt erstellt
        ArrayList<Integer> biomeWahl = new ArrayList<>(); //Variable biomeWhal erstellt als ArrayList und objekt erstellt
        int anreiseWahl = 0; // Variable anreiseWahl erstellen und standart wert 0
        ArrayList<Integer> eventWahl = new ArrayList<>(); //Variable eventWahl einem neuen ArrayList erstellt
        Biome biome = new Biome(); // Neues objekt mit Variable erstellt
        Event event = new Event();// Neues objekt mit Variable erstellt
        Move move = new Move();// Neues objekt mit Variable erstellt
        int anzahlErwachsene = 0; // Erstellung der Variable für die anzahl an erwachsenen Personen
        int anzahlErmaessigt = 0; // Erstellung der Variable für die anzahl an ermäßigten Personen  
        Generator generator = new Generator(); //Erstellung eines Generator Objekts

        while (running) { //While schleife der Switch Case
            System.out.println("Willkommen im Zoo GolzschGenrich GmbH"); // Textprint für auswahlmenü
            System.out.println("Wählen sie eine Option aus");
            System.out.println("1. Personenanzahl wählen");
            System.out.println("2. Biom wählen");
            System.out.println("3. Anreise wählen");
            System.out.println("4. Events wählen");
            System.out.println("5. Warenkorb anzeigen");
            System.out.println("6. Bezahlen und Ticket anzeigen");
            System.out.println("7. About");
            System.out.println("0. Programm beenden");

            int choice = scanner.nextInt(); // int Variable festgelegt verweist auf den Scanner 

            switch (choice) {
                case 1: //1. Personenanzahl wählen
                    anzahlErwachsene = 0; // standard wert der Variable definieren
                    anzahlErmaessigt = 0; // standard wert der Variable definieren
                    while (anzahlErwachsene < 0 || anzahlErmaessigt < 0 || anzahlErwachsene + anzahlErmaessigt <= 0) { // while Schleife mit Bedingungen
                        System.out.println("Geben sie nun die Personen anzahl ein (Gesamt darf nicht 0 sein.) (alle Aktivitäten gelten für alle eingetragenen Personen)");
                        System.out.println("Geben sie die Anzahl an erwachsenen Personen ein:");
                        anzahlErwachsene = scanner.nextInt(); // Variable Scannerwert zugewiesen
                        System.out.println("Geben sie die Anzahl an ermäßigten Personen ein (darf auch 0 sein)");
                        anzahlErmaessigt = scanner.nextInt(); // Variable Scannerwert zugewiesen

                        if (anzahlErwachsene + anzahlErmaessigt <= 0) { // if anweisung für ungültige eingabe
                            System.out.println("Ungültige eingabe. Es muss mind. eine Person vorhanden sein");
                        }
                    }
                    break;
                case 2: // 2. Biom wählen
                    int biomeChoice = -1; //Variable biomeChoice(INTEGER)erstellt und Standard wert -1 zugewiesen --> damit die schleife startet

                    while (biomeChoice != 0) { //While schleife die läuft solange der wert nicht 0 ist  
                        System.out.println("Biome wählen. bitte Zahl eingeben (0 = fertig)"); //UX Textprint
                        System.out.println("1. Eurasien");
                        System.out.println("2. Afrika");
                        System.out.println("3. Nordamerika");
                        System.out.println("4. Südamerika");
                        System.out.println("5. Australien und Ozeanien");
                        System.out.println("6. tropisches Zentrum");
                        System.out.println("7. Meereswelt");
                        biomeChoice = scanner.nextInt(); // variable biomeChoice mit Scanner verbinden

                        if (biomeChoice == 0) { // wenn eingabe 0 ist muss hier nichts passieren da 0 eine steuerung für die Schleife darstellt

                        } else if (biomeChoice >= 1 && biomeChoice <= 7) { // wenn nicht 0 eingegeben wird und die Zahl zwischen 1 und 7 ist dann...
                            if (!biomeWahl.contains(biomeChoice)) { //wenn biomeChoice nicht schon in ArrayList ist dann...
                                biomeWahl.add(biomeChoice); //... füge es in das ArrayList
                                System.out.println("Hinzugefügt! Weitere Auswahl möglich (0 = fertig)"); //User feedback
                            } else {
                                System.out.println("Dieses Biom ist bereits im Warenkorb"); //wenn schon in ArrayList --> User feedback
                            }
                        } else {
                            System.out.println("Eingabe ist ungültig"); //wenn eingabe nicht 0 ist und auch nicht 1-7 dann...
                        }
                    }
                    break; // ende case 2
                case 3: //3. Anreise wählen
                    System.out.println("Wählen sie ihre bevorzugte Anreise");
                    System.out.println("1. PKW bis 3,5t 8€");
                    System.out.println("2. Bus/Wohnmobiel 15€");
                    System.out.println("3. eigene Anreise 0€");

                    int anreiseChoice = scanner.nextInt();

                    if (anreiseChoice >= 1 && anreiseChoice <= 3) {
                        anreiseWahl = anreiseChoice;
                        System.out.println("Anreise option gespeichert!");
                    } else {
                        System.out.println("Ungültige Eingabe");
                    }
                    break;
                case 4: //4. Events wählen
                    int eventChoice = -1; // erstellen einer Variable eventChoice um auszuwählen default wert auf -1 damit schleife startet

                    while (eventChoice != 0) {
                        //While schleife die läuft solange der wert nicht 0 ist
                        System.out.println("Wählen sie ihr zusatz Event aus: (wert 0 = fertig)"); // UX Textprint
                        System.out.println("1. Nahrungsversorgung von Ziegen");
                        System.out.println("2. Orca-Ausführung");
                        System.out.println("3. Nahrungsversorgung von Löwen");

                        eventChoice = scanner.nextInt(); //Variable wird Sacnner zugeordnet

                        if (eventChoice == 0) {
                            //null = steuerung der schleife
                        } else if (eventChoice >= 1 && eventChoice <= 3) { // wenn nicht 0 eingegeben wird und die Zahl zwischen 1 und 3 ist dann...
                            if (!eventWahl.contains(eventChoice)) { //wenn eventChoice nicht schon in ArrayList ist dann...
                                eventWahl.add(eventChoice); //... füge es in das ArrayList
                                System.out.println("Hinzugefügt! Weitere Auswahl möglich (0 = fertig)"); //User feedback
                            } else {
                                System.out.println("Dieses event ist bereits im Warenkorb"); //wenn schon in ArrayList --> User feedback
                            }
                        } else {
                            System.out.println("Eingabe ist ungültig"); //wenn eingabe nicht 0 ist und auch nicht 1-3 dann...
                        }
                    }

                    break; //ende Case 4
                case 5: //5. Warenkorb anzeigen
                    System.out.println("Warenkorb"); //Überschrift
                    
                    System.out.println("--- Biome ---");
                    System.out.println("ausgewählte Biome:");
                    if (biomeWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Biome ausgewählt"); //... ausgeben
                    } else {    //anderenfalls
                        for (int id : biomeWahl) { //Variable id angelegt und biomeWahl zugeordnet
                            System.out.println("- " + biome.getName(id));
                        }
                    }
                    System.out.println("--- Events ---");
                    System.out.println("ausgewählte Events"); //Überschrift
                    if (eventWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Events ausgewählt"); //... ausgeben
                    } else {  //anderenfalls
                        for (int id : eventWahl) { //Variable id angelegt und biomeWahl zugeordnet
                           System.out.println("- " + event.getName(id)); 
                        }
                    }
                    System.out.println("--- Anreise ---");
                    System.out.println("ausgewählte Anreise:"); //Überschrift
                    if (anreiseWahl == 0) { //Wenn anreiseWahl nichts gespeichert hat dann...
                        System.out.println("- Noch nicht ausgewaehlt"); //... ausgeben
                    } else { //anderenfalls
                        System.out.println("- " + move.getName(anreiseWahl));
                    }
                    break;  // ende Case 5
                case 6: //6. Bezahlen und Ticket anzeigen
                    System.out.println("========== Ticket ==========");
                    double gesamtpreis = 0.0; // Erstellung der Variable für den Gesamtpreis
                    if (anzahlErwachsene + anzahlErmaessigt <= 0) { // if anweisung damit user weis das keine person ausgewählt ist.
                        System.out.println("Bitte wählen sie zuerst die anzahl an Personen aus");
                        break;
                    }
                    System.out.println("--- Biome ---");
                    if (biomeWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Biome ausgewählt Bitte wählen sie ein Biom aus"); //... ausgeben
                        break;
                    } else {    //anderenfalls
                        for (int biomeid : biomeWahl) { //Variable biomeid biomeWahl zugeordnet
                            double pErwachsener = biome.getPreis(biomeid, false); // Variable mit getMethode verbunden (preis abrufen)
                            double pErmaessigt = biome.getPreis(biomeid, true); // Variable mit getMethode verbunden (preis abrufen)
                            String name = biome.getName(biomeid); // Variable name den wert von biome.getName gegben
                            double posten = pErwachsener * anzahlErwachsene + pErmaessigt * anzahlErmaessigt; // berechnung des einzelnen posten
                            gesamtpreis += posten; //akt. posten zu gesamt addiert
                            
                            System.out.println(name + ": " + anzahlErwachsene + " Erwachsene. x " + pErwachsener
                                    + " + " + anzahlErmaessigt + " Ermaessigte. x " + pErmaessigt
                                    + " = " + posten + " EUR");

                        }
                    }
                    System.out.println("--- Events ---");
                    if (eventWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Events ausgewählt"); //... ausgeben
                    } else {    //anderenfalls
                        for (int eventid : eventWahl) { //Variable eventid eventWahl zugeordnet
                            double pErwachsener = event.getPreis(eventid, false); // Variable mit getMethode verbunden (preis abrufen)
                            double pErmaessigt = event.getPreis(eventid, true); // Variable mit getMethode verbunden (preis abrufen)
                            String name = event.getName(eventid); // Variable name den wert von event.getName gegben
                            double posten = pErwachsener * anzahlErwachsene + pErmaessigt * anzahlErmaessigt; // berechnung des einzelnen posten
                            gesamtpreis += posten; //akt. posten zu gesamt addiert
                            
                            System.out.println(name + ": " + anzahlErwachsene + " Erwachsene. x " + pErwachsener
                                    + " + " + anzahlErmaessigt + " Ermaessigte. x " + pErmaessigt
                                    + " = " + posten + " EUR");

                        }
                    }
                    System.out.println("--- Anreise ---");
                    if (anreiseWahl == 0) { // wenn die Variable 0 ist dann...
                        System.out.println("Bitte wählen sie zuerst eine Anreise aus"); //... gebe das aus
                        break;
                    } else { //andernfalls
                        double posten = move.getPreis(anreiseWahl); //Variable posten den wert der getPreis Methode zugewiesen
                        String name = move.getName(anreiseWahl); // Variable name den wert von get.Name zugeordnet
                        gesamtpreis += posten; // posten zum gesamtpreis addiert 
                        
                        System.out.println(name + ": " + posten + " EUR");
                    }

                    System.out.println("Gesamtpreis:" + gesamtpreis + "  EUR"); // ausgabe des Gesamtpreises
                    
                    String ticketnr = generator.getTicketnr(); // Erstellung der lokalen Variablen und aufruf des Objetes und get.Methode
                    String barcode = generator.getBarcode(); //--||--
                    System.out.println("Ticketnummer: " + ticketnr); // Print Ticketnummer
                    System.out.println(barcode); // Print Barcode
                    System.out.println("================================================");
                    break;
                case 7:
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige eingabe");
            }

        }

    }

}
