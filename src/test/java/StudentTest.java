import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void test1_getUsername() {

        DateTime sd1 = new DateTime(2021, 12, 28, 0, 0);
        DateTime ed1 = new DateTime(2022, 12, 28, 0, 0);

        Module m1 = new Module("Quantum Computing", "PH4321");
        Module m2 = new Module("Cosmology", "PH4322");
        Module module_array[] = {m1, m2};
        Course c1 = new Course("Theoretical Physics", module_array, sd1, ed1);
        Course course_array[] = {c1};
        Student s = new Student("SeanTobin", "21", "25/12/1999", 12345678, course_array, module_array);


        //System.out.println(m1.toString());
        //System.out.println(c1.toString());

        String expResult = "SeanTobin21";
        String result = s.getUsername();
        System.out.println("Expected result: "+expResult+"\nActual result: "+result+"\n");
        assertEquals(expResult, result);

    }

    @Test
    void test2_getUsername() {

        DateTime sd1 = new DateTime(2021, 12, 28, 0, 0);
        DateTime ed1 = new DateTime(2022, 12, 28, 0, 0);

        Module m1 = new Module("Quantum Computing", "PH4321");
        Module m2 = new Module("Cosmology", "PH4322");
        Module module_array[] = {m1, m2};
        Course c1 = new Course("Theoretical Physics", module_array, sd1, ed1);
        Course course_array[] = {c1};
        Student s = new Student("JohnMichael", "21", "25/12/1999", 12345678, course_array, module_array);

        String expResult = "JohnMichael21";
        String result = s.getUsername();
        System.out.println("Expected result: "+expResult+"\nActual result: "+result+"\n");
        assertEquals(expResult, result);

    }
}