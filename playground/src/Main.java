

import java.io.*;
import java.io.File;
import java.io.IOException;


class Main {
  public static void write_file(String filename, String line, int x) {
    try {
      File myFile=new File(filename);
      PrintWriter theFile = new PrintWriter(myFile);
      for(int i=0;i<x;i++) {
        theFile.println(line);
      }
      theFile.close();
    }
    catch(IOException e) {
      System.out.println("Error reading file: "+e.getMessage());
    }  
  }


  public static void main(String[] args) {
    write_file("A.txt","Hi",3);
    write_file("A.txt","Hi",3);
  }
}


