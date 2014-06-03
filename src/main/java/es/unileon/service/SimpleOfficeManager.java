package es.unileon.service;


import java.util.List;

import es.unileon.domain.Office;
import es.unileon.repository.OfficeDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SimpleOfficeManager implements OfficeManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private OfficeDao officeDao;

    public void setOfficeDao(OfficeDao officeDao) {
        this.officeDao = officeDao;
    }
    public List<Office> getOffices() {
    	return officeDao.getOfficeList();
    }

    public void addressChange(String address) {
    	List<Office> offices = officeDao.getOfficeList();
        if (offices != null) {
            for (Office offi : offices) {
                String newAddress =  address;
                offi.setAddress(newAddress);
                officeDao.saveOffice(offi);;
            }
        }  
    }
}