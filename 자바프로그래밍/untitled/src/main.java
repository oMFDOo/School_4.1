import java.io.IOException;
import java.util.Scanner;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<String, String>();

        map.put("lee", "word");
        map.put("choi", "password");
        map.put("kim", "1234");
        map.put("park", "pass");

        for(String key:map.keySet()){
            String value = map.get(key);
            System.out.println("Key="+key + " Value=" + value);
            int temp = key.hashCode() + value.hashCode();
            System.out.println("hashCode()="+key.hashCode() + " hashCode()=" + value.hashCode() + " add=" + temp);
        }



//
//        String a = "100";
//        String b = "100";
//        if(a.equals(b))
//        {
//            System.out.println("Equal variables:");
//            System.out.println(a.hashCode() + "\n" + b.hashCode());
//        }
//
//        String c = "100";
//        String d = "500";
//
//        if(!c.equals(d))
//        {
//            System.out.println("\nUn-equal variables:");
//            System.out.println(c.hashCode() + "\n" + d.hashCode());
//        }
//        String Str = new String("We are learning hashCode in Java");
//        System.out.println("Hashcode for Str :" + Str.hashCode() );
    }
}

