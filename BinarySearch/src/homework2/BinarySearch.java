package homework2;

public class BinarySearch {

	private int[] mass;

	public BinarySearch(int[] mass) {
		this.mass = mass;
	}

	public int find(int i) {
		int lo = 0, hi = 0;
		
		if (mass != null && mass.length > 1) {
			hi = mass.length - 1;

			while (lo < hi) {
				int mid = lo + (hi - lo) / 2;
				
				if (i < mass[mid]) {
					hi = mid - 1;
				} else if (i > mass[mid]) {
					lo = mid + 1;
				} else {
					return mass[mid];
				}
			}
		}
		return mass[lo];
	}
}
