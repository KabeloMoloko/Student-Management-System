package za.ac.cput.domain;

public class UndergraduateStudent extends Student{
    private int creditHours;
    private double scholarshipAmount;

    // Private constructor to enforce Builder usage
    private UndergraduateStudent(String name, int id, String major, int creditHours, double scholarshipAmount) {
        super(name, id, major);
        this.creditHours = creditHours;
        this.scholarshipAmount = scholarshipAmount;
    }

    // Implementation of abstract method
    @Override
    public void displayStudentDetails() {
        System.out.println("Undergraduate Student Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Major: " + major);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship Amount: R" + scholarshipAmount);
        System.out.println();
    }

    // Builder class for UndergraduateStudent
    public static class Builder {
        private String name;
        private int id;
        private String major;
        private int creditHours;
        private double scholarshipAmount;

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

        public Builder setCreditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(name, id, major, creditHours, scholarshipAmount);
        }
    }

}
