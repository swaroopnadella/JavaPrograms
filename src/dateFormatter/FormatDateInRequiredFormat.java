package dateFormatter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateInRequiredFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date1 = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		String strDate = formatter.format(date1);
		System.out.println(strDate);

		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yy");

		String strDate1 = formatter1.format(date1);
		System.out.println(strDate1);
		
		SimpleDateFormat formatter2 = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");

		String strDate2 = formatter2.format(date1);
		System.out.println(strDate2);

	}

}
