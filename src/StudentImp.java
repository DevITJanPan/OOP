import java.util.Scanner;

public class StudentImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arrStudent = new Student[100];
        int n = 0;
        do {
            System.out.println("*************MENU*************");
            System.out.println("1.Nhập vào thông tin n sinh viên :");
            System.out.println("2.Điểm trung bình tất cả sinh viên :");
            System.out.println("3.Hiển thị thông tin tất cả sinh viên :");
            System.out.println("4.Sắp xếp sinh viên theo điểm trung bình giảm dần :");
            System.out.println("5.Tìm kiếm sinh viên theo tên sinh viên :");
            System.out.println("6. Thoát");
            System.out.print("Sự lựa chọn của bạn :");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập số lượng sinh viên (tối đa 100):");
                    n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        arrStudent[i] = new Student();
                        System.out.println("Nhập thông tin sinh viên thứ :" + (i + 1) + ":");
                        arrStudent[i].inputData(sc);
                        arrStudent[i].calAvgScore();
                    }
                    break;
                case 2:
                    float sumAvgScore = 0;
                    for (int i = 0; i < n; i++) {
                        sumAvgScore += arrStudent[i].getAvgScore();
                    }
                    System.out.printf("Điểm trung bình tất cả sinh viên %.2f:", sumAvgScore);
                    System.out.printf("\n");
                    break;
                case 3:
                    System.out.println("Hiển thị thông tin tất cả sinh viên :");
                    for (int i = 0; i < n; i++) {
                        arrStudent[i].displayData();
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (arrStudent[i].getAvgScore() < arrStudent[j].getAvgScore()) {
                                Student temp = arrStudent[i];
                                arrStudent[i] = arrStudent[j];
                                arrStudent[j] = temp;
                            }
                        }

                    }
                    System.out.println("Sắp xếp sinh viên theo điểm trung bình giảm dần :");
                    for (int i = 0; i < n; i++) {
                        arrStudent[i].displayData();
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Tìm kiếm sinh viên theo tên sinh viên :");
                    String searchName = sc.nextLine();
                    boolean isCheck = false;
                    System.out.println("Học sinh trùng tên:");
                    for (int i = 0; i < n; i++) {
                        if (arrStudent[i].getStudentName().equals(searchName)) {
                            arrStudent[i].displayData();
                            System.out.println();
                            isCheck = true;
                        }
                    }
                    if (!isCheck) {
                        System.out.println("Không tìm thấy học sinh nào có tên đã cho.");
                    }
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng chọn từ 1-6");
            }
        } while (true);
    }

}
