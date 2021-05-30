# Compiling and Running 

Consider the code below. First we have a class declaration, where we declare the class `Hello`. 

Then, we implement the method `public static void main(String[] args)`. This method simply prints to the console the text `Hello, Superprof!`.

![code](img/java-code-2.jpeg)

Now, the next step is to convert our `Hello.java` into bytecode. We can do it with the command `javac Hello.java`. The output of this command is a new file called `Hello.class`, that is the bytecode of class Hello. 

Finally, we send this bytecode into the `JVM` with the command `java Hello.class`, so that it can transform the bytecode into machine code and have the CPU execute it.

![code](img/java-code-3.jpeg)
