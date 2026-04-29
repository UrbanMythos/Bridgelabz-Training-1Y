package Generics_Collections.Generic;
import java.util.*;

abstract class CourseType {
    String typeName;

    public CourseType(String typeName) {
        this.typeName = typeName;
    }

    public String toString() {
        return typeName;
    }
}

class ExamCourse extends CourseType {
    public ExamCourse(String typeName) {
        super(typeName);
    }

    public String toString() {
        return "Exam Course: " + typeName;
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String typeName) {
        super(typeName);
    }

    public String toString() {
        return "Assignment Course: " + typeName;
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String typeName) {
        super(typeName);
    }

    public String toString() {
        return "Research Course: " + typeName;
    }
}

class UniversityCourse<T extends CourseType> {
    String courseName;
    T courseType;

    public UniversityCourse(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String toString() {
        return courseName + " | " + courseType;
    }
}

class CourseUtil {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c);
        }
    }
}

public class UniversityCourseSystem {
    public static void main(String[] args) {

        UniversityCourse<ExamCourse> c1 =
                new UniversityCourse<>("Math", new ExamCourse("Final Exam"));

        UniversityCourse<AssignmentCourse> c2 =
                new UniversityCourse<>("Java", new AssignmentCourse("Assignments"));

        UniversityCourse<ResearchCourse> c3 =
                new UniversityCourse<>("AI", new ResearchCourse("Project Research"));

        List<ExamCourse> examList = new ArrayList<>();
        examList.add(new ExamCourse("Midterm"));
        examList.add(new ExamCourse("Final"));

        List<AssignmentCourse> assignmentList = new ArrayList<>();
        assignmentList.add(new AssignmentCourse("Weekly Tasks"));

        List<ResearchCourse> researchList = new ArrayList<>();
        researchList.add(new ResearchCourse("Thesis"));

        System.out.println("Exam Courses:");
        CourseUtil.displayCourses(examList);

        System.out.println("\nAssignment Courses:");
        CourseUtil.displayCourses(assignmentList);

        System.out.println("\nResearch Courses:");
        CourseUtil.displayCourses(researchList);

        System.out.println("\nFull Course Details:");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}