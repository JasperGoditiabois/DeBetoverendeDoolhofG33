
import domein.DomeinController;
import ui.SpelApplicatie;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
import domein.DomeinController;
import ui.SpelApplicatie;

public class StartUp {
    public static void main(String[] args) {
        DomeinController domeinController = new DomeinController();
        SpelApplicatie spelApplicatie = new SpelApplicatie(domeinController);
    }
}


