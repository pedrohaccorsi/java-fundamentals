# Compiling and Running 

Consider the code below. First we have a class declaration, where we declare the class `Hello`. 

Then, we implement the method `public static void main(String[] args)`. This method simply prints to the console the text `Hello, Superprof!`.

![code](img/java-code-2.jpeg)


### Compiling into java bytecode 

Now that we have our code, we must compile it into java bytecode, so that the JVM can later process it. This compilation is done with the command `javac` followed by the class we want to compile, in our case `Hello.java`. 

The output of this command (`javac Hello.java`) is a new file called `Hello.class`, that is the bytecode of class Hello. 


### Running with java virtual machine 

Finally, we send this bytecode into the `JVM` with the command `java` followed by the compiled bytecode name, `Hello`. This command will trigger `JVM` which will convert our bytecode to machine code, and have it processed by the CPU.

<hr> 

### Conclusion

The Java compilation and running process can be condensed by the image below, where we 

1. declare a `Hello.java`
2. compile it with `javac Hello.java`
3. run it with `java Hello`

![code](img/java-code-3.jpeg)

From it, we can understand why java is a `write once, run anywhere` language, since the actual conversion to machine code isn't made by the compiler itself, but by an entire `runtime environemt (JRE)` that is client-specific.


