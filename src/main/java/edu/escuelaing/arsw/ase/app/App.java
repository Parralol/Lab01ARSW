package edu.escuelaing.arsw.ase.app;

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
     * @throws Exception 
     */
    public static void main(String[] args) throws Exception {
        List<Path> allFiles = new ArrayList<>();
        List<String> files = new ArrayList<>();

        System.out.println("Hello World!");
        System.out.println("Working Directory = " + System.getProperty("user.dir"));
        
        String xd = System.getProperty("user.dir");
        Path rootPath = Paths.get(xd.split(":")[0] + ":", xd.split(":")[1]);
        allFiles = Lister.listAllFiles(rootPath, allFiles); 

        for(Path a : allFiles){
            Path con = a.getFileName();
            if(con.toString().equals(args[1])){
                files.add(a.toString());
            }
        }
        if(files.size()>1) throw new Exception("There is more than 1 file with the same name");
        
        System.out.println("Found files:"); 
        allFiles.forEach(System.out::println); 

        System.out.println("Found corresponding files:"); 
        files.forEach(System.out::println); 

    }
}
