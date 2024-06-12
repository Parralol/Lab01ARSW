package edu.escuelaing.arsw.ase.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class loc {

        public String[] calculate(String name){
            ArrayList<String> res = new ArrayList<>();
            String[] a = {};
            try{
                File file = new File(name);
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()){
                    String line = reader.nextLine();
                    res.add(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            return res.toArray(a);
    }
}
