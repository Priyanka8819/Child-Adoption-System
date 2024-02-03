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
public class ValidateEmailTextField extends InputVerifier{
 
     @Override
    public boolean verify(JComponent input) {
        
        String mail = ((JTextField) input).getText();
  
        String pat = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$" ;
     
        Pattern emailPattern = Pattern.compile(pat);
        Matcher matcher = emailPattern.matcher(mail);
        if (mail.length() > 0) {
            if (!matcher.matches()) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Please enter valid Email ID. ", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            else 
            {
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
