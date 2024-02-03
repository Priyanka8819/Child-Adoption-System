/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Validations;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author devansh
 */
public class ValidateDateOfBirth extends InputVerifier{
    
     @Override
    public boolean verify(JComponent input) {
        String dob = ((JTextField) input).getText();
        
        String str = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$" ;
        Pattern pat = Pattern.compile(str);
        Matcher matcher = pat.matcher(dob);
        if (dob.length() > 0) {
            if (matcher.matches() != true) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please Enter Valid Date Of Birth (MM/DD/YYYY)", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            } 
            else {
                input.setBackground(Color.white);
                return true;
            }
        }    
        else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
