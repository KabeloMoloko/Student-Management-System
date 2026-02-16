package za.ac.cput;

import za.ac.cput.domain.GraduateStudent;
import za.ac.cput.domain.UndergraduateStudent;


public class Main {
    public static void main(String[] args) {
        UndergraduateStudent undergrad = new UndergraduateStudent.Builder()
                .setName("Matlakeng")
                .setId(12345)
                .setMajor("Computer Science")
                .setCreditHours(120)
                .setScholarshipAmount(5000.00)
                .build();

        // Create GraduateStudent using Builder
        GraduateStudent grad = new GraduateStudent.Builder()
                .setName("Kabelo Moloko")
                .setId(67890)
                .setMajor("Electrical Engineering")
                .setResearchAssistant(true)
                .setStipend(25000.00)
                .build();

        // Display details
        undergrad.displayStudentDetails();
        grad.displayStudentDetails();


    }
}