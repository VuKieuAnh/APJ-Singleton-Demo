public class Client {
    public static void main(String[] args) {
//        Connect connect = new Connect("connect1");
        Connect connect = Connect.getConnect("connect1");
        System.out.println(connect.getName());
        ReaderAndWriteFile readerAndWriteFile = new ReaderAndWriteFile(connect);
//        Connect connect1 = new Connect("connect2");
        Connect connect1 = Connect.getConnect("connect2");
        Connect connect3 = Connect.getConnect("connect3");
        ReaderAndWriteFile readerAndWriteFile1 = new ReaderAndWriteFile(connect1);
        System.out.println(connect1.getName());
        System.out.println(connect3.getName());
    }
}
