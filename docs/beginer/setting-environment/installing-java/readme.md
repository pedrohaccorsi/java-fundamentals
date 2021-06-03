# Installing Java

=== "Windows" 

    #### Install JDK

    1. access [jdk.java.net](http://jdk.java.net/) and download the latested `ready to use` JDK. 
    2. unzip it into a directory of your choice -conventinally, the directory is `C:\Program Files`.
    3. keep note of the directory you saved java, e.g. `C:\Program Files\jdk-16.0.1`

    #### Add java to PATH

    1. access the environment variables
    2. create the system variable `JAVA_HOME` and set its value as the directory you saved java (step 3 from installing JDK)
    3. edit the system variable `PATH` and add a new value with the directory of java followed by `\bin` (e.g. `C:\Program Files\jdk-16.0.1\bin`)

=== "MacOS"

    Type the following into the terminal

    ```
    brew tab homebrew/cask-versions
    brew cask install java
    ```

=== "Linux"

    Type the following into the terminal

    ```
    apt update
    apt install openjdk-16-jdk
    update-alternatives --config java
    ```
## Testing if java is installed

Type the following into the terminal. If anything other than an error appear, it is working.

```
java --version
```