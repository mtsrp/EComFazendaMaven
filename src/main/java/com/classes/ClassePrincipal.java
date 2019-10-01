/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import com.dao.ClienteDAO;
import com.entidade.ClienteEntidade;

/**
 *
 * @author mathe
 */
public class ClassePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClienteDAO cliDao = new ClienteDAO();
        ClienteEntidade cli = new ClienteEntidade(1, "Charisse");
        
        cliDao.insert(cli);
        
        
    }
    
}
