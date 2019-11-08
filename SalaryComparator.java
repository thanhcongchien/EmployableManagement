package QuanLiNhanVien;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		// TODO Auto-generated method stub
		if (s1.getSalary() == s2.getSalary())
			return 0;
		else if (s1.getSalary() > s2.getSalary())
			return 1;
		else
			return -1;
	}

}