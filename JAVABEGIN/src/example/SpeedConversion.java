package example;

public class SpeedConversion {

	public static void main(String[] args) {
		// 속도(m/s) = 거리(m) / 시간(s)
		double meter = 100;
		double sec = 18;
		
		// 1000m = 1km, sec을 분으로 구할면 60을 나누면 되지만 시간을 구하는 것이기 때문에 60을 더 곱한 값을 나누어 줌
		double sisok = 0;
		sisok = (meter/1000) / (sec/(60*60));
		
		System.out.printf("%.2fkm/h",sisok);

	}

}
