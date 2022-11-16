public class Student {

    // Attributes
    String username;
    int age;

    // Method
    public void printInfo() {
        System.out.println("Username: " + this.username);           // Print object attributes
        System.out.println("Age: " + this.age);
        System.out.println("--------------------------------");  // Separator for aesthetics
    }

    public static void main(String[] args) {

        // Example
        Student example = new Student(); // Creating an object of Class Student
        example.username = "Example";    // Setting values for the object
        example.age = 20;
        example.printInfo();             // Calling a method on the object

        // Tarctic
        Student tarctic = new Student();
        tarctic.username = "Tarctic";
        tarctic.age = 18;
        tarctic.printInfo();

        // Seatyamity
        Student rahul = new Student();
        rahul.username = "Rahul";
        rahul.age = 26;
        rahul.printInfo();
        //Try using CAMEL case
        
        // Bhavyamax
        Student max = new Student();
        max.username = "Bhavyamax";
        max.age = 21;
        max.printInfo();
        
         // Maryam
        Student maryam = new Student(); 
        maryam.username = "Maryam";    
        maryam.age = 19;
        maryam.printInfo();     
        
        // Hannan
        Student hannan = new Student();
        hannan.username = "Hannan";
        hannan.age = 28;
        hannan.printInfo();



        /* Add your code above this line */

    }
}
