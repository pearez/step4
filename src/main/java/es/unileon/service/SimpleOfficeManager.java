package es.unileon.service;


import java.util.List;

import es.unileon.domain.Office;

public class SimpleOfficeManager implements OfficeManager {

    private static final long serialVersionUID = 1L;

    private List<Office> offices;

    public List<Office> getOffices() {
        return offices; 
    }

    public void addressChange(String address) {
        if (offices != null) {
            for (Office product : offices) {
                String newAddress =  address;
                product.setAddress(newAddress);
            }
        }  
    }
	
    public void setOffices(List<Office> office) {
        this.offices = office;
    }
}