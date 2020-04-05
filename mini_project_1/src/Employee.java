import java.util.*;

class EmployeeContainer{
    int empNo;
    String empName;
    String joinDate;
    char designationCode;
    String designation;
    String department;
    int basic;
    int hra;
    int it;
    int da;
    int salary;

    void setValue(int emp_No, String emp_Name, String join_Date, char d_Code, String dept, int b, int h, int i) {
        empNo = emp_No;
        empName = emp_Name;
        joinDate = join_Date;
        designationCode = d_Code;
        department = dept;
        basic = b;
        hra = h;
        it = i;
        switch(d_Code) {
            case 'e': 
                designation = "Engineer";
                da = 20000;
                break;
            case 'c':
                designation = "Consultant";
                da = 32000;
                break;
            case 'k':
                designation = "Clerk";
                da = 12000;
                break;
            case 'r':
                designation = "Receptionist";
                da = 15000;
                break;
            case 'm':
                designation = "Manager";
                da = 40000;
                break;
        }

	salary = basic + hra + da - it;
    }
}

public class Employee{
    public static void main(String[] args){
        int flag =0;
	int index_arr = 0;
        int temp_id = 0;
	EmployeeContainer arr[] = new EmployeeContainer[7];

	for(int i=0;i<7;i++){
            arr[i] = new EmployeeContainer();
	}

        arr[0].setValue(1001, "Ashish", "01/04/2009", 'e', "R&D", 20000, 8000, 3000);
        arr[1].setValue(1002, "Sushma", "23/08/2012", 'c', "PM", 30000, 12000, 9000);
        arr[2].setValue(1003, "Rahul", "12/11/2008", 'k', "Acct", 10000, 8000, 1000);
        arr[3].setValue(1004, "Chahat", "29/01/2013", 'r', "Front Desk", 12000, 6000,2000);
        arr[4].setValue(1005, "Ranjan", "16/07/2005", 'm', "Engg", 50000, 20000, 20000);
        arr[5].setValue(1006, "Suman", "1/1/2000", 'e', "Manufacturing", 23000, 9000, 4400);
        arr[6].setValue(1007, "Tanmay", "12/06/2006", 'c', "PM", 29000, 12000, 10000);

        if(args.length>0) {
            temp_id = Integer.parseInt(args[0]);
            for(int i=0;i<7;i++) {
                if(temp_id == arr[i].empNo){
                    index_arr = i;
                    flag++;
                }
            }
        }

	if(flag==0){
            System.out.println("There is no employee with empid : "+temp_id);
	}
        else{
            System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");

            System.out.println(arr[index_arr].empNo+"\t"+arr[index_arr].empName+"\t\t"+arr[index_arr].department+"\t\t"+arr[index_arr].designation+"\t\t"+arr[index_arr].salary);
	}
    }
}