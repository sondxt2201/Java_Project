package Model;

public class test {
	public static void main(String[] args) {
		Nguoi NGUOI_1 = new Nguoi("NG01", "nguyen van a", "hoc sinh", "HD01", 22, 2000);
		System.out.println(NGUOI_1.toString());
		HoDan HD_1 = new HoDan("HD01", "1213abc", "KP01", 4);
		System.out.println(HD_1.toString());
		KhuPho kp_1 = new KhuPho("KP1", "BK");
		System.out.println(kp_1.toString());
	}
}
