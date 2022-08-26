package thuchanh2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void writeToFile(String path, List<Student>students){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Student>students=new ArrayList<>();
        students.add(new Student(1,"huy","thaibinh"));
        students.add(new Student(2,"phong","quangninh"));
        students.add(new Student(3,"hung","yenbai"));
        writeToFile("student.txt",students);
        List<Student> students1=readDataFromFile("student.txt");
        for (Student stu:students1) {
            System.out.println(stu);

        }
    }
    public static List<Student> readDataFromFile(String path){
        List<Student> students = new ArrayList<>();
       try {

           FileInputStream fis = new FileInputStream(path);
           ObjectInputStream ois=new ObjectInputStream(fis);
           students=(List<Student>) ois.readObject();
           ois.close();
           fis.close();

       }catch (Exception e){
           e.printStackTrace();
       }
        return students;
    }

}
