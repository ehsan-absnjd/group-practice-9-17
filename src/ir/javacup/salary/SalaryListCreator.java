package ir.javacup.salary;

public abstract class SalaryListCreator {

	protected Encoder encoder;
	
	public SalaryListCreator(Encoder encoder) {
		this.encoder = encoder;
	}

	public String create(Employee[] employees) {
		String rawStr = doCreate(employees);
		return encoder.encode(rawStr);
	}
	
	protected abstract String doCreate(Employee[] employees);
	
	protected static String addZeroPrefix(String str, int length) {
		int zeroLength = length-str.length();
		StringBuilder returnString=new StringBuilder("");
		for (int i=0;i<zeroLength;i++){
			returnString.append("0");
		}
		return returnString.append(str).toString();
	}
	
	protected String getRecordSeparator() {
		return System.lineSeparator();
	}
	
	protected String getItemSeparator() {
		return " ";
	}
}
