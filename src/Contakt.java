public class Contakt {

    private String namber;

    private String name;

    //конструткор
    public Contakt(String namber, String name) {
        this.namber = namber;
        this.name = name;
    }

    public String getNamber() {
        return namber;
    }

    public String getName() {
        return name;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public void setName(String name) {
        this.name = name;
    }


}
