package com.dubtsov._2bsafe.Parents.GenerateTestData;

import java.io.*;

/**
 * Created by user on 12.07.17.
 */
public class GenerateEmailClass {

    private static String pathToFile = "./src/main/resources/iterator";
    public static String emailStatic;

    public static int getCountFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(pathToFile));
        int result = Integer.parseInt(reader.readLine());
        reader.close();
        return result;
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
        String generatedEmail = "www" + count + "@p33.org";
        setCountFromFile(++count);
        emailStatic = generatedEmail;
        return generatedEmail;
    }

}
