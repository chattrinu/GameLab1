public class Players {
    private String name;
    private String choose;
    private int point;

    public Players(String name, String choose) {
        this.name = name;
        this.choose = choose;
       // this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }

    public int getPoint(int point) {

        return point;
    }

    public void setPoint(int point) {

        this.point = point;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", choose='" + choose + '\'' +
                ", point=" + point +
                '}';
    }
}
