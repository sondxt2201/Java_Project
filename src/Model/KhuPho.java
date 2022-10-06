package Model;

public class KhuPho extends HoDan {
	private String maKhupho;
	private String tenKhupho;

	// constructor
	public KhuPho() {
	}

	public KhuPho(String maKhupho, String tenKhupho) {
		this.maKhupho = maKhupho;
		this.tenKhupho = tenKhupho;
	}

	// getter and setter
	public String getmaKhupho() {
		return this.maKhupho;
	}

	public void setmaKhupho(String maKhupho) {
		this.maKhupho = maKhupho;
	}

	public String gettenKhupho() {
		return this.tenKhupho;
	}

	public void settenKhupho(String tenKhupho) {
		this.tenKhupho = tenKhupho;
	}

	// toString
	public String toString() {
		return this.tenKhupho + "(Ma khu pho: " + this.maKhupho + ")";
	}
}
