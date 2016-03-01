package domein;

import java.util.List;
import persistentie.SpelMapper;

public class SpelRepository {
    private List<Spel> spellen;
    private SpelMapper spelMapper;
    
    public SpelRepository(){
        
        this.spelMapper = new SpelMapper();
        spellen = spelMapper.geefSpellen();
        
    }
    
    
    
    public List<Spel> getSpellen(){
    return spellen;
    }
    public String maakOverzicht(){
        String overzicht = "";
        
        if (spellen.isEmpty() ){
            overzicht = "De lijst is leeg";
        }
        else
        for (Spel spel : spellen){
            overzicht += spel;
        }
        return overzicht;
    }
    
    public void voegSpelToe(Spel spel) {
       
       
       spelMapper.voegSpelToe(spel);
    }
    
}
