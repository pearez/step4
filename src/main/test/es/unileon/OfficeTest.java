package es.unileon;


import es.unileon.domain.MalformedHandlerException;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import es.unileon.domain.Employee;
import es.unileon.domain.Handler;
import es.unileon.domain.DNIHandler;
import es.unileon.domain.Office;
import es.unileon.domain.OfficeHandler;


/**
 * @author Pedro
 *
 */
public class OfficeTest {

    Office testOffice;
    Office anotherTestOffice;
    Handler idTestOffice;
    Handler anotherIdOffice;
    Employee oneEmployee;
    DNIHandler dni;
    ArrayList<Employee> employeeTestList;

    int testExpenses;
    int totalExpenses;
    int totalIncome;
    
    

    @Before
    public void setUp() throws MalformedHandlerException {
        dni = new DNIHandler("36167364W");
        idTestOffice = new OfficeHandler(1234);
        oneEmployee = new Employee("name", "surname", "address", 0, dni);


//        testAccount = new CommercialAccountAccount();

  

        testExpenses = 1000;
        totalExpenses = 3000;
        totalIncome = 1000;

        testOffice.setExpenses(testExpenses, testExpenses, testExpenses);
    }

    @Test
    public void testGetIdOffice() {
        Handler expected = idTestOffice;
        Handler result = testOffice.getIdOffice();
        assertEquals(expected, result);

    }

    @Test
    public void testSetIdOffice() throws MalformedHandlerException {
        Handler idOffice = new OfficeHandler(5995);
        
//        testOffice.setIdOffice(idOffice); --> método no existente
        fail("Need to fix the method");

        Handler result = testOffice.getIdOffice();
        assertEquals(idOffice, result);
    }

    @Test
    public void testGetExpenses() {
        assertTrue(testOffice.getExpenses() == totalExpenses);
    }

    @Test
    public void testSetExpenses() {
        int newTestExpenses = 3000;
        int newTotalExenses = 9000;
        testOffice.setExpenses(newTestExpenses, newTestExpenses, newTestExpenses);

        assertTrue(newTotalExenses == testOffice.getExpenses());
    }

    @Test
    public void testGetTotalIncome() {
        testOffice.setTotalIncome(totalIncome);
        int result = testOffice.getTotalIncome();
        int expected = totalIncome;

        assertEquals(result, expected);
    }

    @Test
    public void testSetTotalIncome() {
        int testIncome = 3000;
        testOffice.setTotalIncome(totalIncome);
        int result = testOffice.getTotalIncome();
        int expected = totalIncome;

        assertEquals(result, expected);

        testOffice.setTotalIncome(testIncome);
        result = testOffice.getTotalIncome();

        assertTrue(result!=expected);

    }

    @Test
    public void testGetEmployeeList() {
        testOffice.setEmployeeList(employeeTestList);
        ArrayList<Employee> result = testOffice.getEmployeeList();
        ArrayList<Employee> expected = employeeTestList;

        assertEquals(result, expected);
    }

    @Test
    public void testSetEmployeeList() {
        testOffice.setEmployeeList(employeeTestList);
        ArrayList<Employee> result = testOffice.getEmployeeList();
        ArrayList<Employee> expected = employeeTestList;

        assertEquals(result, expected);

    }


    @Test
    public void testAddEmployee() {
        testOffice.setEmployeeList(employeeTestList);
        testOffice.addEmployee(oneEmployee);

        Employee result = employeeTestList.get(0);
        Employee expected = oneEmployee;

        assertEquals(result, expected);

    }

    @Test
    public void testDeleteEmployee() {
        testOffice.setEmployeeList(employeeTestList);
        testOffice.addEmployee(oneEmployee);

        Employee result = employeeTestList.get(0);
        Employee expected = oneEmployee;

        assertEquals(result, expected);

        testOffice.deleteEmployee(oneEmployee);
        assertTrue(employeeTestList.isEmpty());
    }



}
