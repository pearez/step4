package es.unileon.repository;

import java.util.List;

import es.unileon.domain.Office;

public class InMemoryOfficeDao implements OfficeDao {

    private List<Office> officeList;

    public InMemoryOfficeDao(List<Office> officeList) {
        this.officeList = officeList;
    }

    public List<Office> getOfficeList() {
        return officeList;
    }

	public void saveOffice(Office off) {
	}
}