import java.io.IOException;
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        FileReader fr;
        DataInputStream in = null;
        DataOutputStream out = null;


        try{
            out = new DataOutputStream(new FileOutputStream("data.bin"));
            out.writeInt(123);
            out.writeFloat(123.456F);
            out.close();

            in = new DataInputStream(new FileInputStream("data.bin"));
            int aint = in.readInt();
            float afloat = in.readFloat();

            System.out.println(aint);
            System.out.println(afloat);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in != null){
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}

