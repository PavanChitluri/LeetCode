import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String args[]) throws Exception {
        // read the string filename
        String filename;
        filename = scan.nextLine();
        System.out.println(filename);
        int index = filename.indexOf(".");
        String outputFileName = "records_hosts_access_log_0"+filename.charAt(index-1)+".txt";
        System.out.println(outputFileName);
        
        BufferedReader fileReader = new BufferedReader(new FileReader(filename));
        Map< String, Integer > mapData = new TreeMap();
        String readLine = "";
        while ((readLine = fileReader.readLine()) != null ) {
            String[] fileColumn = readLine.split(" ");
            String hostName = fileColumn[0].trim();
            if(hostName!=null && hostName.length() >0 ) {
                if(mapData.containsKey(hostName)) {
                mapData.put(hostName, mapData.get(hostName)+1);
            } else {
                mapData.put(hostName, 1);
            }    
            }
            
            
        }
        System.out.println(mapData);
        fileReader.close();
        FileWriter fileWriter = new FileWriter(outputFileName);
        for(Map.Entry<String, Integer> entry : mapData.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            String s = entry.getKey()+" "+ String.valueOf(entry.getValue());
            fileWriter.append(s);
            //fileWriter.append(" ");
            // fileWriter.append(String.valueOf(entry.getValue()));
            fileWriter.append("\n");
        }
        if(fileWriter!=null) {
            fileWriter.close();    
        }
        
        
        
    }
}