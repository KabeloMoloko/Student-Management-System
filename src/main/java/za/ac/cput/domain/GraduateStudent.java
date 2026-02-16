package za.ac.cput.domain;

public class GraduateStudent extends Student{
    private boolean researchAssistant;
    private double stipend;

    // Private constructor to enforce Builder usage
    private GraduateStudent(String name, int id, String major, boolean researchAssistant, double stipend) {
        super(name, id, major);
        this.researchAssistant = researchAssistant;
        this.stipend = stipend;
    }

    // Implementation of abstract method
    @Override
    public void displayStudentDetails() {
        System.out.println("Graduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("Research Assistant: " + (researchAssistant ? "Yes" : "No"));
        System.out.println("Stipend: R" + stipend);
        System.out.println();
    }

    // Builder class for GraduateStudent
    public static class Builder {
        private String name;
        private int id;
        private String major;
        private boolean researchAssistant;
        private double stipend;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setMajor(String major) {
            this.major = major;
            return this;
        }

        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }

        public GraduateStudent build() {
            return new GraduateStudent(name, id, major, researchAssistant, stipend);
        }
    }
}
