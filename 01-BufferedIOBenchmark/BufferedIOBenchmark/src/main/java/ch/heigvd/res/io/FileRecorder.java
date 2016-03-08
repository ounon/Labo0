
package ch.heigvd.res.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileRecorder implements IRecorder {
    public FileRecorder(String fileName, ISerializer serializer){
        this.fileName = fileName;
        this.serializer = serializer;
        
    }
    
    public void init(){
        File outputFile = new File(fileName);
        try {
            printWriter = new PrintWriter(outputFile);
            // recorder header
            printWriter.println("operation,strategy,blockSize,fileSizeInBytes,durationInMs");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileRecorder.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close(){
        printWriter.close();
    }
    
    
    public void record(IData data){
        serializer.serialize(data, printWriter);
    }
    
    private String fileName;
    private ISerializer serializer;
    private PrintWriter printWriter;
    
}
