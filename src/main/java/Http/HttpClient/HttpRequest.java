package Http.HttpClient;

import java.io.IOException;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public abstract class HttpRequest {
	
	private static Logger logger = LogManager.getLogger(HttpRequest.class.getName());
	

	
	public static void getRequest(String url) throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();

		try {
			HttpGet httpGet = new HttpGet(url);
			logger.info(httpGet.getRequestLine());
			
			
		} finally {
			httpclient.close();
		}
	}

}
