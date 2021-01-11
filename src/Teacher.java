public class Teacher extends User{
    private String Ruanzhong;
    public Teacher(){

    }
    public String getZhiCheng() {
        return Ruanzhong;
    }

    public void setZhiCheng(String zhiCheng) {
        this.Ruanzhong = zhiCheng;
    }
    public String toString() {
        return "Teacher{" +
                "ID='" + getId() + '\'' +
                ", password='" + getPassword() + '\'' +
                '}';
    }
}