package ncu.study;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;

import java.io.*;

/**
 * @author zhanghq23531
 * @version $Id: jsonTest.java, v 0.1 2018/1/29 14:35 zhanghq23531 Exp $
 */
public class jsonTest {
    @Test
    public void test() throws IOException {
        try(Writer writer = new OutputStreamWriter(new FileOutputStream("Output.json") , "UTF-8")){
            Gson gson = new GsonBuilder().create();
            gson.toJson("Hello", writer);
            gson.toJson(123, writer);
        }


        /*try (Writer writer = new FileWriter("Output.json")) {
            Gson gson = new GsonBuilder().create();
            gson.toJson("Hello", writer);
            gson.toJson(123, writer);
        }*/
    }
}
