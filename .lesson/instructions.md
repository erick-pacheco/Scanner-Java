# Instructions  
### Description:
In this activity, we’ll learn how to accept information from the console using the Scanner class. The Scanner class is imported from the java.util package and allows us to get user input from our keyboard and store it into a variable.

To use the Scanner class, we need to create a Scanner object. Objects are complex datatypes. Unlike primitive values, that represent a singular value, objects typically hold properties and methods. Properties are values that the objects store, and methods are the functionality that the objects can use. We need to create a Scanner object in order to use its methods.

Scanner objects have a lot of useful methods that allows us to read in specific types of data from the console. Here is a list of some common Scanner methods and when to use them:
* use the hasNext() method to check if there are more tokens (information to process). 
* use the next() method to retrieve the subsequent token (data point). 
* use the nextInt() to get an integer value from the keyboard.
* Use the nextLine() to get a String from the keyboard.
* Use the nextDouble() to get a double value from the keyboard. 

Now that we have an overview of what Scanner is, let's put it into practice. Please follow the steps below and complete them in Main.java:

### Steps:
1. Add in the following code before your class definition in Main.java:
  ```Java
  import java.util.Scanner;
  ```
  Because the Scanner class is in the util package, we need to import it. Once we’ve done that, we can create our Scanner object.
  
2. Add in the following code inside of your **main()** method:
  ```Java
  Scanner sc = new Scanner(System.in);
  ```
  To use the Scanner class, we need to create a Scanner object. This statement creates a Scanner object and saves it’s location into the variable **sc**. We can then use **sc** to use the object. 
  
3. Add in the following code below what you have in your **main()** method:
  ```Java
  System.out.println("Hello please tell me your name?");
  String name = sc.nextLine();
  System.out.println("Hello " + name + ", it is nice to meet you.");
  ```
  We added three statements to our code. The first statement sent output to the console to give the user instructions. 
  
  The next statement used the scanner object to call its **nextLine()** method to get the user's response. We used the variable **sc** to use the object, and then we used dot notation to access and call its method. If the program is running, it will pause at this moment and wait until the user enters a value into the console. Once that occurs, the value is taken from the console and returned from the method. The method returned a String which was saved into the **name** variable. 
  
  The last statement uses the **name** variable to get its value and concatenate it to a string. The string is then printed out to the console. Run the program to see the output.

4. Now it's your turn. Create print statement below the code we've added so far that asks the user: `"What state do you live in?"` 
  
5. Below the code we've added so far, use your Scanner object to call one of its methods to get the user's input and save the returned input into a variable called **state**.
   
6. Create print statement  below the code we've added so far that asks the user: `"How old are you?"`
   
7. Below the code we've added so far, use your Scanner object to call one of its methods to get the user's input and save the returned input into a variable called **age**.
   
8. Create a print statement  below the code we've added so far that prints: `name + ", I am also " + age + " and hear that " + state + " is beautiful!"` to the console.
    
9. Scanner objects take in an input stream. Input streams are streams of data that are taken from a source and given to a destination. In our case, Scanner is using `System.in` as its input stream. This means the Scanner object is continuously waiting for and receiving data from the console and giving our program that data to work with. Because this is a continuous process, it doesn’t end until we explicitly say so. It is best practice that, when we know we are done using Scanner in our code, we close the stream.

Add in the following code below what you have in your **main()** method:
  ```Java
  sc.close();
  ```

### Test:
Use the test provided. 

#### Sample output:
```
Hello please tell me your name?
Hello Leo, it is nice to meet you.
What state do you live in?
How old are you?
Leo, I am also 20 and hear that Arizona is beautiful!
```
