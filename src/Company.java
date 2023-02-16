import java.util.Arrays;

public class Company {
    private String ownerName;
    private String address;
    Java[] java;
    Android[] android;
    Go[] go;

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Java[] getJava() {
        return java;
    }

    public void setJava(Java[] java) {
        this.java = java;
    }

    public Android[] getAndroid() {
        return android;
    }

    public void setAndroid(Android[] android) {
        this.android = android;
    }

    public Go[] getGo() {
        return go;
    }

    public void setGo(Go[] go) {
        this.go = go;
    }

    public Company(String ownerName, String address, Java[] java, Android[] android, Go[] go) {
        this.ownerName = ownerName;
        this.address = address;
        this.java = java;
        this.android = android;
        this.go = go;
    }

    @Override
    public String toString() {
        return "Company:" +
                "\nownerName='" + ownerName + '\'' +
                "\n address='" + address + '\'' +
                "\n java=" + Arrays.toString(java) +
                "\n android=" + Arrays.toString(android) +
                "\n go=" + Arrays.toString(go) +
                ' ';
    }
}
