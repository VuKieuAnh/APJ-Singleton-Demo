public class Connect {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private static Connect connect;

    private Connect(String urlFile) {
        this.name = urlFile;
    }

    public static Connect getConnect(String name){
        if (connect == null){
            connect = new Connect(name);
        }
        return connect;
    }

    public Connect() {
    }
}
