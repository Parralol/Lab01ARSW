package edu.escuelaing.arsw.ase.app;

import java.io.IOException;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        List<Path> allFiles = new ArrayList<>();
        System.out.println("Hello World!");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        String xd = System.getProperty("user.dir");
        Path rootPath = Paths.get(xd.split(":")[0] + ":", xd.split(":")[1]);
        allFiles = Lister.listAllFiles(rootPath, allFiles); 
  
        System.out.println("Found files:"); 
        allFiles.forEach(System.out::println); 
    }
}
