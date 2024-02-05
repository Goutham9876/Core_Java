package Collections;


import Pojo.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

    public class StudentData {
        /***
         *
         * @param students
         * @return
         */
        public ArrayList<Student> removeStudentsByGPA(ArrayList<Student> students) {
            double totalGPA = 0.0;
            for(Student student : students)
                totalGPA += student.getGpa();
            double averageGPA = totalGPA / students.size();
            ArrayList<Student> removeList = new ArrayList<>();
            for(Student student : students) {
                if(student.getGpa() < averageGPA)
                    removeList.add(student);
            }
            students.removeAll(removeList);
            return students;
        }
        /***
         * To retrieve the student data by name.
         * @param studentName
         * @return
         */
        public Student getStudentData(String studentName) {
            Map<String, Student> map = new HashMap<>();
            map.put("Goutham", new Student("Goutham", "N", 3.5));
            map.put("Ram", new Student("Ram", "K", 3.7));
            map.put("MahaDev", new Student("MahaDev", "H", 3.2));
            return  map.get(studentName);
        }

    }




