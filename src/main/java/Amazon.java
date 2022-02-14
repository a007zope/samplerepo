import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Amazon {



	public static void main(String[] args) {

		Amazon a = new Amazon();
		a.doSearch("apple");
	}


	public void doSearch(String productBrand)
	{

		ArrayList<String> prodList = new ArrayList<String>(Arrays.asList("ipod","Camera","Airdopes","MacbookPro"));

		switch (productBrand.toLowerCase()) {
		case "apple":
			System.out.println(prodList);
			for(int i=0;i<=prodList.size();i++)
			{
				if(i==0)
				{
					String prodName =prodList.get(i).toString();
					System.out.println(prodName);
				}
			}
			break;

		case "samsung":

			System.out.println(prodList);
			break;

		case "nokia":
			break;

		default:

			System.out.println("please select correct product ");
			break;
		}

	}



}
