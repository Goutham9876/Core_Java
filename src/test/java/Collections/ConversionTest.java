package Collections;

import org.junit.Assert;
import org.junit.Test;
import Pojo.Student;

import java.util.ArrayList;

public class ConversionTest {

    Conversion conversion = new Conversion();

    /***
     * Success scenario
     */
    @Test
    public void testConversionSuccess() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Nanda", "Ish", 3.5));
        students.add(new Student("Maha", "A", 3.1));
        students.add(new Student("Mahadev", "B", 3.8));
        String[] listNames = conversion.convertStudentNames(students);
        Assert.assertArrayEquals(new String[]{"Nanda", "Maha", "Mahadev"}, listNames);
    }

    /***
     * Edge case
     * Giving the empty array list and check the length of the string array.
     */
    @Test
    public void testConversionEdgeCase() {
        ArrayList<Student> students = new ArrayList<>();
        String[] listNames = conversion.convertStudentNames(students);
        Assert.assertEquals(0, listNames.length);
    }

}
