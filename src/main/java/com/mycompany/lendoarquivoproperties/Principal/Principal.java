
package com.mycompany.lendoarquivoproperties.Principal;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Principal {
    
    public static Properties getProp() throws IOException{
        Properties props = new Properties();
        FileInputStream file = new FileInputStream("src//main//java//properties//Propriedades.properties");
       
        props.load(file);
        return props;
    }
    
    public static void main(String[] args) throws IOException{
        String nome;
        int idade;
        String login;
        
        Properties prop = getProp();
        
        login = prop.getProperty("prop.server.login");
        idade = Integer.parseInt(prop.getProperty("prop.server.idade"));
        nome = prop.getProperty("prop.server.nome");
        
        System.out.println("Nome:" + nome + "\n" + 
                           "login:" + login + "\n" + 
                           "idade:" +idade);
    }
}
