package classes;

public class employeeDetails {

    int empId;
    String qualifications;

    employeeDetails(int empid,String qualifications)
    {
        this.empId=empid;
        this.qualifications=qualifications;
    }
    public boolean printthisscope()
    {
        System.out.println(this);
        return false;
    }

}
