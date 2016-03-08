
package ch.heigvd.res.io;


import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Set;


public class CsvSerializer implements ISerializer{
    
    public void header(IData data, PrintWriter pw){
         Set listKeys = data.getMap().keySet();  // Obtenir la liste des clés
    		Iterator iterator = listKeys.iterator();
    		// Parcourir les clés et afficher les entrées de chaque clé;
    		while(iterator.hasNext())
    		{
    			Object key = iterator.next();
                        if (!iterator.hasNext())
                            pw.println(key);
                        else
                            pw.print (key + ",");
    		}
 
    }
    
    
    public void serialize(IData data, PrintWriter pw){
        
        Set listKeys = data.getMap().keySet();  // get key list
    		Iterator iterator = listKeys.iterator();
    		// print entries of key list
    		while(iterator.hasNext())
    		{
    			Object key = iterator.next();
                        if (!iterator.hasNext())
                            pw.println(data.getMap().get(key));
                        else
                            pw.print (data.getMap().get(key) + ",");
    		}
 
    }
}
