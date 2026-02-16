package cput.za.ac.studentmanagementsystem;

/**
 *
 * @author abong
 */
public class Graduate extends Student {
    private boolean researchAssistant;
    private double stipend;
    
    private Graduate(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }
    
    @Override
    public double calculateTuition() {
        double tuition = 20000;
        if (researchAssistant) {
            tuition -= stipend;
        }
        return tuition;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("--- " + getStudentType() + " ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: R" + stipend);
        System.out.println("Tuition Due: R" + calculateTuition());
    }
    
    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

        public Builder studentId(String studentId) {
            this.studentId = studentId;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Builder department(String department) {
            this.department = department;
            return this;
        }
        public Builder researchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }
        public Builder stipend(double stipend) {
            this.stipend = stipend;
            return this;
        }
        public Graduate build() {
            return new Graduate(this);
        }
    }
}
