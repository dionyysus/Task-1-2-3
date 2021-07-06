package Entity;

public class SumNumbers {

	private String id;

	public SumNumbers(String id) {
		super();
		this.id = id;
	}


	public int ConvertToInt(String id) {
		
		this.id = id;
		
		String[] numbersOfString = id.split("");
		
		int sizeString = numbersOfString.length;
		
		int [] numbersOfInt = new int[sizeString];
		
		int sizeInt = numbersOfInt.length;
		
		int sum = 0;
		
		for(int i = 0; i < sizeString; i++ ) {
			
			numbersOfInt[i] = Integer.parseInt(numbersOfString[i]);
			
		}
		
		for (int i = 0; i< sizeInt; i++) {
			sum += numbersOfInt[i];
		}
		
		return sum;
		
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
