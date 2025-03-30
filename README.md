# animal_zoo

## Section: Introduction to Software Development!
About the course project
Introduction
In this course, you learned about methods, method signatures, classes and objects, inheritance, interfaces, and the intricacies involved in these concepts. To put it simply, if you were learning carpentry, you've now mastered how to saw wood, hammer nails, screw in fasteners, and read blueprints. However, just like in carpentry, where these skills only come together when you build something like a chair or piece of furniture, your programming knowledge won't come together until you apply it to create a small program.


The purpose of the project
The purpose of this project is to assess your understanding of the concepts covered in this course. It assumes you have already mastered the skills from the previous modules. While it won't directly test you on those earlier topics, you may encounter them in the starter code. If you find yourself confused by any of these concepts, it would be a good idea to revisit and review those topics first.

The objective of this project is to give you the opportunity to apply what you've learned so far to a practical program, allowing you to refine and perfect your skills.

The goal of the project
The project goal is to utilize abstract classes interfaces, and functionality of interfaces to help create a small zoo with a tiger and a dolphin, each inheriting common properties from an Animal class. You will extend the Animal class to create these unique animals.  

The Animal class implements an interface named Eat. The interface has two methods, but it implements only one. Since the Animal class does not implement all the methods of the Eat interface, the child classes will implement the unimplemented methods. You will also create two interfaces named Walk and Swim and apply the functionality of the methods of the Walk and Swim interfaces in certain classes only.   

You will modify an interactive menu system to work with the objects of the classes that you create. Additionally, you will develop a multi-functional Penguin class that can both walk and swim. Finally, you’ll test the entire program to ensure all functionalities work seamlessly.

* Task 1 (Inheritance): The Tiger and Dolphin classes correctly inherit from the Animal class and implement the required methods from the Eat interface.

* Task 2 (Functionality creation and implementation): The Swim and Walk interfaces are correctly created and implemented in the Dolphin and Tiger classes.

* Task 3 (Classes, objects, methods, and basic constructs in  Java): The menu system correctly displays the details and behaviors of the selected animals based on user input.

* Task 4 (New Penguin class functionality): The Penguin class implements both the Walk and Swim interfaces and functions correctly for both walking and swimming.

* Task 5 (Overall program functionality): All tasks and functionalities work together cohesively as expected.




## Section: Programming with Java!

Introduction 
In this course, you learned about advanced object-oriented programming (OOP) concepts in Java, including interfaces, abstract classes, exception handling, and file I/O operations. Just as a skydiver prepares by mastering the essential techniques before taking the leap, you've built a strong foundation in Java and are now ready to apply these advanced concepts. 

You've explored how interfaces can be used to achieve multiple inheritance and how abstract classes play a crucial role in designing robust class hierarchies. Additionally, you gained insights into handling exceptions with try-catch-finally blocks, performing efficient file operations, and mastering serialization and deserialization techniques. 


The purpose of the project
The purpose of this project is to assess your understanding of the concepts covered in this course. It assumes you have already mastered the skills from the previous modules. While it won't directly test you on those earlier topics, you may encounter them in the starter code. If you find yourself confused by any of these concepts, it would be a good idea to revisit and review those topics first.

The objective of this project is to give you the opportunity to apply what you've learned so far to a practical program, allowing you to refine and perfect your skills.

The goal of the project
The primary goal of this project is to enhance your existing Java project from Course 1 by implementing file I/O operations and serialization, focusing on the Tiger, Penguin, and Dolphin classes. You will begin by updating these classes to make them serializable, allowing you to save their state to a file. You will override the toString() method in each class to display the deserialized data clearly. This will enable you to present the animal data on the screen after reading it back from the saved files, ensuring that your program handles data persistence effectively.

Next, you will write methods to save the state of each animal into separate files—one for the tiger, one for the penguin, and one for the dolphin. This step involves creating distinct file storage for each animal type, ensuring their information is organized and accessible. Following this, you'll develop a method to retrieve the saved data from these files and display it on the screen, confirming that the program can successfully read and present the previously saved data. This will test your ability to manage file I/O operations within a Java application.

Finally, you'll enhance the program's interactivity by adding two new options to the main menu. One option will allow users to save all the animal data to their respective files, while the other will enable users to retrieve and display the data from those files. These additions will make the program more user-friendly, providing a straightforward way for users to interact with the animal data. This graded lab will assess your ability to implement serialization and file I/O and your skill in creating a seamless, interactive user experience within a Java program.


* Task 1 (Serialization of classes): The Tiger, Penguin, and Dolphin classes correctly implement the Serializable interface, allowing their state to be saved to files.

* Task 2 (Overriding toString() method): The toString() method in each of the Tiger, Penguin, and Dolphin classes has been overridden to display deserialized data clearly after reading from the files.

* Task 3 (Saving animal data to files): Methods to save the Tiger, Penguin, and Dolphin objects to their respective files (e.g., tiger.txt, penguin.txt, dolphin.txt) have been successfully implemented.

* Task 4 (Reading and displaying data from files): Methods to read from the files (e.g., tiger.txt, penguin.txt, dolphin.txt) and display the saved data correctly on the screen have been implemented.

* Task 5 (Menu option for saving data): The main menu has been updated to include an option for saving the state of all animals (tiger, penguin, and dolphin) to their respective files.

* Task 6 (Menu option for loading data): The main menu has been updated with an option to read and display data from the saved files (tiger.txt, penguin.txt, dolphin.txt).


