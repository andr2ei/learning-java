package ru.andronov.tutorials.level3.module3;

import java.io.*;

public class SerializationAndDeserialization {

    public static void main(String[] args) {
        Man man = new Man("Andrei", 22);
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/object_file")))
        {
            System.out.println("writing object");
            oos.writeObject(man);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/object_file")))
        {
            System.out.println("reading object");
            Man deserializedMan = (Man) ois.readObject();
            System.out.println("deserializedMan = " + deserializedMan);
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
