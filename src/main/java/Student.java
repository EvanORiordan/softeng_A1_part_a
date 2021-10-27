// @author Evan O'Riordan

public class Student {

    private String name; // name of student
    private String age; // age of student
    // Make this a string so that we can concatenate in the getUsername() method
    private String dateofbirth; // date of birth of student
    private int id; // id of student
    private String username; // student's username obtained using getUsername() at instantiation time
    private Course[] courses = {}; // courses this student has registered for
    private Module[] modules = {}; // modules this student has registered for

    public Student(String n,
                   String a,
                   String dob,
                   int i,
                   Course[] c,
                   Module[] m){
        name=n;
        age=a;
        dateofbirth=dob;
        id=i;
        getUsername();
        courses=c;
        modules=m;
    }

    public String getUsername(){
        username = name + age;
        return username;
    }


    public String getAge(){
        return age;
    }
    public void setAge(String s){
        age=s;
    }


    public String getDOB(){
        return dateofbirth;
    }
    public void setDOB(String s){
        dateofbirth=s;
    }


    public int getID(){
        return id;
    }
    public void setID(int i){
        id=i;
    }


    public Module[] getModules(){
        return modules;
    }
    public void setModules(Module[] m){
        modules=m;
    }


    public Course[] getCourses(){
        return courses;
    }
    public void setCourses(Course[] c){
        courses=c;
    }
}
