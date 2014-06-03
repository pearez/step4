package es.unileon.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="offices")
public class Office implements Serializable {

	private static final long serialVersionUID = 1L;

    private int totalExpenses;
    
    private int balance;
    
    @Id
    @Column(name = "description")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String description;
    
    private String address;
    
    private String ciudad;
    

    public Office(){}
    public Office(String description, String city, String address){
    	this.description = description;
    	this.ciudad = city;
    	this.address = address;
    }
 
    
    public String getDescription() {
        return description;
    }
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
       this.ciudad = ciudad;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getExpenses() {
        return totalExpenses;
    }

   
    public int getBalance() {
        return balance;
    }

    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + address);
        return buffer.toString();
    }

    public void setBalance(int balance){
    	this.balance = balance;
    }
    public void setTotalExpenses(int expenses) {
        this.totalExpenses = expenses;
     }
    public int getTotalExpenses(){
    	return this.totalExpenses;
    }
    

}