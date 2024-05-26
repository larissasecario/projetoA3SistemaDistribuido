package com.mycompany.projecta3;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author laris
 */
public class Util {
    public static String convertJsonToString(BufferedReader buffereReader) throws IOException {
    
    String result, jsonString = "";
        
    while ((result = buffereReader.readLine()) != null) {
        jsonString += result;
    }
        
    return jsonString;
             
    }
}
