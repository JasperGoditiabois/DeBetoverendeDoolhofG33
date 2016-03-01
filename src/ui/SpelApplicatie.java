/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.DomeinController;
import java.util.Scanner;

/**
 *
 * @author Jasper
 */
public class SpelApplicatie {
    Scanner input = new Scanner(System.in) ;
    private final DomeinController domeinController;
    public SpelApplicatie(DomeinController domeinController) {
        
        this.domeinController = domeinController;
        int keuze = maakKeuze();
        switch(keuze){
            case 1: voegSpelToe();break;
            case 2: selecteerSpel();break;
        }
        
        /*switch (keuze){
            
            case 2: domeinController.toonSpellen();
            default : domeinController.toonSpellen();
        }*/
    }
    
    
    private int maakKeuze(){
        
    
    int keuze;
    System.out.printf("Maak je keuze:%n"
            + "1: Start nieuw spel%n"
            + "2: Laad spel%n");
    
    keuze = input.nextInt();
        return keuze;
    }
    
    private void selecteerSpel(){
        int keuze;
        System.out.println("Welk spel wilt u laden ?");
        String[] spellen = domeinController.toonSpellen();
        
         for (int index = 0; index < spellen.length;index++)
        {
            System.out.println(spellen[index]);
        }
         
         keuze = input.nextInt();
         
         System.out.printf("U koos voor spel %d",keuze);
    }
    private void voegSpelToe(){
        String spelNaam;
        int spelers;
        int spelerNummer;
        
        System.out.printf("Geef de naam van het spel: ");
        spelNaam = input.next();
        System.out.printf("Geef het aantal deelnemers: ");
        spelers = input.nextInt();
        System.out.printf("Geef jouw spelernummer op: ");
        spelerNummer = input.nextInt();
        
        
        domeinController.slaSpelOp(spelNaam,spelers,spelerNummer);
        
    }
}
