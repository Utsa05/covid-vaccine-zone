package classess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author DELL
 */
public class TestClass {
       private String age;
       private String sickweek;
       private String presentCondition;
       private String gender;
       private String dicess;
       private String result;
        
       public void setValue(String age,String sickWeek,String presentCondition,String gender,String dicess){
            this.age =age;
            this.sickweek=sickWeek;
            this.presentCondition=presentCondition;
            this.gender=gender;
            this.dicess=dicess;
        }
        
       public String showResult(){
            if (Integer.parseInt(age)<20 && presentCondition.equals("Good") && dicess.equals("Nothing") && sickweek.equals("1 Week")) {
                result="You are Covid Negative";
            }else{
                result ="You are covid Positive";
            }
            return  result;
        }
}
