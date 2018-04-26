package ncu.study;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.*;
import java.util.*;

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
    @Test
    public void test1(){
        JsonObject object = new JsonObject();

List<String> strings = new ArrayList<>();
        strings.add("13213");
        strings.add("13213ewqe");
        strings.add("13213ewqewqeq");
        System.out.print(strings.toString());
        JsonObject lan1=new JsonObject();
        lan1.addProperty("数学", "人教版,师范");

        JsonObject lan2=new JsonObject();
        lan1.addProperty("语文", "人教版,师范");

        JsonArray array = new JsonArray();
        array.add(lan1);
        array.add(lan2);







        object.add("初一",array);
        object.add("初二",array);
        System.out.println(object.toString());

        /*List<String> list = new ArrayList<>();
        list.add("13123");
        list.add("321312");
        list.add("321312");
        list.add("321312");
        list.add("31231");
        Map map = new HashMap();
        map.put("数学",list);
        map.put("语文",list);
        map.put("英语",list);

        Map res = new HashMap();
        res.put("一年级",map);
        res.put("二年级",map);
        System.out.println(res.toString());*/
    }



}
