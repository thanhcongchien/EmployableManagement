package QuanLiNhanVien;

public class Labor extends Employee {
	
	private int songaycong;
	private int dongiangaycong;

	public Labor() {
		this.songaycong = 0;
		this.dongiangaycong = 0;
	}
	
	public void setHesoluong(int hesoluong) {
		// TODO Auto-generated method stub
		setHesoluong(0);
	}

	public void setSongngaycong(int songaycong) {
		this.songaycong = songaycong;
	}
	public int getSongaycong() {
		return songaycong;
	}

	public void setDongiangaycong(int dongiangaycong) {
		this.dongiangaycong = dongiangaycong;
	}
	public int getDongiangaycong() {
		return dongiangaycong;
	}

	@Override
	public int getTienthem() {
		// TODO Auto-generated method stub
		return getSongaycong() * getDongiangaycong();
	}
	public void input() {
		super.input();
		System.out.println("SO NGAY CONG");
		songaycong = sc.nextInt();
		System.out.println("DON GIA NGAY CONG");
		dongiangaycong = sc.nextInt();
	}
	@Override
	public String toString() {
		return (super.toString() + "            " + "LDTT" + "   " +"SO NGAY CONG : "+ this.songaycong + "   " + "DON GIA NGAY CONG : " + this.dongiangaycong);
	}

	@Override
	public void input1() {
		// TODO Auto-generated method stub
		
	}
}

