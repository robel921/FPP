package Lesson5HWproble2;


	import java.util.Date;

	public class Professor extends DeptEmployee {

		private int numPublications;

		public Professor(String name, double salary, Date hireDate){
			super(name,salary,hireDate);
		}
		public int getNumPublications() {
			return numPublications;
		}

		public void setNumPublications(int numPublications) {
			this.numPublications = numPublications;
		}
	}


