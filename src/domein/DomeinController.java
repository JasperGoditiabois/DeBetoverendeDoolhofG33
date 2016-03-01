/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

import java.util.List;

/**
 *
 * @author Jasper
 */
public class DomeinController {
    
    private SpelRepository spelRepository;
    private Spel spel;
    public DomeinController(){
    spelRepository = new SpelRepository();
    }
    
    public void slaSpelOp(String spelNaam,int spelers,int spelerNummer){
        Spel nieuwSpel = new Spel(spelNaam,spelers,spelerNummer);
        setSpel(nieuwSpel);
        spelRepository.voegSpelToe(spel);
    }
    
    private void setSpel(Spel spel) {
        this.spel = spel;
    }
    
    public String[] toonSpellen(){
        List <Spel> lijst = spelRepository.getSpellen();
        String[] spellen = new String[lijst.size()];
        int index = 0;
        for (Spel sp:lijst){
            
            spellen[index++] = sp.toString();
    }
        return spellen;
    }
 
}
