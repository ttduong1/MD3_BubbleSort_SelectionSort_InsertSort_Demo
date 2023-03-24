package rikkei.academy;

import java.util.Comparator;

public class NhanVienComparator implements Comparator<NhanVien> {
    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        return (int) (o1.getSalary()-o2.getSalary());
    }
}
