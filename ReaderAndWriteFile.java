public class ReaderAndWriteFile {
     private static Connect connect;

    public Connect getConnect() {
        return connect;
    }

    public void setConnect(Connect connect) {
        this.connect = connect;
    }

    public ReaderAndWriteFile(Connect connect) {
        this.connect = connect;
    }
}
