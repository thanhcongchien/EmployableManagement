package QuanLiNhanVien;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Menu {
	Scanner sc =new Scanner(System.in);
	private int choose;
    ArrayList<Employee> arrCanBo = new ArrayList<>();
	Employee canbo = null;

	public Menu() {
	}
	//		HAM CHAY CHUONG TRINH
	public void run() {
		showMainMenu();
	}
	//			MENU CHINH
	public void showMainMenu() {
		System.err.println("__CHOOSE A ACTION BELOW__");
		System.out.println("1. Add  a new employee");
		System.out.println("2. Fix the infomation of employee");
		System.out.println("3. Remove employee");
		System.out.println("4. Show list of employee");
		System.out.println("5. Clear all");
		System.out.println("6. Show all salary of employee");
		System.out.println("7. Quit");
		do {
			choose = sc.nextInt();
			inputAction(choose);
		}while(choose < 1 || choose > 7);
	}
	//			HÀM CHỌN MENU CHÍNH
	public void inputAction(int choose) {
		
		if(choose == 1) {
			showMenu1();
		} else if(choose == 2) {
			int k;
			System.out.println("Position of  K : ");
			k = sc.nextInt();
			changeInfo(k);
		} else if(choose == 3) {
			int k;
			System.out.println("NHAP VI TRI K : ");
			k = sc.nextInt();
			deleteInfo(k);
			showMainMenu();
		} else if(choose == 4) {
			showMenu4();
			showMainMenu();
		} else if (choose == 5) {
			arrCanBo.clear();
			showMainMenu();
		} else if (choose == 6) {
	         showSalary();
	         showMainMenu();
		}
		else if (choose == 7) {
				System.exit(0);
		}
	}


	//			MENU NHO CUA MUC 1
	public void showMenu1() {
		int choose = 0;
		System.err.println("__CHOOSE A ACTION BELOW__");
		System.out.println("1. Add staff at the end of the list ");
		System.out.println("2. Add staff at the top of the list");
		System.out.println("3. Add staff after k position");
		System.out.println("4. Add new staff to the end of the list from staff.txt file");
		System.out.println("5. Add new temporary workers from labor.txt list");
		System.out.println("6. Return to the previous item");
		do {
			choose = sc.nextInt();
			inputAction1(choose);
		}while(choose < 1 && choose > 6);
	}
	//			HÀM CHỌN MỤC MENU 1 NHỎ
	public void inputAction1(int choose) {
			if(choose == 1) {
				addEmployee(arrCanBo.size());
				showMenu1();
			} else if(choose == 2) {
				addEmployee(0);
				showMenu1();
			} else if(choose == 3) {
				int k;
				System.out.println("NHAP VI TRI K : ");
				k = sc.nextInt();
				addEmployee(k);
				showMenu1();
			} else if(choose == 4) {
				System.out.println("Add a new Staff from staff.txt file ");
					Chien();
				showMenu1();
			} else if(choose == 5){
				System.out.print("NOT AVAILABLE!!!");
				showMenu1();
			} else {
				showMainMenu();		
			}
	}
	

	
	public void Chien() {
	   ArrayList<String> arr = new ArrayList<String>();

	        try {

	            File file = new File("D:/test/mytext.txt");

	            Scanner input = new Scanner(file);

	            while (input.hasNextLine()) {
	                // here we are getting the full line
	                String s[] = input.nextLine().split(",");
	                for (String text : s) {
	                    arr.add(text);

	                }

	            }
	            input.close();
	            // here you can get the value by get method
	            System.out.print(arr.get(0));
	            System.out.print(arr.get(1));
	            System.out.print(arr.get(2));
	            System.out.print(arr.get(3));
	            System.out.print(arr.get(4));
	            System.out.print(arr.get(5));
	            System.out.print(arr.get(6));
	            System.out.print(arr.get(7));
	            System.out.print(arr.get(8));
	            System.out.println(arr.get(9));
	        } catch (Exception ex) {
	            ex.printStackTrace();
	        }
	        arr.addAll(chien);
	        System.out.println("vi du: ");
	        for(String vidu : arr) {
	        	System.out.println(vidu);
	        }

	}
	public static <arr, arrCanBo> Object[] combine(arr[] first, arrCanBo[] second)
	{
		List<Object> list = new ArrayList<>();

		Collections.addAll(list, first);
		Collections.addAll(list, second);

		return list.toArray();
	}
	
	
	/*public   void readFile() {
		String fileName="D:/test/mytext.txt";
		try {
		   File file = new File(fileName);
		   Scanner scanner = new Scanner(file);
		   String line;
		   while (scanner.hasNextLine()) {
			   line = scanner.nextLine();
			   String[] a = line.split(" ");
			   System.out.println(line);
			   	if (a[0]=="GV") {
				   Employee x = new Lecturer();
				   //arrCanBo.getName();
				  
				   //arrCanBo.setYob(a[2]);
				   arrCanBo.add(1,x);
			   }
			   System.out.println(a[0]);
		   }
		   scanner.close();
		  } catch (FileNotFoundException e) {
		   e.printStackTrace();
		}
	}
	
		/*String fileName = "D:/test/mytext.txt";
        ArrayList<String> chien = new ArrayList<String>();

        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

            chien = (ArrayList<String>) stream
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }

        chien.forEach(System.out::println);
		  // chien.addAll(0, Employee);
		try {
		     //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
		     File f = new File("D:/test/mytext.txt");
		     FileReader fr = new FileReader(f);
		     //Bước 2: Đọc dữ liệu
		     BufferedReader br = new BufferedReader(fr);
		     String line;
		     while ((line = br.readLine()) != null){
		       System.out.println(line);
		     }
		     //Bước 3: Đóng luồng
		     fr.close();
		     br.close();
		    } catch (Exception ex) {
		      System.out.println("Loi doc file: "+ex);
		    }
		 }*/
	
	// 			HÀM THỰC HIỆN CHON NHẬP LOẠI CÁN BỘ
	public void addEmployee(int k) {
		int choose = 0;
		System.err.println("Type of employee (1- Lecture, 2- Staff, 3- Labor)");
		do {
			choose = sc.nextInt();
			doAddEmployee(choose, k);
		}while(choose < 1 || choose > 3);
	}
	

	//			THỰC HIỆN KHỞI TẠO VÀ NHẬP THÔNG TIN CÁN BỘ
	public void doAddEmployee(int choose, int k) {
		if(choose == 1) {
			canbo = new Lecturer();
			canbo.input();
			arrCanBo.add(k,canbo);
			showMenu1();
		}if(choose == 2) {
			canbo = new Staff();
			canbo.input();
			arrCanBo.add(k,canbo);
			showMenu1();
		}if(choose == 3) {
			canbo = new Labor();
			canbo.input();
			arrCanBo.add(k,canbo);
			showMenu1();
		}
	}
	
	
	//			IN THÔNG TIN CÁN BỘ
	public void showInfo(ArrayList<Employee> employee) {
		 int i = 0;
		 System.err.println("STT   TEN	                  NAM SINH    QUE QUAN    LOAI      C1     C2     C3     C4     C5");
		 for (Employee cb : employee) {
			 	System.out.print(i+"     ");
	            System.out.println(cb.toString());
	            i++;
	        } 
	}
	
	

	// MENU3
	//			XÓA CÁN BỘ
	public void deleteInfo(int k) {
		arrCanBo.remove(k);
	}
	
	
	//			IN THÔNG TIN LƯƠNG CÁN BỘ
	public void showSalary() {
		int i = 0;
		float total = 0;
		System.err.println("STT  TEN	           LUONG");
		for(Employee cb : arrCanBo) {
			System.out.print(i+"    ");
			System.out.println(cb.getName() + "	      " + cb.getSalary());
			i++;
			total += cb.getSalary();
		}
		System.out.println("Total :                  " + total);	
	}
	//			THAY ĐỔI THÔNG TIN CÁN BỘ 
	public void changeInfo(int k) {
		System.out.println(arrCanBo.get(k));
		arrCanBo.remove(k);
		System.err.println("Change infomation of Staff : ");
		addEmployee(k);
	}
	
	
	//			MENU MỤC 4 NHỎ
	public void showMenu4() {
		int choose = 0;
		System.out.println("__CHOOSE A FUNCTION BELOW__");
		System.out.println("1. Display the current listing. ");
		System.out.println("2. Display the list after sorting by ascending salary.");
		System.out.println("3. Display the list after the letters are sorted alphabetically.");
		System.out.println("4. Search by name.");
		System.out.println("5. Search by yob");
		System.out.println("6. Return");
		do {
			choose = sc.nextInt();
			sc.nextLine();
			inputAction4(choose);
		}while(choose < 1 && choose > 6);
	}
	//			HÀM CHỌN MỤC 4 NHỎ 
	public void inputAction4(int choose) {
		if(choose == 1) {
			showInfo(arrCanBo);
			showMenu4();
		} else if(choose == 2) {
			showInfoSortBySalary();
			showMenu4();
		} else if(choose == 3) {
			showInfoSortByName();
			showMenu4();
		} else if(choose == 4) {
			searchInfoByName();
			showMenu4();
		} else if(choose == 5){
			 searchInfoByAge();
			 showMenu4();
		} else {
			showMainMenu();		
		}
	}
	//		IN THÔNG TIN SẮP XẾP THEO TÊN
	public void showInfoSortByName() {
		Collections.sort(arrCanBo, new NameComparator());
		showInfo(arrCanBo);
	}
	
	
	//		IN THÔNG TIN SẮP XẾP THEO LƯƠNG
	public void showInfoSortBySalary() {
		Collections.sort(arrCanBo, new SalaryComparator());
		showSalary();
	}
    
	public void searchInfoByName() {
		ArrayList<Employee> foundEmployee= new ArrayList<Employee>();
		System.err.println("Enter name of Staff : ");
		String name=sc.nextLine();
		for(Employee s : arrCanBo){
			if(name.equalsIgnoreCase(s.getName())) {
				foundEmployee.add(s);
			}
		}
		if (foundEmployee.isEmpty()) {
				System.out.println("Not Found!");
		} else {
		   showInfo(foundEmployee);
		}	
	}
	
	
	public void searchInfoByAge() {
		ArrayList<Employee> foundEmployee= new ArrayList<Employee>();
		System.err.println("Enter yob of Staff : ");
		int yob = sc.nextInt();
		for(Employee s : arrCanBo){
			if(yob == s.getYob()) {
				foundEmployee.add(s);
			}
		}
		if (foundEmployee.isEmpty()) {
				System.out.println("Not Found!");
		} else {
		   showInfo(foundEmployee);
		}	
	}
}
