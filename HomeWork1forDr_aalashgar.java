
package homework1fordr_aalashgar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;




public class HomeWork1forDr_aalashgar {

   
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("C:\\Users\\jit\\Desktop\\file");
     file.mkdir();
     FileOutputStream x=new FileOutputStream(file);
     PrintWriter x1=new PrintWriter(x, true);
       Student[] stu = new Student[5];

        stu[0]= (new ITStudent(15, "Samer", "software enginering"));
        stu[1]= (new ITStudent(16, "Motaz", "software enginering"));
        stu[2]= (new ArtStudent(17, "ahmed", "software enginering"));
        stu[3]= (new ArtStudent(12, "Ali", "software enginering"));



       Arrays.sort(stu,new Comparator<Student>(){
     @Override
      public int compare(Student x1,Student x2){
      return (int) (x1.getGrade()-x2.getGrade());}
        });
    
    
    }}
    
    

