package P1;

public class sumavrg {
	
	double sum(double[] arr) {
		double s=0.0;
		for (double i:arr) {
			s += i;
		}
		return s;
	}
	
	double avg(double s) {
		return s/5.0;
	}

}
