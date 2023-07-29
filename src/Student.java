import java.util.Scanner;

public class Student {
    private String studentId;
    private String studentName;
    private int age;
    private boolean sex;
    private float htmlScore;
    private float cssScore;
    private float javascriptScore;
    private float avgScore;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getHtmlScore() {
        return htmlScore;
    }

    public void setHtmlScore(float htmlScore) {
        this.htmlScore = htmlScore;
    }

    public float getCssScore() {
        return cssScore;
    }

    public void setCssScore(float cssScore) {
        this.cssScore = cssScore;
    }

    public float getJavascriptScore() {
        return javascriptScore;
    }

    public void setJavascriptScore(float javascriptScore) {
        this.javascriptScore = javascriptScore;
    }

    public float getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(float avgScore) {
        this.avgScore = avgScore;
    }
    public void inputData(Scanner scanner){
        System.out.println("Nhập vào mã số sinh viên :");
        this.studentId= scanner.nextLine();
        System.out.println("Nhập vào tên sinh viên :");
        this.studentName= scanner.nextLine();
        System.out.println("Nhập vào tuổi sinh viên : ");
        this.age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào giới tính của sinh viên :");
        this.sex=Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập vào điểm HTML :");
        this.htmlScore=Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm CSS :");
        this.cssScore=Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào điểm Javascript :");
        this.javascriptScore=Float.parseFloat(scanner.nextLine());
        calAvgScore();
    }
    public void calAvgScore(){
        avgScore=(htmlScore+cssScore+javascriptScore)/3;
    }
    public void displayData(){
        System.out.printf("Mã sinh viên:%s\nTên sinh viên: %s\nTuổi: %d\n", this.studentId, this.studentName, this.age);
        System.out.printf("Giới tính :%b\nĐiểm HTML:%f\nĐiểm CSS:%f\nĐiểm Javascript :%f\n",this.sex,this.htmlScore,this.cssScore,this.javascriptScore);
        System.out.printf("Điểm trung bình của sinh viên :%f",this.avgScore);
    }

}
