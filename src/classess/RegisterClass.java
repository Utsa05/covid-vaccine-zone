package classess;




import java.io.FileWriter;
import java.io.IOException;

public class RegisterClass {
   private String name;
   private String phoneNo;
   private String address;
   private String gender;
   private String password;
    
   //value set
 public void assignValue(String name,String phoneNo,String address,String gender,String password){
        this.name=name;
        this.phoneNo=phoneNo;
        this.address=address;
        this.gender=gender;
        this.password=password;
   }
   
   
 //write file of register values
 public void userdataSaver(){
        try {
      FileWriter myWriter = new FileWriter("resgereduser.txt",true);
      myWriter.write("\nName:"+name);
      myWriter.write("\r\nPhone:"+phoneNo);
      myWriter.write("\r\nAddress:"+address);
      myWriter.write("\r\nGender:"+gender);
      myWriter.close();
      System.out.println("Successfully save all the data in  the file.");
    } catch (IOException e) {
      System.out.println("An error occurred");
    }
   }
    
   
}
