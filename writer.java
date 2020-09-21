import java.io.FileWriter;  
public class writer {  
    public static void main(String args[]){ 
       try{    
            for (int i = 0; i < 10; i++) {
            FileWriter fw = new FileWriter("C:/Users/MFY/Desktop/Fun With Python/Checking/file"+i+".txt");      
            char message = (char) ((int) ((Math.random()*26)+65));
            fw.write(message);    
            fw.close();    
            }
          }
          catch(Exception e){System.out.println(e);}    
    }    
}  