package QuanLiNhanVien;
import java.util.Scanner;

public class Lecturer extends Employee {
	Scanner sc =new Scanner(System.in);
	private String quequan;
	private String khoa;
    private String trinhdo;
    private int phucap;
    private int sotietday;
    private int sonamlamviec;
    private int choose;

	public Lecturer() {
		super();
		this.quequan = "";
        this.khoa = "";
        this.trinhdo = "";
        this.phucap = 0;
        this.sotietday = 0;
        this.sonamlamviec = 0;
	}
	public void setHesoluong(int hesoluong) {
		// TODO Auto-generated method stub
		setHesoluong(10);
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getQuequan() {
		return quequan;
	}
	public String getKhoa() {
		return khoa;
	}

	public void setKhoa(String khoa) {
		this.khoa = khoa;
    }

	public String getTringdo() {
	    return trinhdo;
	}

	public void setTrinhdo(String trinhdo) {
	    this.trinhdo = trinhdo;
	}
	public int getPhucap() {
		return phucap;
	}
	public void setPhucap(int phucap) {
		this.phucap = phucap;
	}
	    
	public int getSotietday() {
	    return sotietday;
	}

	public void setSotietday(int sotietday) {
		this.sotietday = sotietday;
	}
	public int getSonamlamviec() {
		return sonamlamviec;
	}

	public void setSonamlamviec(int sonamlamviec) {
	   this.sonamlamviec = sonamlamviec;
    }

	public int getTienthem() {
		// TODO Auto-generated method stub
		return getSotietday() * 45;
	}
	public void input() {
		super.input();
		System.out.println("QUE QUAN : ");
	    quequan = sc.nextLine();
	    System.out.println("KHOA : ");
	    khoa = sc.nextLine();
	    do{
	    	System.out.println("Trinh Do (1. CU NHAN, 2. TIEN SI, 3. THAC SY) : ");
	        choose = sc.nextInt();
	        switch(choose){
	        	case 1:
	        		trinhdo = "CN";
	                this.setPhucap(300);
	            case 2:
	                trinhdo = "TS";
	                this.setPhucap(2000);
	            case 3:
	                trinhdo = "THS";
	                this.setPhucap(900);
	            }
	        }while(choose < 1 || choose > 3);  
	        System.out.println("SO TIET DAY TRONG THANG : ");
	        sotietday = sc.nextInt();
	        System.out.println("SO NAM LAM VIEC : ");
	        sonamlamviec = sc.nextInt();
	}
	@Override
	public String toString() {
		return ( super.toString() +  this.quequan + "     " + "GV" + "        " + this.khoa + "   " + this.trinhdo + "     " + this.phucap + "     " + this.sotietday + "      " + this.getHesoluong());
	}
	@Override
	public void input1() {
		// TODO Auto-generated method stub
		
	}
}


