/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tim10.glavna_knjiga.validationutils;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author faruk
 */
public class ValidationUtils {
    
    public static Boolean IsCharDigit(String c)
    {
        Boolean da=false;

        char[] prebaciString = c.toCharArray();
        for (int i = 0; i < prebaciString.length; i++)
        {
            da = false;
            if (((prebaciString[i] >= '0') && (prebaciString[i] <= '9')))
                da = true;
        }
        return da;
    }
    
    public Boolean ValidirajJMBG(String JMBG)
	{
		List<Integer> l3 = new ArrayList<Integer>();
		if(IsCharDigit(JMBG))
		{
			for(char ch : JMBG.toCharArray())
			{
			 l3.add( Integer.valueOf(String.valueOf(ch)));
			}
		
			if (l3.size()!= 13)
	            return false;
	
	        else
	        {
	            Double eval = 0.0;
	            for (int i = 0; i < 6; i++)
	            {
	                eval += (7 - i) * (l3.get(i) + l3.get(i + 6));
	            }
	            return l3.get(12) == 11 - eval % 11;
	        }
		}
		else return false;
	}
    
    public  Boolean ValidirajIme(JTextField ime)
    {
        if(ime.getText().equals(""))
        {
            return true;
        }
        else
        {
            //ako nije prazno provjeri jel ima brojva itd...
            return false;
        }
    }
    
    public Boolean ValidirajPrezime(JTextField prezime)
    {
        if(prezime.getText().equals(""))
            return true;
        else 
            return false;
    }
    
    public Boolean ValidirajKorIme(JTextField korIme)
    {
        if(korIme.getText().equals(""))
            return true;
        else
            return false;
    }
    
    public Boolean ValidirajSifru(JTextField sifra)
    {
        if(sifra.getText().equals(""))
            return true;
        else
            return false;
    }
    
    public Boolean ValidirajJmbg(JTextField jmbg)
    {
        if(jmbg.getText().equals(""))
            return true;
        else
        {
            if(jmbg.getText().length() == 13)
            {
             System.out.println("Armala");
             return false;   
            }
            else 
            {
                return true;
            }
             
        }
           
    }
    
    public Boolean ValidirajAdresu(JTextField add)
    {
        if(add.getText().equals(""))
            return true;
        else
            return false;
    }
    
    public Boolean ValidirajTelefon(JFormattedTextField telefon)
    {
        /*if(telefon.getText().equals(""))
            return true;
        else
            return false;*/
        System.out.println(telefon.getText());
        if(telefon.getText().equals("+   -  -   -   "))
            return true;
        else return false;
       
    }
    
    public Boolean ValidirajFax(JFormattedTextField fax)
    {
        if(fax.getText().equals("+   -  -   -   "))
            return true;
        else return false;
    }
    
    public Boolean ValidirajEmail(JTextField email)
    {
        if(email.getText().equals(""))
            return true;
        else
            return false;
    }
    
    static Boolean validateJMBG(String jmbg) {
        return true;
    }
}
