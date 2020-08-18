import java.io.FileWriter;  
public class writer {  
    public static void main(String args[]){ 
       try{    

           FileWriter fw = new FileWriter("C:/Users/MFY/Desktop/I-LOVE-GIT-COMMITS/file.txt");    
           
           String fileName = "/Users/pankaj/source.txt";
           File file = new File(fileName);
           FileReader fr = new FileReader(file);
           BufferedReader br = new BufferedReader(fr);
           String line;
           while((line = br.readLine()) != null){
               //process the line
               System.out.println(line);
           }


           String message = "4";
           fw.write(message);    
           
           
           
           fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
    }    
}  