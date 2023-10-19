package view;

import java.util.List;
import javafx.scene.control.Label;

public interface CalculatorGUIInterface       
{
    public String LireEcran();
    
    public void setEcran(String string);
    
    public Label getMemoire();
    
    public void setMemoire(List<Double> stackData);
}
