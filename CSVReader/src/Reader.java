

	import java.util.List;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;
	import java.util.ArrayList;

	public class Reader {
		public static void main(String[] args) {
			List<List<String>> records = new ArrayList<>();
			String COMMA_DELIMITER = ",";
			try {
				 
			String firstPath = "";
			
			BufferedReader br = new BufferedReader(new FileReader(firstPath));
			String line;
			while((line = br.readLine()) != null) {
				String[] values = line.split(COMMA_DELIMITER);
				records.add(Arrays.asList(values));
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
			 
			for(int i = 0; i < 10; i++) {
				System.out.println(records.get(i));
				System.out.println("test");
			}
			
		}

	}


