public class Solution {
    public double Pow(double x, int n) {
	if (n == 0)
		return 1;
 
	double v = Pow(x, n / 2);
 
	if (n % 2 == 0) {
		return v * v;
	} else {
		return v * v * x;
	}
}
 
    public double myPow(double x, int n) {
	if (n < 0) {
		return 1 / Pow(x, -n);
	} else {
		return Pow(x, n);
	}
}

    }
