
package classess;

import java.io.FileWriter;
import java.io.IOException;


public class ApplayClass {
    
    private String name;
    private String nid;
    private String address;
    private String union;
    private String diseas;
    private String dob;
    private String gender;
    
    
    // Sett value
    public void valueAssign(String name,String nid,String address,String union,String diseses,String dob,String gender){
        this.name=name;
        this.nid=nid;
        this.address=address;
        this.union=union;
        this.diseas=diseses;
        this.dob=dob;
        this.gender=gender;
    }
    
    // save all information on file
    public void saveapplyinformation(){
            try {
      FileWriter myWriter = new FileWriter("vaccineapplyuser.txt",false);
      myWriter.write("\nName:"+name);
      myWriter.write("\r\nNID:"+nid);
      myWriter.write("\r\nAddress:"+address);
      myWriter.write("\r\nUnion:"+union);
      myWriter.write("\r\nDisease:"+diseas);
      myWriter.write("\r\nDOB:"+dob);
      myWriter.write("\r\nGender:"+gender);
      myWriter.close();
      System.out.println("Successfully save all the data in  the file.");
    } catch (IOException e) {
      System.out.println("An error occurred");
    }
    }
    
}
