/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.List;
import java.util.Scanner;

public class Spel {

    private String spelNaam;
    private int aantalSpelers;
    
    private final int spelerNummer;
    
    public Spel(String spelNaam,int spelers,int spelerNummer) {
    this.spelNaam = spelNaam;
    this.aantalSpelers = spelers;
        
        this.spelerNummer = spelerNummer;
    }

    public String kiesSpel(List<String> spelNaam) {
          
          for (int teller = 0; teller < spelNaam.size();teller++){
          System.out.printf("Spel %d: %s",teller, spelNaam.get(teller));
    }
          int gekozenSpel;
          Scanner input = new Scanner(System.in);
          gekozenSpel = input.nextInt() ;
          
          return spelNaam.get(gekozenSpel);
    }

    public String getSpelNaam() {
    return spelNaam;
    }

    public void setSpelNaam(String spelNaam) {
        this.spelNaam = spelNaam;
    }

    public int getAantalSpelers() {
        return this.aantalSpelers;
    }

    public void setAantalSpelers(int aantalSpelers) {
        this.aantalSpelers = aantalSpelers;
    }

    public int getSpelerNummer() {
        return spelerNummer;
    }
    

   /* public void controleerAantalSpelers(int aantalSpelers) {

    }

    public void maakNieuwSpelAan() {
        
    }

    public String eersteBeurt() {
        
    }*/
    
    @Override
    public String toString() {
        return "Spelnaam: " + spelNaam + " aantalSpelers: " + aantalSpelers  ;
    }
    
}
