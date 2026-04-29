package Generics_Collections.Generic;
import java.util.*;

abstract class JobRole {
    String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String toString() {
        return roleName;
    }
}

class SoftwareEngineerRole extends JobRole {
    public SoftwareEngineerRole(String roleName) {
        super(roleName);
    }

    public String toString() {
        return "Software Engineer: " + roleName;
    }
}

class DataScientistRole extends JobRole {
    public DataScientistRole(String roleName) {
        super(roleName);
    }

    public String toString() {
        return "Data Scientist: " + roleName;
    }
}

class ProductManagerRole extends JobRole {
    public ProductManagerRole(String roleName) {
        super(roleName);
    }

    public String toString() {
        return "Product Manager: " + roleName;
    }
}

class Resume<T extends JobRole> {
    String candidateName;
    T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public T getJobRole() {
        return jobRole;
    }

    public String toString() {
        return candidateName + " applying for " + jobRole;
    }
}

class ResumeUtil {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {
        System.out.println("Screening Resume: " + resume);
    }

    public static void processRoles(List<? extends JobRole> roles) {
        System.out.println("Processing Job Roles:");
        for (JobRole role : roles) {
            System.out.println(role);
        }
    }
}

public class ResumeScreeningSystem {
    public static void main(String[] args) {

        Resume<SoftwareEngineerRole> r1 =
                new Resume<>("Anshal", new SoftwareEngineerRole("Backend Developer"));

        Resume<DataScientistRole> r2 =
                new Resume<>("Rahul", new DataScientistRole("ML Engineer"));

        Resume<ProductManagerRole> r3 =
                new Resume<>("Sneha", new ProductManagerRole("Product Lead"));

        ResumeUtil.screenResume(r1);
        ResumeUtil.screenResume(r2);
        ResumeUtil.screenResume(r3);

        List<SoftwareEngineerRole> seRoles = new ArrayList<>();
        seRoles.add(new SoftwareEngineerRole("Frontend Developer"));
        seRoles.add(new SoftwareEngineerRole("Full Stack Developer"));

        List<DataScientistRole> dsRoles = new ArrayList<>();
        dsRoles.add(new DataScientistRole("Data Analyst"));

        System.out.println();
        ResumeUtil.processRoles(seRoles);

        System.out.println();
        ResumeUtil.processRoles(dsRoles);
    }
}