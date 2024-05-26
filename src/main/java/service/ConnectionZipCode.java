/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.google.gson.Gson;
import com.mycompany.projecta3.Util;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import model.Address;

/**
 *
 * @author laris
 */
public class ConnectionZipCode {
    public static Address searchCep(String cep) throws Exception {
        String siteUrl = "https://brasilapi.com.br/api/cep/v2/" + cep;
        int successCode = 200;
        
        URL url = new URL(siteUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoInput(true);
        try{
            if (connection.getResponseCode() != successCode)
                throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
            
            BufferedReader buff = new BufferedReader(new InputStreamReader((connection.getInputStream()), "utf-8"));
            String convertJsonToString = Util.convertJsonToString(buff);
            
            Gson gson = new Gson();
            Address address = gson.fromJson(convertJsonToString, Address.class);
            
            return address;
            
            
            
        }catch (Exception errorMsg) {
            throw  new Exception("Erro de conexão- status Code [" + connection.getResponseCode() + "]. " + errorMsg.toString()); 
        }
        
    
    
    }
}
