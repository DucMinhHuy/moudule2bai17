package baidoc;

import java.io.*;

class ReadByConsole {
    public static void main(String[] args) throws IOException {
        InputStream is=System.in;
        while (true){
            System.out.println("nhap 1 ky tu");
            int ch=is.read();
            if(ch=='q'){
                System.out.println("finished");
                break;
            }
            is.skip(2);
            System.out.println("nhan duoc ki tu :"+(char)ch);
        }
    }
}
class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("/Users/minhhuyduc/Documents/codegym/moudule2/bai17/src/baidoc/duchuy.txt");
        int i=-1;
        while ((i=is.read())!=-1){
            System.out.println((char) i);
        }
        is.close();
    }
}
class InputStreamExample2{
    public static void main(String[] args) throws IOException {
        InputStream in=new FileInputStream("/Users/minhhuyduc/Documents/codegym/moudule2/bai17/src/baidoc/duchuy.txt");
        byte[] bytes=new byte[10];
        int i=-1;
        while ((i=in.read(bytes))!=-1){
            String s=new String(bytes,0,i);
            System.out.println(s);
        }
        in.close();
    }
}
class OutputStreamExample{
    public static void main(String[] args) throws IOException {
        OutputStream os=new FileOutputStream("/Users/minhhuyduc/Documents/codegym/moudule2/bai17/src/baidoc/duchuy.txt");
        byte[] bytes=new byte[]{'d','u','c','m','i','n','n','h','u','y'};
        for(int i=0;i< bytes.length;i++){
            byte b=bytes[i];
            os.write(b);
        }
        os.close();
    }
}

