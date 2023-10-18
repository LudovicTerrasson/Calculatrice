package controler;
import java.util.List;
import model.CalculatorModel;
import view.CalculatorGUI;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorControler implements EventHandler<ActionEvent>, CalculatorControlerInterface
{
    
    private TextField valeur;
    

    public TextField getValeur()
    {
        return valeur;
    }


    public void setValeur(String valeur)
    {
        this.valeur = valeur;
    }
    
    
    @Override
    public void handle(ActionEvent event, String texte) 
    {
        Object boutton = event.getSource();
        Button b = (Button) boutton;
 
        
        /*
        // Si l'utilisateur vient de faire une erreur 
        if("Veuillez choisir les deux opérandes avant de choisir l'opération".equals(lu))
        {
            // Suppression du message d'erreur et ajout du chiffre a l'écran
            view.CalculatorGUI.écran.setÉcran(); 
        }
        else
        {
            // Ajout du chiffre a l'écran
            écran.setText(lu+texte);
*/
        }
        if(texte=="push")
        {
            
        }
        else if(texte=="+")
        {
            
        }
        else if(texte=="-")
        {
            
        }
        else if(texte=="x")
        {
            
        }
        else if(texte=="/")
        {
            
        }
        else if(texte=="swap")
        {
            
        }
        else if(texte=="clear")
        {
            
        }
        
    }
    
    public void change(String accu)
    {
        
    }
    
     public void change(List<Double> stackData)
    {
        
    }
     
    public void callbackChange()
    {
        écran.setText(model.CalculatorModel.accu);
        mémoire.setText(model.CalculatorModel.pile);
    }


}