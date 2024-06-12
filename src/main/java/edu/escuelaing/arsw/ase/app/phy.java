package edu.escuelaing.arsw.ase.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class phy {
        public String[] calculate(String name){
        try{
            File file = new File(name);
            Scanner reader = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
