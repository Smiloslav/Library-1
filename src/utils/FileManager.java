package utils;

import java.io.*;

public abstract class FileManager {

    public static void writeToFile(Object object, String FILE_NAME){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(FILE_NAME);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            try{
                if(oos != null)
                    oos.close();
            } catch (IOException e) {}

            try{
                if(fos != null)
                    fos.close();
            } catch (IOException e) {}
        }
    }

    public static Object readToFile(String FILE_NAME){
        Object object = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {

            fis = new FileInputStream(FILE_NAME);
            ois = new ObjectInputStream(fis);
            object = ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            // zamykanie strumieni
            try{
                if(ois != null)
                    ois.close();
            } catch (IOException e) {}

            try{
                if(fis != null)
                    fis.close();
            } catch (IOException e) {}
        }

        return object;
    }
}

