package baidoc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos=null;
        try{
            oos=new ObjectOutputStream(new FileOutputStream("/Users/minhhuyduc/Documents/codegym/moudule2/bai17/src/baidoc/duchuy.txt"));
            Product product=new Product(1,"iphone",200000,"cu");
            oos.writeObject(product);
            oos.flush();
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            oos.close();
        }
        System.out.println("success");
    }
}
