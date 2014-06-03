package es.unileon;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unileon.domain.Office;
import es.unileon.repository.InMemoryOfficeDao;
import es.unileon.repository.OfficeDao;
import es.unileon.service.SimpleOfficeManager;

public class SimpleOfficeManagerTest {

    private SimpleOfficeManager productManager;
    
    private List<Office> office;
    
    private static int PRODUCT_COUNT = 1;
    
    private static String ADDRESS = new String ("Nocedo 34");
    private static String DESCRIPTION = "Office 1";
    

    
    @Before
    public void setUp() throws Exception {
        productManager = new SimpleOfficeManager();
        office = new ArrayList<Office>();
        
        // stub up a list of products
        Office product = new Office();
        product.setDescription(DESCRIPTION);
        product.setAddress(ADDRESS);
        office.add(product);
        
        OfficeDao officeDao = new InMemoryOfficeDao(office);
        productManager.setOfficeDao(officeDao);
        
     //   productManager.setOffices(office);

    }

    @Test
    public void testGetOfficesWithNoOffices() {
        productManager = new SimpleOfficeManager();
        productManager.setOfficeDao(new InMemoryOfficeDao(null));
        assertNull(productManager.getOffices());
    }

    @Test
    public void testGetProducts() {
        List<Office> products = productManager.getOffices();
        assertNotNull(products);        
        assertEquals(PRODUCT_COUNT, productManager.getOffices().size());
    
        Office product = products.get(0);
        assertEquals(DESCRIPTION, product.getDescription());
        assertEquals(ADDRESS, product.getAddress());
        
      
    }

    @Test
    public void testChangeAddressWithNullListOfOffices() {
        try {
            productManager = new SimpleOfficeManager();
            productManager.setOfficeDao(new InMemoryOfficeDao(null));
            productManager.addressChange(ADDRESS);
        }
        catch(NullPointerException ex) {
            fail("Office list is null.");
        }
    }

    @Test
    public void testChangeAddressWithEmptyListOfOffices() {
        try {
            productManager = new SimpleOfficeManager();
            productManager.setOfficeDao(new InMemoryOfficeDao(new ArrayList<Office>()));
            productManager.addressChange(ADDRESS);
        }
        catch(Exception ex) {
            fail("Offices list is empty.");
        }           
    }
    

}
