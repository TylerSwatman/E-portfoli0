TEST CLASS

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class UserLoginTest {
public static void main(String[] args) throws FileNotFoundException {
      
      
String searchDate = "Oct 02";
String tempData;
String inputFileName = "Input.txt";
String outputFileName = "Output.txt";
UserLoginLinkedList loginList = generateLoginList(inputFileName);
tempData = "List of users who logged into the system";
writeData(outputFileName, tempData);
writeData(outputFileName, loginList);
tempData = "List of users who logged into the system on "+searchDate;
writeData(outputFileName, tempData);
writeData(outputFileName, loginList.searchDate(searchDate));

}

public static UserLoginLinkedList generateLoginList(String inputFileName) throws FileNotFoundException {

FileReader fr = new FileReader (inputFileName);
BufferedReader br = new BufferedReader(fr);
String line;

UserLoginLinkedList tempList = new UserLoginLinkedList();
try {
do {
      line = br.readLine();
      if(line == null) {}     
      else {
      tempList.add(line);
}
} while(line != null);
br.close();
fr.close();
}catch (Exception e) {
      
}
return tempList;
}



      static void writeData(String inputFileName, UserLoginLinkedList data) {
try {
      Node temp = data.head;
      FileWriter f = new FileWriter(inputFileName, true);
      PrintWriter p = new PrintWriter(f);
      
      for(int i=0;i<data.size;i++) {
      p.print(temp.element + "\n" );      
      temp = temp.next; 
      }
      f.close();
      p.close();
      }catch(Exception ex) {
            
      }
      
}
      
      static void writeData(String inputFileName, String data) {
try {
            FileWriter f = new FileWriter(inputFileName, true);
            PrintWriter p = new PrintWriter(f);
            p.print(data + "\n");
            
            p.close();
      }catch(Exception ex) {
            
      }
      
}

}

LINKEDLIST CLASS

public class UserLoginLinkedList{
      Node head= null;
      Node tail = null;
      int size = 0;
      
      
      public void add(String element) {
            Node newNode = new Node(element);
            if(head == null){
            head = tail = newNode;
            }
               tail.next = newNode;
               tail = tail.next;
               size++;
      }
      

      public UserLoginLinkedList searchDate(String searchDate) {
            
            UserLoginLinkedList list = new UserLoginLinkedList();
            Node temp =  head;
            
            for(int i =0;i<this.size;i++){
            
                  String tempStr = temp.element.substring(12,18);
                  if(tempStr.equals(searchDate)) {
                        
                        list.add(temp.element);
                  }
            temp = temp.next;
            }
            
            return list;
            
      }
      



      
}

NODE CLASS

      
      public class Node{
            
            String element;
            Node next;

      
      
            public Node() {
            
            }
            
            public Node(String element) {
                  this.element = element;
            }
      

      

      
}


