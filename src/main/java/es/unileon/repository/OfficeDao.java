package es.unileon.repository;

import es.unileon.domain.Office;
import java.util.List;

public interface OfficeDao {

    public List<Office> getOfficeList();

    public void saveOffice(Office off);
}
