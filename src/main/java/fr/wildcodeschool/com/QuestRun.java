package main.java.fr.wildcodeschool.com;

import java.io.IOException;

public class QuestRun {

    public static void main(String[] args) throws IOException {
        Person jack = new Person("Beauregard", "Jack", 68);
        Person nobody = new Person("Nobody", "No-one", 32);
        PersonInputStream.writePerson(jack);
        PersonInputStream.writePerson(nobody);
        System.out.println("Presenting to you, these persons:");
        PersonOutputStream.printPerson(jack);
        System.out.println("---");
        PersonOutputStream.printPerson(nobody);
    }
}
