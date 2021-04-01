public class Generics1 {T extends comparable<T>> {
	T x, y,z;
	public Generics1(T x,T y,T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public T maximum() {
		return Generics.maximum(x, y, z);
	}
	public static <T extends Comparable <T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
			if(z.compareTo(max)>0) {
				max = z;
			}
			printMax(x , y , z , max);
			return max;
		}
		public static String Generics1(String x, String y, String z) {
			String max = x;
			if(y.compareTo(max) > 0) {
				max = y;
			}
			if(z.compareTo(max) > 0) {
				max = z;
			}
			printMax(x , y , z , max);
			return max;
		}
		public static <T> void printMax(T x, T y, T z, T max) {
			System.out.printf("Max of %s, %s and %s is %s\n", x , y , z , max);
		}
		public static void main(String args[]) {
			Integer xInt = 3, yInt = 4, zInt = 5;
			Float xF1 = 6.61f, yF1 = 8.81f, zF1 = 7.71f;
			String xStr = "pear", yStr = "apple" , zStr = "orange";
		Generics1.testMaximum(xStr, yStr, zStr);
		new Generics1(xInt, yInt, zInt).maximum();
		new Generics1(xF1, yF1, zF1).maximum();
		new generics1(xStr, yStr, zStr).maximum();
		}
	}
}
	

}
