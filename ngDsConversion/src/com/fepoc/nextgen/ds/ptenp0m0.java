package com.fepoc.nextgen.ds;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class ptenp0m0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			if (!args[0].equals(null)) {
				if (args[0].substring(0, 1).equals("Y")) {
					if (new checkParm().validateDateFormat(args[0].substring(1, 8))) {
						String HoldCaptureFrom = "PARM";
					}
				}
			}

			File f = new File("c:\\eob.txt");
			BufferedReader b = new BufferedReader(new FileReader(f));

			if (new ReadEob(b.readLine()).isTotalRecord()) {
				boolean endOfEobInpt = true;
				boolean fileTotalRead = false;
			}
			new ReadEod().checkEod();
			String readLine = "";
			while ((readLine = b.readLine()) != null) {
				System.out.println(readLine);
			}
			b.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
