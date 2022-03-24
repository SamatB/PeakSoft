package OOP.lesson16FinalProt.Task;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Student [] students = {new Student("Beganov Samat", LocalDate.of(1995, 3, 27),
                "samat@gmail.com"),
                            new Student("Muhammed Almazbekov", LocalDate.of(1996, 2, 12),
                                    "maga@gmail.com")};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
        System.out.println(" ");

        Student [] students1 = {new Student("Ahmedov Azamat", LocalDate.of(1994, 3, 27),
                "aza@gmail.com"),
                new Student("Yrysbaev Sanzhar", LocalDate.of(1993, 2, 12),
                        "sanzhar@gmail.com")};
        for (int i = 0; i < students1.length; i++) {
            System.out.println(students1[i]);
        }

        System.out.println(" ");
        Group group = new Group("Alanov Muhammed", students, "java",
                LocalDate.of(2022, 2, 3));
        System.out.println(group);

        Group group2 = new Group("Nurperi Arzymatova", students1, "JS",
                LocalDate.of(2022, 1, 15));

        Group [] groups = {group, group2};

        System.out.println(" ");

        Course course = new Course("PeakSoft Moscow", 779990101, groups);
        System.out.println(course);
    }

}
