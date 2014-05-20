package es.unileon.service;

import java.io.Serializable;
import java.util.List;

import es.unileon.domain.Office;

public interface OfficeManager extends Serializable {

    public void addressChange(String percentage);
    
    public List<Office> getOffices();

}