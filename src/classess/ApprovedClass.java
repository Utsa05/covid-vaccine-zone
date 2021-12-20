package classess;


public class ApprovedClass {
   private String name;
   private String nidNo;
   private String result;
    
    
   public void setInformation(String name,String nidNo){
        this.name=name;
        this.nidNo=nidNo;
    }
    
   public String showValue(){
        
        
        if(name.toLowerCase().equals("ovi") && nidNo.equals("12345")){
            
            result="Congress\n"
                    + "Vaccine Approved\n"
                    + "Name   :Ovi\n"
                    + "NID NO :12345\n"
                    + "Address:Dhaka,Bangladesh";
        }else if(name.toLowerCase().equals("demo") && nidNo.equals("00000")){
            
            result="Congress\n"
                    + "Vaccine Approved\n"
                    + "Name   :Demo\n"
                    + "NID NO :00000\n"
                    + "Address:Dhaka,Bangladesh";
        }
        
        else {
               result="Sorry\n"
                    + "Vaccine Not Approved Now\n"
                    + "See you later";
            

        }
        
        return result;
    }
    
}
