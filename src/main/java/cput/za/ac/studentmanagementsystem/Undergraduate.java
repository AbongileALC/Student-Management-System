package cput.za.ac.studentmanagementsystem;

/**
 *
 * @author abong
 */
public class Undergraduate extends Student{
    private int creditHours;
    private double scholarshipAmount;
    
    private Undergraduate(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition(){
        return (creditHours * 1500) - scholarshipAmount;
    }

    @Override
    public String getStudentType(){
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails(){
        System.out.println("--- " + getStudentType() + " ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: R" + scholarshipAmount);
        System.out.println("Tuition Due: R" + calculateTuition());
    }

    public static class Builder{
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;
        
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
        public Builder creditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }
        public Builder scholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        public Undergraduate build() {
            return new Undergraduate(this);
        }
    }
}
