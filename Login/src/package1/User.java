package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

public class User {
	//內容
	public String userName;
	public String passWord;
	
	//constructor
	User(){
		
	}
	User(String userName, String passWord){
		this.userName = userName;
		this.passWord = passWord;
		update(userName, passWord);
	}
	
	public void update(String userName, String passWord){
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/chengfang-wen/Desktop/panda/user.json"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/chengfang-wen/Desktop/panda/user1.json"));
			
			String s = null;
			s = br.readLine();
			bw.write(s);
			bw.newLine();
			bw.flush();
			while ((s = br.readLine()) != null && !s.equals("]")) {
				try {
					JSONObject data = new JSONObject(s);
					
					bw.write("    { ");
					bw.write("\"userName\": ");
					bw.write("\"" + data.get("userName") + "\", ");
					bw.write("\"passWord\": ");
					bw.write("\"" + data.get("passWord") + "\"");
					bw.write("},");
					bw.newLine();
					bw.flush();
				}
				catch(JSONException e) {
					e.printStackTrace();
				}
			}
			
			bw.write("    { ");
			bw.write("\"userName\": ");
			bw.write("\"" + userName + "\", ");
			bw.write("\"passWord\": ");
			bw.write("\"" + passWord + "\"");
			bw.write("}");
			bw.newLine();
			bw.flush();
			
			bw.write("]");
			bw.newLine();
			bw.flush();
			
			br.close();
			bw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		//寫回去user
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/chengfang-wen/Desktop/panda/user1.json"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("/Users/chengfang-wen/Desktop/panda/user.json"));
			
			String s = null;
			while((s = br.readLine()) != null) {
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			br.close();
			bw.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
