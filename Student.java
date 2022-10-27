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
        Student Rahul = new Student();
        Rahul.username = "Rahul";
        Rahul.age = 26;
        Rahul.printInfo();
        
        // Bhavyamax
        Student max = new Student();
        max.username = "Bhavyamax";
        max.age = 21;
        max.printInfo();


        /* Add your code above this line */

    }
}
