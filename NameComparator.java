package QuanLiNhanVien;


import java.util.Comparator;
import java.util.*;

public class NameComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee n1, Employee n2) {
		// TODO Auto-generated method stub
		return n1.getName().compareTo(n2.getName());
	}

}

