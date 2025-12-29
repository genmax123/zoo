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
        while (running) { //While schleife der Switch Case
            System.out.println("Willkommen im Zoo GolzschGenrich GmbH"); // Textprint für auswahlmenü
            System.out.println("Wählen sie eine Option aus");
            System.out.println("1. Biom wählen");
            System.out.println("2. Anreise wählen");
            System.out.println("3. Events wählen");
            System.out.println("4. Warenkorb anzeigen");
            System.out.println("5. Bezahlen und Ticket anzeigen");
            System.out.println("6. About");
            System.out.println("0. Programm beenden");

            int choice = scanner.nextInt(); // int Variable festgelegt verweist auf den Scanner 

            switch (choice) {
                case 1:
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
                    break; // ende case 1
                case 2:
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
                case 3:
                    int eventChoice = -1; // erstellen einer Variable eventChoice um auszuwählen default wert auf -1 damit schleife startet

                    while (eventChoice != 0) {
                        //While schleife die läuft solange der wert nicht 0 ist
                        System.out.println("Wählen sie ihr zusatz Event aus: (0 = fertig)"); // UX Textprint
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

                    break; //ende Case 3
                case 4:
                    System.out.println("Warenkorb"); //Überschrift

                    System.out.println("ausgewählte Biome:");
                    if (biomeWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Biome ausgewählt"); //... ausgeben
                    } else {    //anderenfalls
                        for (int id : biomeWahl) { //Variable id angelegt und biomeWahl zugeordnet
                            switch (id) { // Switch zum "übersetzen" der ids
                                case 1:
                                    System.out.println("- Eurasien");
                                    break;
                                case 2:
                                    System.out.println("- Afrika");
                                    break;
                                case 3:
                                    System.out.println("- Nordamerika");
                                    break;
                                case 4:
                                    System.out.println("- Suedamerika");
                                    break;
                                case 5:
                                    System.out.println("- Australien und Ozeanien");
                                    break;
                                case 6:
                                    System.out.println("- Tropisches Zentrum");
                                    break;
                                case 7:
                                    System.out.println("- Meereswelt");
                                    break;
                            }
                        }
                    }
                    System.out.println("ausgewählte Events"); //Überschrift
                    if (eventWahl.isEmpty()) { //Wenn ArrayList leer ist dann...
                        System.out.println("Es sind keine Events ausgewählt"); //... ausgeben
                    } else {  //anderenfalls
                        for (int id : eventWahl) { //Variable id angelegt und biomeWahl zugeordnet
                            switch (id) { // Switch zum "übersetzen" der ids
                                case 1:
                                    System.out.println("- Nahrungsversorgung von Ziegen");
                                    break;
                                case 2:
                                    System.out.println("- Orca-Show");
                                    break;
                                case 3:
                                    System.out.println("- Nahrungsversorgung von Loewen");
                                    break;
                            }
                        }
                    }
                    System.out.println("ausgewählte Anreise:"); //Überschrift
                    if (anreiseWahl == 0) { //Wenn anreiseWahl nichts gespeichert hat dann...
                        System.out.println("- Noch nicht ausgewaehlt"); //... ausgeben
                    } else { //anderenfalls
                        switch (anreiseWahl) { // Switch verwendet den gespeicherten Wert in anreiseWahl und "übersetzt"
                            case 1:
                                System.out.println("- PKW");
                                break;
                            case 2:
                                System.out.println("- Bus/Wohnmobil");
                                break;
                            case 3:
                                System.out.println("- OePNV / eigene Anreise");
                                break;
                        }
                    }
                break;  // ende Case 4
                case 5:
                    break;
                case 6:
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
