# JavaObjects
A project for members to understand the concept of Java objects and implement it

## Adding your code block:
- Open [Student.java](https://github.com/Github-Amity/JavaObjects/blob/main/Student.java) file and click on edit
- Add your code above the indicated line in this format:
```
// Example
Student example = new Student(); // Creating an object of Class Student
example.username = "Example";    // Setting values for the object
example.age = 20;
example.printInfo();     
```
- Replace 'example' with your username and edit to add your age (it doesn't have to be your real age!)
- Once you're done, scroll down to propose changes section, and add the message 'Add ``example`` info' where example is your username. Skip the description area and click on ``Propose changes``
- Once done, click on the green ``Create Pull Request`` button
- Confirm that your changes are correct, and click on ``Create Pull Request`` again
- You have successfully created an object, initialized its attributes, called a method and submitted a pull request!

## How it works:
The ``public class Student`` line at the top of the code creates a class called Student. A class is sort of like a common noun and an object is like a proper noun. If you paid attention in grade 3, you would know that common nouns are unspecific things like cars, people, country etc.; whereas proper nouns are specific things derived from common nouns, such as BMW (derived from car), Anika (person), Italy (country).  
  
Let us consider a student named Anika. A student class can have many attributes such as name, age, grade etc. When you create an object named Anika, you can then add its attributes. The object Anika would be defined in code like:
```
Student anika = new Student(); // Creating an object Anika of Class Student
anika.username = "Anika";    // Setting values for Anika
anika.age = 15;
anika.printInfo();
```
Here, the class is ``Student`` and the object is ``anika``. The attributes ``username`` and ``age`` are related to the object ``anika``, and their values are set to "Anika" and 15.  
  
So what does ``.printInfo();`` do?  
This code calls the method printInfo() and prints the username and age of the object. A method is a piece of code that does something. When you call this method using an object, it takes the values of the object and prints them. It's that easy!

*If you need more help understanding these concepts, I'd recommend the following video:*  
https://www.youtube.com/watch?v=Mm06BuD3PlY
