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

        boolean running = true; // boolsche Variable festgelegt --> Wert auf wahr gestellt
        Scanner scanner = new Scanner(System.in); // Variable Scanner festgelegt und Objekt erstellt
        ArrayList<Integer> biomeWahl = new ArrayList<>(); // Variable biomeWahl erstellt als ArrayList und Objekt erstellt
        int anreiseWahl = 0; // Variable anreiseWahl erstellt und Standardwert 0 zugewiesen
        ArrayList<Integer> eventWahl = new ArrayList<>(); // Variable eventWahl erstellt als ArrayList und Objekt erstellt
        Biome biome = new Biome(); // Neues Objekt erstellt und Variable zugewiesen
        Event event = new Event(); // Neues Objekt erstellt und Variable zugewiesen
        Move move = new Move(); // Neues Objekt erstellt und Variable zugewiesen
        int anzahlErwachsene = 0; // Erstellung der Variable fuer die Anzahl an erwachsenen Personen
        int anzahlErmaessigt = 0; // Erstellung der Variable fuer die Anzahl an ermaessigten Personen
        Generator generator = new Generator(); // Erstellung eines Generator-Objekts

        while (running) { // While-Schleife der Switch-Case, steuert das Hauptmenü
            System.out.println("Willkommen im Zoo GolzschGenrich GmbH"); // Textausgabe fuer Auswahlmenue
            System.out.println("Waehlen sie eine Option aus");
            System.out.println("1. Personenanzahl waehlen");
            System.out.println("2. Biom waehlen");
            System.out.println("3. Anreise waehlen");
            System.out.println("4. Events waehlen");
            System.out.println("5. Warenkorb anzeigen");
            System.out.println("6. Bezahlen und Ticket anzeigen");
            System.out.println("7. About");
            System.out.println("0. Programm beenden");

            int choice = scanner.nextInt(); // int Variable festgelegt, verweist auf den Scanner und speichert den Rückgabe wert von scanner.nextInt().

            switch (choice) {
                case 1: // 1. Personenanzahl waehlen
                    anzahlErwachsene = 0; // Standardwert der Variable definieren
                    anzahlErmaessigt = 0; // Standardwert der Variable definieren
                    while (anzahlErwachsene < 0 || anzahlErmaessigt < 0 || anzahlErwachsene + anzahlErmaessigt <= 0) { // While-Schleife mit Bedingungen // läuft solange  wie negative Werte und < 0 Personen
                        System.out.println("Geben sie nun die Personenanzahl ein (Gesamt darf nicht 0 sein.) (alle Aktivitaeten gelten fuer alle eingetragenen Personen)");
                        System.out.println("Geben sie die Anzahl an erwachsenen Personen ein:");
                        anzahlErwachsene = scanner.nextInt(); // Variable Scannerwert zugewiesen (Rückgabewert)
                        System.out.println("Geben sie die Anzahl an ermaessigten Personen ein (darf auch 0 sein)");
                        anzahlErmaessigt = scanner.nextInt(); // Variable Scannerwert zugewiesen (Rückgabewert)

                        if (anzahlErwachsene + anzahlErmaessigt <= 0) { // if-Anweisung fuer ungueltige Eingabe
                            System.out.println("Ungueltige Eingabe. Es muss mind. eine Person vorhanden sein");
                        }
                    }
                    break;

                case 2: // 2. Biom waehlen
                    int biomeChoice = -1; // Variable biomeChoice (INTEGER) erstellt und Start Wert -1 zugewiesen --> damit die Schleife startet

                    while (biomeChoice != 0) { // While-Schleife laeuft, solange der Wert nicht 0 ist
                        System.out.println("Biome waehlen. Bitte Zahl eingeben (0 = fertig)"); // UX Textausgabe
                        System.out.println("1. Eurasien");
                        System.out.println("2. Afrika");
                        System.out.println("3. Nordamerika");
                        System.out.println("4. Suedamerika");
                        System.out.println("5. Australien und Ozeanien");
                        System.out.println("6. tropisches Zentrum");
                        System.out.println("7. Meereswelt");
                        biomeChoice = scanner.nextInt(); // Variable biomeChoice mit Scanner verbinden

                        if (biomeChoice == 0) { // wenn Eingabe 0 ist, muss hier nichts passieren, da 0 eine Steuerung fuer die Schleife darstellt

                        } else if (biomeChoice >= 1 && biomeChoice <= 7) { // wenn nicht 0 eingegeben wird und die Zahl zwischen 1 und 7 ist, dann...
                            if (!biomeWahl.contains(biomeChoice)) { // wenn biomeChoice nicht schon in ArrayList ist, dann...
                                biomeWahl.add(biomeChoice); // ... fuege es in die ArrayList
                                System.out.println("Hinzugefuegt! Weitere Auswahl moeglich (0 = fertig)"); // User-Feedback
                            } else {
                                System.out.println("Dieses Biom ist bereits im Warenkorb"); // wenn schon in ArrayList --> User-Feedback
                            }
                        } else {
                            System.out.println("Eingabe ist ungueltig"); // wenn Eingabe nicht 0 ist und auch nicht 1-7, dann...
                        }
                    }
                    break; // Ende Case 2

                case 3: // 3. Anreise waehlen
                    System.out.println("Waehlen sie ihre bevorzugte Anreise");
                    System.out.println("1. PKW bis 3,5t 8EUR");
                    System.out.println("2. Bus/Wohnmobil 15EUR");
                    System.out.println("3. eigene Anreise 0EUR");

                    int anreiseChoice = scanner.nextInt();

                    if (anreiseChoice >= 1 && anreiseChoice <= 3) {
                        anreiseWahl = anreiseChoice;
                        System.out.println("Anreiseoption gespeichert!");
                    } else {
                        System.out.println("Ungueltige Eingabe");
                    }
                    break;

                case 4: // 4. Events waehlen
                    int eventChoice = -1; // Erstellen einer Variable eventChoice zum Auswaehlen, Defaultwert auf -1, damit Schleife startet

                    while (eventChoice != 0) {
                        // While-Schleife laeuft, solange der Wert nicht 0 ist
                        System.out.println("Waehlen sie ihr Zusatz-Event aus: (Wert 0 = fertig)"); // UX Textausgabe
                        System.out.println("1. Nahrungsversorgung von Ziegen");
                        System.out.println("2. Orca-Show");
                        System.out.println("3. Nahrungsversorgung von Loewen");

                        eventChoice = scanner.nextInt(); // Rückgabewert von Scanner wird der Variable zugewiesen
                        if (eventChoice == 0) {
                            // 0 = Steuerung der Schleife
                        } else if (eventChoice >= 1 && eventChoice <= 3) { // wenn nicht 0 eingegeben wird und die Zahl zwischen 1 und 3 ist, dann...
                            if (!eventWahl.contains(eventChoice)) { // wenn eventChoice nicht schon in ArrayList ist, dann...
                                eventWahl.add(eventChoice); // ... fuege es in die ArrayList
                                System.out.println("Hinzugefuegt! Weitere Auswahl moeglich (0 = fertig)"); // User-Feedback
                            } else {
                                System.out.println("Dieses Event ist bereits im Warenkorb"); // wenn schon in ArrayList --> User-Feedback
                            }
                        } else {
                            System.out.println("Eingabe ist ungueltig"); // wenn Eingabe nicht 0 ist und auch nicht 1-3, dann...
                        }
                    }

                    break; // Ende Case 4

                case 5: // 5. Warenkorb anzeigen
                    System.out.println("Warenkorb"); // Ueberschrift

                    System.out.println("--- Biome ---");
                    System.out.println("ausgewaehlte Biome:");
                    if (biomeWahl.isEmpty()) { // wenn ArrayList leer ist, dann...
                        System.out.println("Es sind keine Biome ausgewaehlt"); // ... ausgeben
                    } else { // anderenfalls
                        for (int id : biomeWahl) { // Variable id angelegt und biomeWahl zugeordnet
                            System.out.println("- " + biome.getName(id));
                        }
                    }

                    System.out.println("--- Events ---");
                    System.out.println("ausgewaehlte Events"); // Ueberschrift
                    if (eventWahl.isEmpty()) { // wenn ArrayList leer ist, dann...
                        System.out.println("Es sind keine Events ausgewaehlt"); // ... ausgeben
                    } else { // anderenfalls
                        for (int id : eventWahl) { // Variable id angelegt und eventWahl zugeordnet
                            System.out.println("- " + event.getName(id));
                        }
                    }

                    System.out.println("--- Anreise ---");
                    System.out.println("ausgewaehlte Anreise:"); // Ueberschrift
                    if (anreiseWahl == 0) { // wenn anreiseWahl nichts gespeichert hat, dann...
                        System.out.println("- Noch nicht ausgewaehlt"); // ... ausgeben
                    } else { // anderenfalls
                        System.out.println("- " + move.getName(anreiseWahl));
                    }
                    break; // Ende Case 5

                case 6: // 6. Bezahlen und Ticket anzeigen
                    System.out.println("========== Ticket ==========");
                    double gesamtpreis = 0.0; // Erstellung der Variable fuer den Gesamtpreis
                    if (anzahlErwachsene + anzahlErmaessigt <= 0) { // if-Anweisung, um zu prüfen ob mind eine Person ausgewählt wurde
                        System.out.println("Bitte waehlen sie zuerst die Anzahl an Personen aus");
                        break;
                    }

                    System.out.println("--- Biome ---");
                    if (biomeWahl.isEmpty()) { // wenn ArrayList leer ist, dann...
                        System.out.println("Es sind keine Biome ausgewaehlt. Bitte waehlen sie ein Biom aus"); // ... ausgeben
                        break;
                    } else { // anderenfalls
                        for (int biomeid : biomeWahl) { // Variable biomeid biomeWahl zugeordnet
                            double pErwachsener = biome.getPreis(biomeid, false); // Variable mit getMethode verbunden (Preis abrufen)
                            double pErmaessigt = biome.getPreis(biomeid, true); // Variable mit getMethode verbunden (Preis abrufen)
                            String name = biome.getName(biomeid); // Variable name den Wert von biome.getName gegeben
                            double posten = pErwachsener * anzahlErwachsene + pErmaessigt * anzahlErmaessigt; // Berechnung des einzelnen Postens
                            gesamtpreis += posten; // aktuellen Posten zum Gesamtpreis addieren

                            System.out.println(String.format( // Methode zur String-Formatierung, z. B. für zwei Nachkommastellen in der Ausgabe
                                    "%s: %d Erwachsene x %.2f + %d Ermaessigte x %.2f = %.2f EUR",
                                    name, anzahlErwachsene, pErwachsener, anzahlErmaessigt, pErmaessigt, posten
                            ));
                        }
                    }

                    System.out.println("--- Events ---");
                    if (eventWahl.isEmpty()) { // wenn ArrayList leer ist, dann...
                        System.out.println("Es sind keine Events ausgewaehlt"); // ... ausgeben
                    } else { // anderenfalls
                        for (int eventid : eventWahl) { // Variable eventid eventWahl zugeordnet
                            double pErwachsener = event.getPreis(eventid, false); // Variable mit getMethode verbunden (Preis abrufen)
                            double pErmaessigt = event.getPreis(eventid, true); // Variable mit getMethode verbunden (Preis abrufen)
                            String name = event.getName(eventid); // Variable name den Wert von event.getName gegeben
                            double posten = pErwachsener * anzahlErwachsene + pErmaessigt * anzahlErmaessigt; // Berechnung des einzelnen Postens
                            gesamtpreis += posten; // aktuellen Posten zum Gesamtpreis addieren

                            System.out.println(String.format( // Methode zur String-Formatierung, z. B. für zwei Nachkommastellen in der Ausgabe
                                    "%s: %d Erwachsene x %.2f + %d Ermaessigte x %.2f = %.2f EUR",
                                    name, anzahlErwachsene, pErwachsener, anzahlErmaessigt, pErmaessigt, posten
                            ));
                        }
                    }

                    System.out.println("--- Anreise ---");
                    if (anreiseWahl == 0) { // wenn die Variable 0 ist, dann...
                        System.out.println("Bitte waehlen sie zuerst eine Anreise aus"); // ... gebe das aus
                        break;
                    } else { // andernfalls
                        double posten = move.getPreis(anreiseWahl); // Variable posten den Wert der getPreis-Methode zugewiesen
                        String name = move.getName(anreiseWahl); // Variable name den Wert von getName zugeordnet
                        gesamtpreis += posten; // Posten zum Gesamtpreis addieren

                        System.out.println(String.format("%s: %.2f EUR", name, posten)); // Methode zur String-Formatierung, z. B. für zwei Nachkommastellen in der Ausgabe
                    }

                    System.out.println(String.format("Gesamtpreis: %.2f EUR", gesamtpreis)); // Ausgabe des Gesamtpreises // Methode zur String-Formatierung, z. B. für zwei Nachkommastellen in der Ausgabe

                    String ticketnr = generator.getTicketnr(); // Erstellung der lokalen Variablen und Aufruf des Objekts und getMethode
                    String barcode = generator.getBarcode(); // Erstellung der lokalen Variablen und Aufruf des Objekts und getMethode
                    System.out.println("Ticketnummer: " + ticketnr); // Print Ticketnummer
                    System.out.println(barcode); // Print Barcode
                    System.out.println("================================================");
                    break;

                case 7: // About
                    System.out.println("=== About ===");
                    System.out.println("Zoo GolzschGenrich GmbH – Ticket- & Buchungssystem");
                    System.out.println();
                    System.out.println("Dieses Programm wurde im Rahmen eines Schulprojekts erstellt.");
                    System.out.println("Es handelt sich um eine Proof-of-Concept-Version,");
                    System.out.println("die grundlegende Konzepte wie Menüführung,");
                    System.out.println("Objektorientierung und Preisberechnung demonstriert.");
                    System.out.println();
                    System.out.println("Entwicklung:");
                    System.out.println("- Maximillian Genrich");
                    System.out.println("- Maddox Golzsch");
                    System.out.println();
                    System.out.println("Hinweis:");
                    System.out.println("Bei der Erstellung dieses Projekts wurde");
                    System.out.println("künstliche Intelligenz (KI) unterstützend verwendet.");
                    System.out.println();
                    System.out.println("Rechtlicher Hinweis:");
                    System.out.println("Der Quellcode und das Programmdesign");
                    System.out.println("sind geistiges Eigentum der Entwickler.");
                    System.out.println("Weitergabe oder Nutzung ohne Zustimmung ist nicht gestattet.");
                    System.out.println("Version: 2026.01.03");
                    break;

                case 0:
                    running = false;
                    break;

                default:
                    System.out.println("Ungueltige Eingabe");
            }
        }
    }
}
