package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Box implements Serializable {

    private int width;
    private int height;

    private int size;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSize() {
        size = height * width;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setWidth(50);
        myBox.setHeight(50);
        myBox.setSize();
        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(myBox);
            os.close();
            System.out.println("Object Serialized");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Thread Sleeping...");
            Thread.sleep(500);
            System.out.println("Start to deserialize");
            Thread.sleep(500);
            FileInputStream fi = new FileInputStream("foo.ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Box one = (Box) oi.readObject();
            System.out.println("Object deserialized");
            oi.close();
            System.out.println("The size of the box is: " + one.size);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
