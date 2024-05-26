
package model;

//{

import java.util.List;
import java.util.Map;

//
//{
//  "coord": {
//    "lon": 10.99,
//    "lat": 44.34
//  },
//  "weather": [
//    {
//      "id": 801,
//      "main": "Clouds",
//      "description": "few clouds",
//      "icon": "02d"
//    }
//  ],
//  "base": "stations",
//  "main": {
//    "temp": 290.58,
//    "feels_like": 290.26,
//    "temp_min": 287.8,
//    "temp_max": 291.85,
//    "pressure": 1016,
//    "humidity": 72,
//    "sea_level": 1016,
//    "grnd_level": 949
//  },
//  "visibility": 10000,
//  "wind": {
//    "speed": 1.33,
//    "deg": 8,
//    "gust": 1.27
//  },
//  "clouds": {
//    "all": 11
//  },
//  "dt": 1716648076,
//  "sys": {
//    "type": 2,
//    "id": 2004688,
//    "country": "IT",
//    "sunrise": 1716608373,
//    "sunset": 1716662808
//  },
//  "timezone": 7200,
//  "id": 3163858,
//  "name": "Zocca",
//  "cod": 200
//}



public class OpenWeather {
    private List<Map<String, String>> weather;;
    private Map<String, String> main;
    private Map<String, String> wind;
    private Map<String, String> sys;
    private String timezone;

  
    
    public List<Map<String, String>> getWeather() {
        return weather;
    }

    public void setWeather(List<Map<String, String>> weather) {
        this.weather = weather;
    }

    public Map<String, String> getMain() {
        return main;
    }

    public void setMain(Map<String, String> main) {
        this.main = main;
    }

    public Map<String, String> getWind() {
        return wind;
    }

    public void setWind(Map<String, String> wind) {
        this.wind = wind;
    }

    public Map<String, String> getSys() {
        return sys;
    }

    public void setSys(Map<String, String> sys) {
        this.sys = sys;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

  

    
    
    

   
    
    
    
}
