package StudyGroups.groupe;

import StudyGroups.student.Student;
import StudyGroups.student.comparators.StudentComparatorByAge;
import StudyGroups.student.comparators.StudentComparatorByName;

import java.util.*;

public class StudyGroup implements Iterable<Student>{
    private List<Student> studentList;
    public StudyGroup(){
        studentList = new ArrayList<>();
    }
    public void addStudent(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }
    public void sortByName(){
        studentList.sort(new StudentComparatorByName());
    }
    public void sortByAge(){
        studentList.sort(new StudentComparatorByAge());
    }

}
