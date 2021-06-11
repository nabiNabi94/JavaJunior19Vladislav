package Lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main4 {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\cmp1\\Desktop\\html\\html2\\css");
        if (startDir.isDirectory()){
            File[] files = startDir.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    if (pathname.isDirectory()){
                      return true;
                    }
                    if (pathname.getName().endsWith("png") || pathname.getName().endsWith("jpg")
                            || pathname.getName().endsWith("jpeg")){
                        return true;

                    }
                    return false;
                }
            });
            for (File f: files){
                System.out.println(f.getName());
            }
        }
    }
}
