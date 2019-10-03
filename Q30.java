import java.util.Scanner;
class Project{
	private String project_id;
	private String project_name;
	private String[] defect_id = new String[10];
	private String[] defect_disc = new String[10];
	private String[] severity = new String[10];
	private String[] defect_status = new String[10];

	private int count=0;
	private int p=0;

	Project(String id, String name){
		project_id=id;
		project_name=name;
	}

	public void addDefect(String id, String disc, String sev){
		defect_id[count]=id;
		defect_disc[count]=disc;
		severity[count]=sev;
		defect_status[count]="New";
		count++;
	}

	public void printDefects(){
		System.out.println("Defect ID \t\tDisc \t\t\t\tSeverity \t\tStatus");
		for(int i=0; i<count; i++){
			if(severity[i].equals("High")){
				System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
			}
		}
		for(int i=0; i<count; i++){
			if(severity[i].equals("Medium")){
				System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
			}
		}
		for(int i=0; i<count; i++){
			if(severity[i].equals("Low")){
				System.out.println(defect_id[i]+"\t\t\t"+defect_disc[i]+"\t\t\t"+severity[i]+"\t\t\t"+defect_status[i]);
			}
		}
	}

	public boolean selectDefect(String id){
		for(int i=0; i<count; i++){
			if(defect_id[i].equals(id)){
				System.out.println(id+" found!");
				p=i;
				return true;
			}
		}
		System.out.println(id+" Not found!");
		return false;
	}

	public void devOpenDefect(){
		defect_status[p]="Open";
	}

	public void devRejectDefect(){
		defect_status[p]="Rejected";
	}

	public void devFixDefect(){
		defect_status[p]="Fixed";
	}

	public void qaReopenDefect(){
		defect_status[p]="Re-Open";
	}

	public void qaCloseDefect(){
		defect_status[p]="Closed";
	}
}

class Q30{
	public static void main(String args[]){
		Project p1 = new Project("2000","DTracker");
		p1.addDefect("2001","UI Issue","Low");
		p1.addDefect("2002","Back-end Issue","Medium");
		p1.addDefect("2003","Logical error","High");
		p1.addDefect("2004","Core Issue","High");
		p1.addDefect("2005","Memory Leak","Medium");

		while(true){
			p1.printDefects();
			System.out.println();
			System.out.println("1.Developer \n2.QA \n3.Print \n4.Exit");
			System.out.println();
			System.out.println("Select an option : ");
			Scanner scanner = new Scanner(System.in);
			String ss = scanner.nextLine();
			if(Integer.parseInt(ss)==1){
				System.out.println();
				System.out.println("Enter the defect id : ");
				String deid = scanner.nextLine();
				if(p1.selectDefect(deid)){
					System.out.println();
					System.out.println("1.Open \n2.Reject");
					System.out.println();
					String ss1 = scanner.nextLine();
					if(Integer.parseInt(ss1)==1){
						p1.devOpenDefect();
						System.out.println("Defect Opened!");
						System.out.println();
						System.out.println("1.Fix");
						String sf = scanner.nextLine();
						if(Integer.parseInt(sf)==1){
							p1.devFixDefect();
							System.out.println("Defect Fixed");
							System.out.println();
						}
						else{
							System.out.println("Invalid input!");
						}
					}
					else if(Integer.parseInt(ss1)==2){
						p1.devRejectDefect();
						System.out.println("Defect Rejected!");
						System.out.println();
					}
					else{
						System.out.println("Invalid input!");
					}
				}
			}
			else if(Integer.parseInt(ss)==2){
				System.out.println("1.Add defect \n2.Search Defect");
				String ss2 = scanner.nextLine();
				if(Integer.parseInt(ss2)==1){
					System.out.println("Enter the Defect id : ");
					String di = scanner.nextLine();

					System.out.println("Enter the Defect Descrption : ");
					String dd = scanner.nextLine();

					System.out.println("Enter the Defect Severity : ");
					String ds = scanner.nextLine();

					p1.addDefect(di,dd,ds);
					System.out.println("New defect added!");
					System.out.println();
				}
				else if(Integer.parseInt(ss2)==2){

					System.out.println();
					System.out.println("Enter the defect id : ");
					String deid = scanner.nextLine();
					if(p1.selectDefect(deid)){
						System.out.println();
						System.out.println("1.Re-Open \n2.Close");
						System.out.println();
						String ss1 = scanner.nextLine();
						if(Integer.parseInt(ss1)==1){
							p1.qaReopenDefect();
							System.out.println("Defect Re-Opened!");
							System.out.println();
						}
						else if(Integer.parseInt(ss1)==2){
							p1.qaCloseDefect();
							System.out.println("Defect Closed!");
							System.out.println();
						}
						else{
							System.out.println("Invalid input!");
						}
					}
				}
				else{
					System.out.println("Invalid input!");
				}
			}
			else if(Integer.parseInt(ss)==3){
				p1.printDefects();
			}
			else if(Integer.parseInt(ss)==4){
				System.exit(0);
			}
			else{
				System.out.println("Invalid input!");
			}
		}

	}
}
