package ch07_Encapsulation;

public class TestRepo {

	public static void main(String[] args) {

			MakeReport report = new MakeReport();
			String builder = report.getReport();
			
			System.out.println(builder);
		}

	}