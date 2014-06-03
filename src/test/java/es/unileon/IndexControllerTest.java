package es.unileon;

import static org.junit.Assert.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import es.unileon.service.SimpleOfficeManager;
import es.unileon.web.IndexController;
import es.unileon.domain.Office;
import es.unileon.repository.InMemoryOfficeDao;

public class IndexControllerTest {

    @Test
    public void testHandleRequestView() throws Exception{		
        IndexController controller = new IndexController();
        SimpleOfficeManager offm = new SimpleOfficeManager();
        offm.setOfficeDao(new InMemoryOfficeDao(new ArrayList<Office>()));
        controller.setOfficeManager(offm);
        ModelAndView modelAndView = controller.handleRequest(null, null);		
        assertEquals("index", modelAndView.getViewName());
        assertNotNull(modelAndView.getModel());
	@SuppressWarnings("unchecked")
        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
        String nowValue = (String) modelMap.get("now");
        assertNotNull(nowValue);
    }
}
