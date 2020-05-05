package controlSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class controller {
    
    public static int i = 0, j = 0;
    
    
    public static void classSelect(int standard){
        switch(standard){
            case 8: classEight(); break;
            case 9: classNine(); break;
            case 10: classTen(); break;
            case 11: classEleven(); break;
            case 12: classTwelve(); break;
        }
    }
    
    public static void commonScreens(){
        switch(j){
            case 0: new std12.headboy().setVisible(true); break;
            case 1: new std12.headgirl().setVisible(true); break;
            case 2: new std12.sportscaptainboy().setVisible(true); break;
            case 3: new std12.sportscaptaingirl().setVisible(true); break;
            case 4: new controlSet.endPage().setVisible(true); break;
        }
    }
    
    public static void classEight(){
        switch(i){
            case 0: new std8.std8captainboy().setVisible(true); break;
            case 1: new std8.std8captaingirl().setVisible(true); break;
            case 2: commonScreens(); break;
        }
    }
    
    public static void classNine(){
        switch(i){
            case 0: new std9.std9captainboy().setVisible(true); break;
            case 1: new std9.std9captaingirl().setVisible(true); break;
            case 2: commonScreens(); break;
        }
    }
    
    public static void classTen(){
        switch(i){
            case 0: new std10.std10captainboy().setVisible(true); break;
            case 1: new std10.std10captaingirl().setVisible(true); break;
            case 2: commonScreens();
        }
    }
    
    public static void classEleven(){
        switch(i){
            case 0: new std11.std11captainboy().setVisible(true); break;
            case 1: new std11.std11captaingirl().setVisible(true); break;
            case 2: commonScreens();
        }
    }
    
    public static void classTwelve(){
        commonScreens();
    }
    
    public static void resetVariables(){
        int n = 0;
            if(i != 0 && j != 0){n = 6;}
            else if(i == 0 && j != 0){n = 4;}
            System.out.println(n);
            
        try{
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.1.34/dav","root","1234");
            String query = "update total set totalVotes = totalVotes + " + n + ";";
            Statement stm = con.createStatement();
            stm.executeUpdate(query);
            stm.close();
            con.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        i = 0; j = 0;
    }
        
    
        
}
