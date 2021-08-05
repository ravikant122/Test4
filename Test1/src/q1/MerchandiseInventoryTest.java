package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MerchandiseInventoryTest {

	public static void print(List<Merchandise> list) {
		for(Merchandise m:list)
			System.out.println(m.toString());
	}
	
	public static void main(String[] args) {
		
		List<Merchandise> list=new ArrayList<>();
		
		try(BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\ve00ym258\\Documents\\Test_1\\Test1\\src\\q1\\input.dat")))){
			String str;
			while((str=br.readLine())!=null) {
				String[] oneLineInput=str.split(" ");
				list.add(new Merchandise(oneLineInput[0], Integer.parseInt(oneLineInput[1]), Double.parseDouble(oneLineInput[2])));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("--- sorted by names ---");
		Collections.sort(list,new SortByName());
		print(list);
		
		System.out.println();
		
		System.out.println("--- sorted by price ---");
		Collections.sort(list,new SortByPrice());
		print(list);
		
	}

}
