package Pack04;

public class ProblemSample {

	String Problem;
	String Ex1;
	String Ex2;
	String Ex3;
	String Ex4;
	String Ans;

	public ProblemSample() {
		this.Problem = "";
		this.Ex1 = "";
		this.Ex2 = "";
		this.Ex3 = "";
		this.Ex4 = "";
		this.Ans = "";
	}

	public ProblemSample(String pro, String e1, String e2, String e3, String e4,String Ans) {

		this.Problem = pro;
		this.Ex1 = e1;
		this.Ex2 = e2;
		this.Ex3 = e3;
		this.Ex4 = e4;
		this.Ans = Ans;
	}

	public void Edit_Ex(int num, String str) {

		if (num == 1) {
			this.Ex1 = str;
		} else if (num == 2) {
			this.Ex2 = str;
		} else if (num == 3) {
			this.Ex3 = str;
		} else if (num == 4) {
			this.Ex4 = str;
		}

	}

	public void Edit_Pro(String str) {

		this.Problem = str;

	}

}
