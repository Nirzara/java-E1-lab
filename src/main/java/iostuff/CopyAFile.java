package iostuff;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyAFile {
  public static void main(String[] args) {
    try ( // try with resources guarantees to make best effort to close all
          // resources, even if some fail with exceptions
          // closed in reverse order of opening.
        BufferedReader br = Files.newBufferedReader(Path.of("Text.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter("Copy.txt"));
        ) {
      String line;
      while ((line = br.readLine()) != null) {
        pw.println(line);
      }
      pw.flush();
      pw.close();
      br.close();
    } catch (IOException ioe) {
      System.out.println("oops: " + ioe.getMessage());
    }

    //    try {
//      BufferedReader br = Files.newBufferedReader(Path.of("Text.txt"));
//      PrintWriter pw = new PrintWriter(new FileWriter("Copy.txt"));
//      String line;
//      while ((line = br.readLine()) != null) {
//        pw.println(line);
//      }
//      pw.flush();
//      pw.close();
//      br.close();
//    } catch (IOException ioe) {
//      System.out.println("oops: " + ioe.getMessage());
////    } finally { // finally always runs after a try starts
////
//    }
  }
}
