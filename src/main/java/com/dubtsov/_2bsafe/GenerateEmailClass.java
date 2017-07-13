package com.dubtsov._2bsafe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 12.07.17.
 */
public class GenerateEmailClass {

    private static String pathToFile = "/home/user/IdeaProjects/2bsafe_API/iterator";

    public static int getCountFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        return Integer.parseInt(reader.readLine());
    }

    private static void setCountFromFile(int count) throws IOException {
        FileWriter fstream1 = new FileWriter(pathToFile);
        BufferedWriter out1 = new BufferedWriter(fstream1);
        out1.write("");
        out1.close();

        File file = new File(pathToFile);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());
        out.print(count);
        out.close();
    }

    public static String getGeneratedEmail() throws IOException {
        int count = getCountFromFile();
        String generatedEmail = "www" + count + "@binka.me";
        setCountFromFile(++count);
        return generatedEmail;
    }

}
