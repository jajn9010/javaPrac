package Quiz;

public class Video {
	protected String title, category, lendName, lendDate;
	protected boolean lend;

	public Video(String title, String category, boolean lend, String lendName, String lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	

	@Override
	public String toString() {
		return "Video [title=" + title + ", category=" + category + ", lendName=" + lendName + ", lendDate=" + lendDate
				+ ", lend=" + lend + "]";
	}
}
