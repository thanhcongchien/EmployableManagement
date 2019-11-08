package QuanLiNhanVien;

public class Staff extends Employee {
	private String quequan;
	private String phongban;
    private String chucvu;
    private int phucap;
    private int songaycong;
    private int sonamlamviec;
    private int choose;

	public Staff() {
		 super();
		 this.quequan = "";
	     this.phongban = "";
	     this.songaycong = 0;
	     this.phucap = 0;
	     this.songaycong = 0;
	     this.chucvu = "";
	     this.sonamlamviec = 0;
	     setHesoluong(9);
	}
	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}
	public String getQuequan() {
		return quequan;
	}
	public String getPhongban() {
		return phongban;
	}

	public void setPhongban(String phongban) {
		this.phongban = phongban;
    }

	public String getChucvu() {
	    return chucvu;
	}

	public void setCHucvu(String chucvu) {
	    this.chucvu = chucvu;
	}
	public int getPhucap() {
		return phucap;
	}
	public void setPhucap(int phucap) {
		this.phucap = phucap;
	}
	    
	public int getSongaycong() {
	    return songaycong;
	}

	public void setSongaycong(int songaycong) {
		this.songaycong = songaycong;
	}
	public int getSonamlamviec() {
		return sonamlamviec;
	}

	public void setSonamlamviec(int sonamlamviec) {
	   this.sonamlamviec = sonamlamviec;
    }
	@Override
	public int getTienthem() {
		// TODO Auto-generated method stub
		return getSongaycong() * 30;
	}
	public void input() {
		super.input();
		System.out.println("QUE QUAN : ");
	    quequan = sc.nextLine();
	    System.out.println("PHONG BAN : ");
	    phongban = sc.nextLine();
	    do{
	    	System.out.println("Trinh Do (1. TRUONG PHONG, 2. PHO PHONG, 3. NHAN VIEN) : ");
	        choose = sc.nextInt();
	        switch(choose){
	        	case 1:
	        		chucvu = "TrP";
	                this.setPhucap(1000);
	            case 2:
	                chucvu = "PhP";
	                this.setPhucap(600);
	            case 3:
	                chucvu = "NhV";
	                this.setPhucap(400);
	            }
	        }while(choose < 1 || choose > 3);  
	        System.out.println("SO NGAY CONG : ");
	        songaycong = sc.nextInt();
	        System.out.println("SO NAM LAM VIEC : ");
	        sonamlamviec = sc.nextInt();
	}
	@Override
	public String toString() {		
		return (super.toString() + this.quequan + "     " + "NV" + "         " + this.phongban + "    " + this.chucvu + "    " + this.phucap + "    " + this.songaycong + "    " + this.getHesoluong());
	}
	@Override
	public void input1() {
		// TODO Auto-generated method stub
		
	}
}
