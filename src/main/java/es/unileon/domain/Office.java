package es.unileon.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Office implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final long MAX_ACCOUNT_NUMBER = 1000000000l - 1;
    /**
     *
     */

    private Handler id;
    /**
     *
     */
    private long nextAccountNumber;
    /**
     * The costs of the local of the office
     */
    private int localCost;
    /**
     * The costs of the light, water and gas of the office
     */
    private int utilitiesCost;
    /**
     * The expenses in the salaries of the employees
     */
    private int employeeCost;
    /**
     * The total expenses or costs of the office
     */
    private int totalExpenses;
    /**
     * The total income of the office
     */
    private int totalIncome;
    /**
     * The total balance of the office
     */
    private int balance;
    /**
     * The list of employees of this office
     */
    private String description;
    private String address;
    private String ciudad;
    
    private ArrayList<Employee> employeeList;

    public Office(){}
    public Office(Handler id) {
        this.id = id;
        this.nextAccountNumber = 0;
        this.employeeList = new ArrayList<Employee>();
    }

    public Handler getIdOffice() {
        return this.id;
    }   
    
    
    public String getDescription() {
        return description;
    }
    public String getciudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
       this.ciudad = ciudad;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public int getExpenses() {
        return totalExpenses;
    }

    public boolean addEmployee(Employee employee) {
        return employeeList.add(employee);
    }

    /**
     * Deletes an employee to the list of employees
     *
     * @param employee
     * @return
     */
    public boolean deleteEmployee(Employee employee) {
        return employeeList.remove(employee);
    }
    /**
     * Sets the total expenses of the office
     */
    public void setExpenses(int localCost, int utilitiesCost, int employeeCost) {

        this.localCost = localCost;
        this.utilitiesCost = utilitiesCost;
        this.employeeCost = employeeCost;

        this.totalExpenses = this.localCost + this.utilitiesCost
                + this.employeeCost;
    }

    /**
     * Returns the income of the office
     */
    public int getTotalIncome() {
        return totalIncome;
    }

    /**
     * Sets the total income of the office
     */
    public void setTotalIncome(int totalIncome) {
        // Addition of the types of incomes.
        this.totalIncome = totalIncome;
    }

    /**
     * Returns the balance of the office
     */
    public int getBalance() {
        return balance;
    }

    /**
     * Sets the total balance of the office
     */
    public void setBalance() {
        this.balance = this.totalIncome - this.totalExpenses;
    }
    
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("Description: " + description + ";");
        buffer.append("Price: " + address);
        return buffer.toString();
    }

    public void setBalance(int balance){
    	this.balance = balance;
    }
    public void setTotalExpenses(int expenses) {
        this.totalExpenses = expenses;
     }
    public int getTotalExpenses(){
    	return this.totalExpenses;
    }
    public ArrayList<Employee> getEmployeeList() {
        return new ArrayList<Employee>(employeeList);
    }

    /**
     * Sets the list of employees of the office
     */
    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}