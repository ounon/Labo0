
package ch.heigvd.res.io;

import ch.heigvd.res.io.BufferedIOBenchmark.IOStrategy;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class MyExperimentData implements IData{
    
    public MyExperimentData(String operation,IOStrategy ioStrategy, long numberOfBytesToWrite, int blockSize, long duration){
        myMap.put("operation", operation);
        myMap.put("strategy", ioStrategy);
        myMap.put("blockSize", blockSize);
        myMap.put("fileSizeInBytes", numberOfBytesToWrite);
        myMap.put("durationInMs", duration);
    }
    public Map<String, Object> getMap(){
        return myMap;
    }
    private Map<String,Object> myMap = new LinkedHashMap<>();
}
