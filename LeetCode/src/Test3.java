import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseQuery();
	}
	
	
	private static void parseQuery() {
        Scanner in = new Scanner(System.in);
        System.out.println("Query : \n");
        String query = in.nextLine();
        String param = in.nextLine();

 

        if (param != null && param.contains("Parameters:")) {
            param = param.substring(param.lastIndexOf("Parameters:") + 11).trim();
        }
        param = "'" + param.replace("(String)", "").replace("(Long)", "").replace(", ", "','") + "'";
        query = query.replace("&", "\"&\"");

 

        List<String> paramList = new ArrayList<String>(Arrays.asList(param.split("\\s*,\\s*")));

 

        for (String paramVal : paramList) {
            query = query.replaceFirst("\\?", paramVal);
        }
        System.out.println(query);
        in.close();
    }

}
