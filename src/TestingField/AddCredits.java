/* Current file: AddCredits.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package TestingField;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class AddCredits {
    public static void main(String[] args) throws IOException{
        //File folder = new File("./src/TestingField/FilePackage/");
        File folder = new File("./src/");
        File[] classFiles = files(folder.listFiles());
        ArrayList<String> comment = new ArrayList<>();
        System.out.println(Arrays.toString(classFiles));
        comment.add("");
        comment.add(" * Was created by student -> 19402@uktc-bg.com");
        comment.add(" * This is a free to use as reference code that should be able to help");
        comment.add(" * with solving the problem at hand.");
        comment.add("*/");


        FileReader fr = null;
        FileWriter fw = null;

        // Add credits comment
        for(File file : classFiles){
            String fileName = file.getName();
            System.out.println("Filename: " + fileName);
            comment.set(0, "/* Current file: " + fileName);
            try{
                fr = new FileReader(file);

                BufferedReader bfr = new BufferedReader(fr);
                ArrayList<String> lines = new ArrayList<>();

                String line = "";
                while((line = bfr.readLine()) != null){
                    lines.add(line);
                }
                //System.out.println(lines);
                // Add Comment + Lines and apply them to the file
                fw = new FileWriter(file, false);
                BufferedWriter bfw = new BufferedWriter(fw);

                ArrayList<String> result = new ArrayList<>();
                result.addAll(comment);
                result.addAll(lines);

                for(String str : result){
                    bfw.write(str + "\n");
                    System.out.println(str);
                }

                bfr.close();
                bfw.close();
            }
            catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        fr.close();
        fw.close();
    }

    static File[] files(File[] list){
        int srcFiles = 0;
        for(File file : list){
            if(file.isFile() && file.getName().contains(".java")) {
                srcFiles++;
            }else if(file.isDirectory()){
                srcFiles += files(file.listFiles()).length;
            }
        }

        File[] srcFile = new File[srcFiles];
        int index = 0;
        for(int i = 0; i < list.length; i++){
            if(list[i].isFile() && list[i].getName().contains(".java")){
                srcFile[index] = list[i];
                index++;
            }else if(list[i].isDirectory()){
                for (File file : files(list[i].listFiles())){
                    srcFile[index] = file;
                    index++;
                }
            }
        }
        return srcFile;
    }
}
