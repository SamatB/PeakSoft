package OOP.lesson16FinalProt.Task;

import java.time.LocalDate;
import java.util.Arrays;

public class Group {
    private Student [] students;
    private String object;
    private LocalDate beginDate;
    private String instructorName;

    public Group () {

    }

    public Group (String instructorName, Student [] students, String object, LocalDate beginDate) {
        this.students = students;
        this.object = object;
        this.beginDate = beginDate;
        this.instructorName = instructorName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getObject () {
        return object;
    }

    public void setObject (String object) {
        this.object = object;
    }

    public LocalDate getBeginDate () {
        return beginDate;
    }
    public void setBeginDate (LocalDate beginDate) {
        this.beginDate = beginDate;
    }

    public void saveStudents(Student student) {
        if (student != null) {

        }
    }

    @Override
    public String toString() {
        return "Group: " +
                "students = " + Arrays.toString(students) +
                ", object = " + object+
                ", beginDate = " + beginDate +
                ", instructorName =" + instructorName;
    }
}
