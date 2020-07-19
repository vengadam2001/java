class EmployeeDetails{
    
    final long Employee_ID=1001;
    final String Employee_Name="stv",Employee_Skill="debug",Employee_Designation="CEO",type_of_work="Administrative";
    
    String Type_of_work(){
        return (type_of_work);
        }

}
public class Employe{
        public static void main(String[] args) {
        EmployeeDetails a=new EmployeeDetails();
        System.out.println("Employee_ID:" + a.Employee_ID);
        System.out.println("Employee_Name:" + a.Employee_Name);
        System.out.println("Employee_Skill:" + a.Employee_Skill);
        System.out.println("Employee_Designation:" + a.Employee_Designation);
        System.out.println("Work Type:" + a.Type_of_work());
    }
}