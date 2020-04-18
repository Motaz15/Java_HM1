
package homework1fordr_aalashgar;

import java.util.ArrayList;

public abstract class Student {

    int id;
    String name,major;
    double grade;

    public Student() {
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    
    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    public ArrayList sortarr(ArrayList<Student> s){
        Student temp = null;
     for (int i = 1; i < s.size(); i++) {
    for (int j = i; j > 0; j--) {
     if (s.get(j).getGrade() < s.get(j-1).getGrade()) {
      temp = s.get(j);
     }
    }
   }
    


    return null;
    }
    

    
      
}
