class Project{
	private String project_id;
	private String project_name;
	private String[] defect_id = new String[5];
	private String[] defect_disc = new String[5];
	private String[] severity = new String[5];
	private String[] defect_status = new String[5];

	private int count=0;

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

}

class Q29{
	public static void main(String args[]){
		Project p1 = new Project("2000","DTracker");
		p1.addDefect("2001","UI error","Low");
		p1.addDefect("2002","Back-end error","High");
		p1.addDefect("2003","Logical error","Medium");
		p1.addDefect("2004","Core error","High");
		p1.addDefect("2005","Memory error","Medium");

		p1.printDefects();
	}
}
