package core;

public class Office {
    private Employee employee;

    public Office(Employee employee) {
        this.employee = employee;
    }

    public void test(){
        employee.printDepartment();
    }
}
