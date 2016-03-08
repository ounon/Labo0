
package ch.heigvd.res.io;


public interface IRecorder {
    public void init();
    public void close();
   // public void recordHeader(IData data);
    public void record(IData data);
}
