/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class methodsReports implements Serializable{
   public Reports head, last; 
    methodsClient metClient = methodsClient.getInstance();
     public int idReport =1; //this has the counter of the id report
    public static methodsReports instance = null;
    public static methodsReports getInstance(){
        if(instance == null){
            instance = new methodsReports();
        }
        return instance;
    } 
     public boolean createReport(int idReport, String title, String obsClient, String obsAdmin, String status, String reportUsername, String clientUsername) {
        Reports instance = Reports.getInstance();
        instance.adminObservation=obsAdmin;
        instance.clientObservation = obsClient;
        instance.state = status;
        instance.id_Report= idReport;
        instance.title= title;
        instance.clientUsername = clientUsername;
        instance.reportUsername = reportUsername;
        Reports report = new Reports(instance.id_Report,instance.title, instance.clientObservation,instance.adminObservation, instance.state,
                instance.reportUsername, instance.clientUsername);
        //Insert at the beginning
       if (head == null) {
         head =last = report;
         head.next = last;
         last.next = head;
         return true;
     }
     Reports aux = head;//Circular method list
     while(aux != null){
        if(aux.id_Report == report.id_Report){
            return false;
        }
        aux = aux.next;
        }
        report.next = head;
        head = report;
        last.next = head;
        return true;
    }
                
        

      public void printReports() {//this methods print the reports
        if (head == null) {
            JOptionPane.showMessageDialog(null, "There are not reports");
        } else {
            Reports aux = head;

            do {
                System.out.println(aux.id_Report + "  User reported: " + aux.reportUsername + "Status:" + aux.state);

                aux = aux.next;
            } while (aux != head);

        }
    }
      
      public Reports searchByFilter(String filter) {//search by filter, it can be pendig, rejected and done
         Reports aux = head;
            while (aux != null){
                if (aux.state.equals(filter)){
                    return aux;
                }
            aux = aux.next;
            }
            return null;
        
    }
      public boolean changeState(int idReport, String statusReport) {//this method search a report by its id and chanfe the status
         Reports aux = head;
        if (aux.id_Report == idReport) {
            aux.state = statusReport;
            return true;
        }else{
            aux = aux.next;
            while (aux != head){
                if (aux.id_Report == idReport){
                    aux.state = statusReport;
                    return true;
                }
            aux = aux.next;
            }
            return false;
        }
    }
      
         public boolean banUser(int idReport, String adminObs) {//this method is used by de admin to ban users
        if (head == null) {
            return false;
        } 
            Reports aux = head;

           while (aux  != null)  {
                if (aux.id_Report == idReport && aux.state.equals("Pending")) {
                    aux.state= ("Done");//the status now convert to be done
                    aux.clientObservation= adminObs;
                    return true;
                } else if (aux.id_Report == idReport && !aux.state.equals("Pending")) {

                    return false;
                }

                aux  = aux .next;
            } 
        
            return false;
    }
         
     public String myReports(String username, String filter) {//this method print the user's reports
      
        String text = "";
        if (head == null) {
            JOptionPane.showMessageDialog(null, "There is not report list");
        } else {
            Reports aux = head;

            do {
                if (aux.clientUsername.equals(username) && aux.state.equals(filter)) {
                    text += "Title: " + aux.getTitle() + "\nClient observation: " + aux.clientObservation
                            + "\nAdmin observation: " + aux.getAdminObservation()
                            + "\nStatus: " + aux.getState() + "\nUser Reported: " + aux.reportUsername + "\n\n";
                }
                aux = aux.next;
            } while (aux != head);
        }
        return text;
    }
     public String informReport(String username, String filter) {//This method allow us to see the info of the report
    
            String text = "";

        if (head == null) {
            JOptionPane.showMessageDialog(null, "There is not report list");
        } else {

            Reports aux = head;

            do {
                if (aux.reportUsername.equals(username) && aux.state.equals(filter)) {
                    text += "Title: " + aux.getTitle() + "\nClient observation: " + aux.clientObservation
                            + "\nAdmin observation: " + aux.adminObservation
                            + "\nStatus: " + aux.getState() + "\nUser Reported: " + aux.reportUsername + "\n\n";
                }
                aux = aux.next;
            } while (aux != head);

        }
        return text;
    
    }
     
     
    public Reports searchReportbyState(String state){//search mehtod of report
        Reports aux = head;
        while (aux != null){
            if (aux.state.equals(state)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
           
    }
     public Reports searchReportbyID(int id){//search mehtod of report
        Reports aux = head;
        if (id == head.id_Report) {
            return aux;
        }else{
            aux = aux.next;
            while (aux != head){
                if (aux.id_Report == id){
                    return aux;
                }
            aux = aux.next;
            }
            return null;
        }
    }
}
