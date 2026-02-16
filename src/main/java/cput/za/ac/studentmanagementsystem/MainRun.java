package cput.za.ac.studentmanagementsystem;

/**
 *
 * @author abong
 */
public class MainRun {
    public static void main(String[] args) {
        Undergraduate undergrad = new Undergraduate.Builder()
                .studentId("230123456")
                .name("Abongile")
                .email("230123456@mycput.ac.za")
                .department("App Dev")
                .creditHours(15)
                .scholarshipAmount(5000)
                .build();
        
        Graduate grad = new Graduate.Builder()
                .studentId("210123456")
                .name("Lebo")
                .email("210123456@mycput.ac.za")
                .department("IT")
                .researchAssistant(true)
                .stipend(8000)
                .build();
        
        undergrad.displayStudentDetails();
        System.out.println();
        grad.displayStudentDetails();
    }
}
