public class Student extends User {
    private String major;
    private String phone;
    public Student(String major, String phone) {
        this.major = major;
        this.phone = phone;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID='" + getId() + '\'' +
                ",major='" + major + '\'' +
                ", password='" + getPassword() + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}