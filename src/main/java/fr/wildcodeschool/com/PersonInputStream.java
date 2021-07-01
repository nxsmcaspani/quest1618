package main.java.fr.wildcodeschool.com;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonInputStream {

    public static void writePerson(Person person) throws IOException {
        File f = new File(person.getName());
        FileWriter fw = new FileWriter(f);
        try {
            fw.write("Name: " + person.getName()+"\n");
            if (person.getSurname() != null) fw.write("Surname: " + person.getSurname()+"\n");
            if (person.getAge() != null) fw.write("Age: " + person.getAge()+"\n");
            if (person.getAddress() != null) fw.write("Address: " + person.getAddress()+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
