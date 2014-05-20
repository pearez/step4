package es.unileon;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.service.SimpleOfficeManager;
import es.unileon.web.IndexController;

public class AddressChangeFormControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{		
        IndexController controller = new IndexController();
        controller.setProductManager(new SimpleOfficeManager());
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("index", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
        
	@SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}
