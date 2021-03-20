package zz.practice.gaurav.arrays;

import java.io.IOException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;

public class Umang {

	public static void main(String[] args) throws IOException {

		Umang umang = new Umang();
		
		
		while(true) {
			try {
				umang.doGet();
				Thread.sleep(10);
			} catch (InterruptedException e) {
			   System.out.println(e.getLocalizedMessage());
			}
		}
		
		
		
	}
	
	
	
	public void doGet() throws IOException {
		
		try {
			for (int i = 1; i <= 20; i++) {
				
				
//				String url = "http://164.100.158.73/umangapp/UmangApp.svc";
//				
//				RestTemplate template = new RestTemplate();
//				HttpEntity<String> response = template.exchange(url, HttpMethod.GET, null, String.class);
//			    
//			    System.out.println(response.getBody());
				
				
				
				HttpResponse<String> response = Unirest.get("https://web.umang.gov.in/uaw/prodstat.jsp")
						  .header("cache-control", "no-cache")
						  .asString();
				
				System.out.println(response.getBody());
				System.out.println("test "+i+ " "+ System.currentTimeMillis());
				
			}

		} catch (Exception ex) {
            System.out.println("Exception occurred --->"+ ex.getLocalizedMessage());
		}

	}

}
