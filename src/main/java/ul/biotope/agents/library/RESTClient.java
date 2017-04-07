package ul.biotope.agents.library;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.codec.binary.Base64;

/**
 * Class to easily handle REST requests without bothering about client etc.
 * 
 * @author Niklas Kolbe (niklas.kolbe@uni.lu)
 * @date 7 Apr 2017
 */
public class RESTClient {

	/**
	 * Client object.
	 */
	private static Client client = ClientBuilder.newClient();

	/**
	 * URL of a specific URL endpoint - for convenience.
	 */
	private String apiUrl;
	
	/**
	 * URL for the corresponding metadata of the endpoint, if available - for convenienve.
	 */
	private String metadataUrl;
	
	/**
	 * Username in case authentication is required.
	 */
	private String user;
	
	/**
	 * Password in case authentication is required.
	 */
	private String password;
	
	/**
	 * Expected mediatype of the response.
	 */
	public String mediatype = MediaType.APPLICATION_JSON;

	public RESTClient() {
		
	}

	/**
	 * Creates a client for specified URL endpoint.
	 * 
	 * @param apiUrl
	 */
	public RESTClient(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	/**
	 * Creates a client for specified URL and metadata endpoint.
	 * 
	 * @param apiUrl
	 * @param metadataUrl
	 */
	public RESTClient(String apiUrl, String metadataUrl) {
		this(apiUrl);
		this.metadataUrl = metadataUrl;
	}
	
	/**
	 * Sends a GET request to the specified apiUrl, with additional parameters if specified.
	 * 
	 * @return The response as String.
	 */
	public String get() {
		return this.get("");
	}

	/**
	 * Send a get request to a specified URL.
	 * 
	 * @param url If the URL is empty the request will be sent to apiUrl. 
	 * @return The response as String.
	 */
	public String get(String url) {
		if (url.isEmpty()) {
			url = this.apiUrl;
		}
		
		Response response;
		if (user != null && password != null) {
			response = client.target(url).request().header("Authorization", this.getAuthorizationString()).accept(this.mediatype).get();
		} else {
			response = client.target(url).request().accept(this.mediatype).get();
		}

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
		}

//		System.out.println("headers: " + response.getHeaders());
//		System.out.println("body:" + response.readEntity(String.class));

		String output = response.readEntity(String.class);
//		System.out.println(output);
		return output;
	}
	
	/**
	 * Sends a GET request to the metadataUrl.
	 * 
	 * @return The response as String
	 */
	public String getMetaData(){
		return this.get(this.metadataUrl);
	}
	
	/**
	 * Sends a POST request with the given data string to apiUrl.
	 *  
	 * @param data String payload
	 * @return The response as String
	 */
	public String post(String data) {
		return post(data, "");
	}
	
	/**
	 * Sends a POST request with the given data string to the specified URL.
	 * 
	 * @param data String payload
	 * @param url If the URL is empty the request will be sent to apiUrl. 
	 * @return The response as String
	 */
	public String post(String data, String url) {
		if (url.isEmpty()) {
			url = this.apiUrl;
		}
		
		Client client = ClientBuilder.newClient();
		Response response = client.target(url).request(this.mediatype).post(
				Entity.entity(data, this.mediatype));

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed! HTTP error code : " + response.getStatus());
		}

		String output = response.readEntity(String.class);
		return output;
	}
	
	/**
	 * Helper function to create the String for authorization of a request based on the user and password.
	 * 
	 * @return The authentication string.
	 */
	private String getAuthorizationString() {
		String auth = this.user+ ":" + this.password;
		byte[] authEncBytes = Base64.encodeBase64(auth.getBytes());
		String authStringEnc = new String(authEncBytes);
		return "Basic " + authStringEnc;
	}
	
	/**
	 * @return the client
	 */
	public static Client getClient() {
		return client;
	}

	/**
	 * @param client the client to set
	 */
	public static void setClient(Client client) {
		RESTClient.client = client;
	}

	/**
	 * @return the apiUrl
	 */
	public String getApiUrl() {
		return apiUrl;
	}

	/**
	 * @param apiUrl the apiUrl to set
	 */
	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	/**
	 * @return the metadataUrl
	 */
	public String getMetadataUrl() {
		return metadataUrl;
	}

	/**
	 * @param metadataUrl the metadataUrl to set
	 */
	public void setMetadataUrl(String metadataUrl) {
		this.metadataUrl = metadataUrl;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the mediatype
	 */
	public String getMediatype() {
		return mediatype;
	}

	/**
	 * @param mediatype the mediatype to set
	 */
	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
	}

}
