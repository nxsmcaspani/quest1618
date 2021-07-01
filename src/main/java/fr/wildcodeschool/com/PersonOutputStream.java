package main.java.fr.wildcodeschool.com;

import java.io.*;

public class PersonOutputStream {

    public static void printPerson(Person person){
        File f = new File(person.getName());
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine())!=null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
