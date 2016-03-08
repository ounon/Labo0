
package ch.heigvd.res.io;
import java.io.PrintStream;
import java.io.PrintWriter;

public interface ISerializer {
      public void serialize(IData data, PrintWriter pw);
}
