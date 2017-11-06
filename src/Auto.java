public class Auto {
    private String name;
    private String znacka;
    private int objemMotoru;

    public Auto(String znacka, String name, int objemMotoru) {
        this.znacka = znacka;
        this.name = name;
        this.objemMotoru = objemMotoru;
    }

    public String getName() {
        return this.name;
    }

    public String getZnacka() {
        return this.znacka;
    }

    public int getObjemMotoru() {
        return this.objemMotoru;
    }

    public void setObjemMotoru (int objemMotoru) {
        this.objemMotoru = objemMotoru;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setZnacka (String znacka) {
        this.znacka = znacka;
    }
}
