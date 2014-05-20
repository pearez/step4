package es.unileon;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.unileon.domain.Office;
import es.unileon.service.SimpleOfficeManager;

public class SimpleProductManagerTest {

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
        
        
        productManager.setOffices(office);

    }

    @Test
    public void testGetOfficesWithNoOffices() {
        productManager = new SimpleOfficeManager();
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
            productManager.addressChange(ADDRESS);
        }
        catch(NullPointerException ex) {
            fail("Products list is null.");
        }
    }

    @Test
    public void testChangeAddressWithEmptyListOfOffices() {
        try {
            productManager = new SimpleOfficeManager();
            productManager.setOffices(new ArrayList<Office>());
            productManager.addressChange(ADDRESS);
        }
        catch(Exception ex) {
            fail("Products list is empty.");
        }           
    }
    

}
