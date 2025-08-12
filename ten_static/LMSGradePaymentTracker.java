// vars - data types - operators - conditionals - loops 
// classes - methods(variations) - objects - constructors
// Arrays - Strings - Static Members(static variables, static methods, static blocks)


public class LMSGradePaymentTracker {
    public static void main(String[] args) {

        // Display Institute Details -> calling static method
        Student.instituteInfo();

        Student s1 = new Student();
        Student s2 = new Student();

        // student info method - Hover
        s2.studentInfo();

        // student info method - Click
        s2.studentInfo();

        // Fee Calculation
        s2.calculateCourseFee();

        // Achievement Status
        s2.achievementStatus();

        // Set Trainer Identity
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "Ravi";

        // Trainer info method
        t1.trainerInfo();

        // Calculate Trainer payment
        t1.sessionsPayments();

    }
}