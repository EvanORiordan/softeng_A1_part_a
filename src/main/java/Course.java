// @author Evan O'Riordan
import org.joda.time.DateTime;

public class Course {

    private String courseName; // the name of the course e.g. "CS&IT"
    private Module[] modules = {}; // an array of the modules that are available to students enrolled in this course
    private Student[] students = {}; // an array of the students enrolled in this course
    private DateTime startDate; // when this course begins;
    // Use the special Joda DateTime class (see link to mvnrepository.com)
    private DateTime endDate; // when this course ends

    public Course(String cn, Module[] m, Student[] s, DateTime sd, DateTime ed){
        courseName=cn;
        modules=m;
        students=s;
        startDate=sd;
        endDate=ed;
    }

    public Course(String cn, Module[] m, DateTime sd, DateTime ed){
        courseName=cn;
        modules=m;
        startDate=sd;
        endDate=ed;
    }


    @Override
    public String toString(){
        return courseName;
    }

    public String getCourseName(){
        return courseName;
    }
    public void setCourseName(String s){
        courseName=s;
    }


    public Module[] getModules(){
        return modules;
    }
    public void setModules(Module[] m){
        modules=m;
    }


    public Student[] getStudents() {
        return students;
    }
    public void setStudents(Student[] s){
        students=s;
    }

    /*

    public String getStartDate(){
        return startDate;
    }
    public void setStartDate(String s){
        startDate=s;
    }


    public String getEndDate(){
        return endDate;
    }
    public void setEndDate(String s){
        endDate=s;
    }

     */
}
