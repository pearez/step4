package es.unileon;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.unileon.domain.*;
import es.unileon.repository.OfficeDao;


public class JPAOfficeDaoTest {

    private ApplicationContext context;
    private OfficeDao officeDao;

    @Before
    public void setUp() throws Exception {
        context = new ClassPathXmlApplicationContext("classpath:test-context.xml");
        officeDao = (OfficeDao) context.getBean("officeDao");
    }

    @Test
    public void testGetOfficeList() {
        List<Office> products = officeDao.getOfficeList();
        assertEquals(products.size(), 1, 0);	   
    }

    @Test
    public void testSaveOffice() {
        List<Office> products = officeDao.getOfficeList();
        String city = "Madrid";

        Office p = products.get(0);
        String desc = p.getCiudad();
        p.setCiudad(city);
        officeDao.saveOffice(p);

        List<Office> updatedProducts = officeDao.getOfficeList();
        Office p2 = updatedProducts.get(0);
        assertTrue(p.getCiudad() == city);

        p2.setCiudad(desc);
        officeDao.saveOffice(p2);
    }
}
