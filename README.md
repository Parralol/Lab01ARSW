# Lab01 ARSW

This programm allow the user to count the number of lines of code of the file prompted in the terminal

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

First you need the following java version (command to see your current java version below)

```
java -version
```

![image](https://github.com/Parralol/Taller1ARSW/assets/110953563/6088e13f-2c49-4e5f-9eb3-c09642af5d65)

to see the maven version we are using we need to enter the following command, also this is the version of Maven this programm uses

```
mvn -version
```

![image](https://github.com/Parralol/Taller1ARSW/assets/110953563/0c2f20e7-a955-4aa5-bb92-a073488ba7e1)

### Installing

First clone this proyect into your own system, then 

```
mvn clean package
```


### Windows

first we create a file named 'countlines.bat'
```
echo @echo off > countlines.bat
```

then we enter inside of the file

```
echo java -jar  target\loc-1.0-SNAPSHOT.jar %* >> countlines.bat
```
and the we can execute the program

### linux/macOS

first create a file named 'countlines'
```
touch countlines
```
and we give it execution permissions

```
chmod +x countlines
```

then we edit the file so that it executes the following

```
#!/bin/bash
java -jar path/to/your/target/LineCounter-1.0-SNAPSHOT-jar-with-dependencies.jar "$@"
```


## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

if you want to use te programm before using the package command we use

```
mvn -e exec:java -Dexec'.mainClass=edu.escuelaing.arsw.ase.app.App' -Dexec'.args=<loc, phy> <file you want to use>'
```
or (depending on your system)

```
mvn -e exec:java -Dexec.mainClass=edu.escuelaing.arsw.ase.app.App -Dexec.args=<loc, phy> <file you want to use>
```

to execute the program like it's intended we'll need to enter

```
countlines <phy | loc> <program to count lines>
```

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Java](https://www.oracle.com/java/technologies/) - Programming Language

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Santiago Parra** - *Initial work* - [Parralol](https://github.com/Parralol)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

