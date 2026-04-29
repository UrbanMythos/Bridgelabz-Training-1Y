package StreamAPI.StreamAPIProblemStatements;
import java.util.*;
import java.util.stream.Collectors;

class Doctor {
    String name;
    String specialty;
    boolean worksWeekends;

    public Doctor(String name, String specialty, boolean worksWeekends) {
        this.name = name;
        this.specialty = specialty;
        this.worksWeekends = worksWeekends;
    }
}

public class HospitalSystem {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Smith", "Cardiology", true),
                new Doctor("Dr. Jones", "Pediatrics", false),
                new Doctor("Dr. Brown", "Neurology", true),
                new Doctor("Dr. Davis", "Cardiology", true),
                new Doctor("Dr. Miller", "Pediatrics", true)
        );

        List<Doctor> weekendDoctors = doctors.stream()
                .filter(d -> d.worksWeekends)
                .sorted(Comparator.comparing(d -> d.specialty))
                .collect(Collectors.toList());

        weekendDoctors.forEach(d ->
                System.out.println(d.name + " - Specialty: " + d.specialty));
    }
}