package File;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("enter maths marks");
	int maths=75;
	System.out.println("enter science marks" );
	int science=55;
	System.out.println("enter operatingsystem marks");
	int operatingsystem=80;
	System.out.println("enter datawarehouse marks");
	int datawarehouse =75;
	int total_Marks= maths+science+operatingsystem+datawarehouse;
	float percentage=total_Marks*100/400;
	System.out.println("total marks=" +total_Marks);
	System.out.println("percentage is="+ percentage);
	}

}
