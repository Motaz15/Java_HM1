
package homework1fordr_aalashgar;

import java.util.Scanner;

public class ITStudent extends Student{

    public ITStudent(int id, String name, String major) {
        this.id = id;

        this.name = name;
        this.major = major;
        this.grade = this.GetGrade();
    }
    
    public double GetGrade() { 

        Scanner in = new Scanner(System.in);

        System.out.println("Student :"+this.getName());
        System.out.println("enter mid mark");
        double mid = in.nextDouble();
        System.out.println("enter project mark");
        double proj = in.nextDouble();
        System.out.println("enter final mark");
        double fin = in.nextDouble();
        double gr = (.3*mid)+(proj*.3)+(40*fin);

        return gr;
    }
     
}
