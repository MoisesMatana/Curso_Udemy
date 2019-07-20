package moises.programador;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class OperacoesDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		java.util.Date x1 = new java.util.Date();
		java.util.Date x2 = new java.util.Date(System.currentTimeMillis());
		java.util.Date x3 = new java.util.Date(0L); // L long
		java.util.Date x4 = new java.util.Date(1000L * 60L * 60L * 5L);
		java.util.Date x5 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		java.util.Date y1 = sdf1.parse("25/06/2018");
		java.util.Date y2 = sdf2.parse("25/06/2018 15:40:07");
		
		System.out.println("------------------------------");
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		System.out.println("X3: " + x3);
		System.out.println("X4: " + x4);
		System.out.println("X5: " + x5);
		System.out.println("Y1: " + y1);
		System.out.println("Y2: " + y2);
		System.out.println("------------------------------");
		System.out.println("X1: " + sdf1.format(x1));
		System.out.println("X2: " + sdf1.format(x2));
		System.out.println("X3: " + sdf1.format(x3));
		System.out.println("X4: " + sdf1.format(x4));
		System.out.println("X5: " + sdf1.format(x5));
		System.out.println("Y1: " + sdf1.format(y1));
		System.out.println("Y2: " + sdf2.format(y2));
		System.out.println("------------------------------");
		System.out.println("X1: " + sdf3.format(x1));
		System.out.println("X2: " + sdf3.format(x2));
		System.out.println("X3: " + sdf3.format(x3));
		System.out.println("X4: " + sdf3.format(x4));
		System.out.println("X5: " + sdf3.format(x5));
		System.out.println("Y1: " + sdf3.format(y1));
		System.out.println("Y2: " + sdf3.format(y2));
		System.out.println("------------------------------");
	}

}