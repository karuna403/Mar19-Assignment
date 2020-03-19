public class Employee{
    public String Name;
    private long Yearofjoining;
    
    public String Address;
    Employee(){}
    Employee(String name, long yearofjoining,  String address){
        Name=name;
        Yearofjoining=yearofjoining;
        
        Address=address;
    }
    
    public void EmployeeDetails(){
        
        System.out.println(Name+"\t"+Yearofjoining+"\t\t\t"+Address);
         
        
    }
    public static void main(String[] args){
        Employee e1=new Employee("Robert",1994, "64C-WallStreet");
        Employee e2=new Employee("Sam  ",2000, "68D-Wallstreet");
        Employee e3=new Employee("John ",1999, "24B-Wallstreet");
        System.out.println("Name\t"+"Yearofjoining\t"+"Address");
        e1.EmployeeDetails();
        e2.EmployeeDetails();
        e3.EmployeeDetails();
        
    }
}

