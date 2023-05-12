package model;

public class GiftVO { // model : ~~~VO : value object의 약자. 데이터만 가지고 있음. ~~DAO : Data access Object.
						// ~~TO : transaction Object;
	public final String ClassName = "Gift";

	public String getClassName() {
		return ClassName;
	}

	// gno, gname, g_start, g_end
	private int gno, g_start, g_end;
	private String gname;

	public int getGno() {
		return gno;
	}

	public void setGno(int gno) {
		this.gno = gno;
	}

	public int getG_start() {
		return g_start;
	}

	public void setG_start(int g_start) {
		this.g_start = g_start;
	}

	public int getG_end() {
		return g_end;
	}

	public void setG_end(int g_end) {
		this.g_end = g_end;
	}

	public String getGname() {
		return gname;
	}

	public void setGname(String gname) {
		this.gname = gname;
	}

}
