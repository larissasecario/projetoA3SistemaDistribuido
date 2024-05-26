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
import model.OpenWeather;

/**
 *
 * @author laris
 */
public class ConnectionGeocoding {
    public static OpenWeather searchOpenWather(String state, String country) throws Exception {
        
        String key = "f03bc3941a1a17b8ad431281c40400de";
        String completeUrl = String.format("https://api.openweathermap.org/data/2.5/weather?lat=%s&lon=%s&appid=%s", state, country, key);
        int successCode = 200;
        
        URL url = new URL(completeUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setDoInput(true);
        
        try{
            if (connection.getResponseCode() != successCode)
                throw new RuntimeException("HTTP error code : " + connection.getResponseCode());
            
            BufferedReader buff = new BufferedReader(new InputStreamReader((connection.getInputStream()), "utf-8"));
            String convertJsonToString = Util.convertJsonToString(buff);
            
            Gson gson = new Gson();
            OpenWeather openWeather = gson.fromJson(convertJsonToString, OpenWeather.class);
            
            System.out.println(convertJsonToString);
            return openWeather;
            
            
            
        }catch (Exception errorMsg) {
            throw  new Exception("Erro de conexão- status Code [" + connection.getResponseCode() + "]. " + errorMsg.toString()); 
        }
        
    
    
    }
}
