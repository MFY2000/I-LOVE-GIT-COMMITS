import java.io.FileWriter;  
public class writer {  
    public static void main(String args[]){ 
       try{    

           FileWriter fw = new FileWriter("C:/Users/MFY/Desktop/I-LOVE-GIT-COMMITS/file.txt");    
           String message = "4";
           fw.write(message);    
           
           
           
           fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
    }    
}  