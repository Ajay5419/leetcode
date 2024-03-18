import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {

	public static void main(String args[]) {
		/*
		 * DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		 * LocalDate startDate =LocalDate.parse("20/12/2022",formatter); LocalDate
		 * endDate =LocalDate.parse("27/12/2022",formatter);
		 * 
		 * long numOfDaysBetween = ChronoUnit.DAYS.between(startDate, endDate);
		 * List<String> ss= Arrays.asList("20/12/2022", "21/12/2022", "22/12/2022",
		 * "23/12/2022", "26/12/2022", "27/12/2022"); List<String>
		 * ls=IntStream.iterate(0, i -> i + 1) .limit(numOfDaysBetween) .mapToObj(i ->
		 * startDate.plusDays(i).format(formatter)) .filter(s->!ss.contains(s))
		 * .collect(Collectors.toList()); // 2022-12-21
		 * 
		 * System.out.println(ls);
		 * 
		 * String pattern = "yyyy-MM-dd"; SimpleDateFormat simpleDateFormat = new
		 * SimpleDateFormat(pattern); String date2 =
		 * simpleDateFormat.format(Date.from(ZonedDateTime.now().minusMonths(1).
		 * toInstant())); //System.out.println(date2);
		 */	
		
		int nums[]= {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
		int k =2;
		
		 int left=0;
	        int right=nums.length-1;
	        int count=0;
	        while(left<right){

	        int x=k-nums[left];
	        if(x<0){
	            left++;
	        } else if(nums[right]==x){
	            count++;
	            nums[right]=-1;
	            left++;
	            right=nums.length-1;
	        }else{
	        
	            right--;
	        }
	        if(right-left==0) {
	        	left++;
	        	right=nums.length-1;
	        }
	        }	
	        
	        System.out.println(count);
	}
}
