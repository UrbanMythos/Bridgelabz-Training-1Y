package StreamAPI.LambdaExpressionsProblemStatements.MethodReferences;
import java.util.*;
import java.util.function.Predicate;

class Patient {
    int id;
    boolean active;

    public Patient(int id, boolean active) {
        this.id = id;
        this.active = active;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }
}

public class PatientIdPrinter {

    public static void printFormattedId(int id) {
        System.out.println("PAT-" + id);
    }

    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient(101, true),
                new Patient(102, false),
                new Patient(103, true),
                new Patient(104, true)
        );

        Predicate<Patient> activePatients = Patient::isActive;

        patients.stream()
                .filter(activePatients)
                .map(Patient::getId)
                .forEach(PatientIdPrinter::printFormattedId);
    }
}