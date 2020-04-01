package com.Iofile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoFile {
    private static String filePath = "out";       //输出文件地址

    public static void writeExpression(String[] expressionArray) {
        fileIo("expression.txt", expressionArray);
    }

    public static void writeAnswer(String[] resultArray) {
        fileIo("answer.txt", resultArray);
    }

    private static void fileIo(String filename, String[] write) {
        File dir = new File("./"+filePath);
        if(!dir.exists()){
            dir.mkdirs();
        }
        File f = new File(dir,filename);
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{

            try {
                StringBuffer sb=new StringBuffer();
		    	System.out.println("writeContent--->长度"+write.length);
                for(int i = 0;i<write.length;i++){
                    sb.append((i+1)+":"+write[i]+"\r\n");
                }
                FileOutputStream out=new FileOutputStream(f,false);
                out.write(sb.toString().getBytes("utf-8"));
                out.flush();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    }

