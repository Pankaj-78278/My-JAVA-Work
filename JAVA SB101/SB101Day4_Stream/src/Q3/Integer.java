package Q3;

public class Integer {
	@Override
	public String toString() {
		return "Integer [no=" + no + "]";
	}

	private int no;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public Integer(int no) {
		super();
		this.no = no;
	}

	public Integer() {
		super();
	}
	
}
