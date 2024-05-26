package model;

import java.util.Map;

//{
//  "cep": "01001000",
//  "state": "SP",
//  "city": "São Paulo",
//  "neighborhood": "Sé",
//  "street": "Praça da Sé",
//  "service": "open-cep",
//  "location": {
//    "type": "Point",
//    "coordinates": {
//      "longitude": "-46.6344329",
//      "latitude": "-23.5507293"
//    }
//  }
//}
//




public class Address {
   private String cep;
   private String state;
   private String city;
   private String neighborhood;
   private String street;
   private Map<String, Object> location;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Map<String, Object> getLocation() {
        return location;
    }

    public void setLocation(Map<String, Object> location) {
        this.location = location;
    }

   

 
   
}
