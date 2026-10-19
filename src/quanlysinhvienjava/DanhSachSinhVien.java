
package quanlysinhvienjava;

import java.util.ArrayList;

class SinhVien {
    String maSV;
    String hoTen;
    double diemTB;

    SinhVien(String maSV, String hoTen, double diemTB) {
        if (diemTB < 0 || diemTB > 10) {
            throw new IllegalArgumentException(
                "Diem trung binh phai tu 0 den 10"
            );
        }

        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }

    void hienThi() {
        System.out.println(
            maSV + " - " + hoTen + " - " + diemTB
        );
    }
}

public class DanhSachSinhVien {
    public static void main(String[] args) {
        ArrayList<SinhVien> ds = new ArrayList<>();

        ds.add(new SinhVien("SV01", "Nguyen An", 8.0));
        ds.add(new SinhVien("SV02", "Tran Binh", 7.5));
        ds.add(new SinhVien("SV03", "Le Chi", 9.0));

        System.out.println("DANH SACH SINH VIEN");

        for (SinhVien sv : ds) {
            sv.hienThi();
        }
    }
}

