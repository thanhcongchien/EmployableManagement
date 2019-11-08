package QuanLiNhanVien;
import java.util.Scanner;
public abstract class Employee implements Employable {
	
	Scanner sc =new Scanner(System.in);
	private String name;
    private int yob;
    private int choose;
    public Employee() {
    	 this.name = "";
         this.yob = 0;
    }

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setYob(int yob) {
		this.yob = yob;

	}

	@Override
	public int getYob() {
		// TODO Auto-generated method stub
		return yob;
	}

	@Override
	public float getSalary() {
		// TODO Auto-generated method stub
		return getLuongVaPhucap() + getTienthem();
	}
	
	private int hesoluong;
	private int phucap;
	public static int luongcoban;
	
	public abstract int getTienthem();
	public void setHesoluong(int hesoluong) {
		this.hesoluong = hesoluong;
	};
	public int getHesoluong() {
		return hesoluong;
	};
	public int getPhucap() {
		return phucap;
	};
	public void setPhucap(int phucap) {
		this.phucap = phucap;
	};
	public int getLuongVaPhucap() {
		return getHesoluong()*luongcoban + getPhucap(); 
	}
	
   public void input() {
		 System.out.println("HO VA TEN : ");
	     name = sc.nextLine();
	     System.out.println("NAM SINH : ");
	     yob = sc.nextInt(); 
	     sc.nextLine();
	}
   @Override
   public String toString() {
	   return (this.name + "             " + this.yob + "       ");
   }

public abstract void input1();

}
