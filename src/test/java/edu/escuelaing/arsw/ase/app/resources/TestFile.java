package edu.escuelaing.arsw.ase.app.resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TestFile {

    private static final String USER_AGENT = "Mozilla/5.0";
    private static  String[] get_URL = null;
    private  int instancia = 0;
    public  TestFile(String[] invokerUrls){
        get_URL = invokerUrls;
    }

    /**
     * Generates a generic response
     * 
     * @param args
     * @return
     * @throws IOException
     */
    @SuppressWarnings("null")
    public String Invoke(String[] args) throws IOException {
        check();
        //URL obj = new URL(get_URL[instancia]);
        URL obj = null;
        System.out.println(obj.toString());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        StringBuffer response = new StringBuffer();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return response.toString();
    }

    /**
     * returns a log connecting to the mongodb
     * @param args
     * @return
     * @throws IOException
     */

    @SuppressWarnings("null")
    public List<String> getLog(String[] args) throws IOException{
        check();
        URL obj = null;
        //URL obj = new URL(get_URL[instancia] + "?val=" + args.queryParamsValues("val")[0]);
        System.out.println(obj.toString());
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        
        //The following invocation perform the connection implicitly before getting the code
        int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        List<String> response = new ArrayList<String>();
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                response.add(inputLine);
            }
            in.close();

            // print result
            System.out.println(response.toString());
        } else {
            System.out.println("GET request not worked");
        }
        System.out.println("GET DONE");
        return response;
    }

    /**
     * Checks round number
     */
    private void check(){
        instancia = (instancia+1) % get_URL.length ;
    }

    
} 
