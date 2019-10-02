/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;
import javax.swing.JOptionPane;

/**
 *
 * @author marco
 */
public class methodsReports {
   public Reports head, last; 
    methodsClient metClient = methodsClient.getInstance();
     public int idReport =1; 
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
     Reports aux = head;
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
                
        

      public void printReports() {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "There are not reports");
        } else {
            Reports aux = head;

            do {
                System.out.println(aux.id_Report + "  Usuario reportado: " + aux.reportUsername + "Estado:" + aux.state);

                aux = aux.next;
            } while (aux != head);

        }
    }
      
      public Reports searchByFilter(String filter) {
         Reports aux = head;
            while (aux != null){
                if (aux.state.equals(filter)){
                    return aux;
                }
            aux = aux.next;
            }
            return null;
        
    }
      public boolean changeState(int idReport, String statusReport) {
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
      
         public boolean banUser(int idReport, String adminObs) {
        if (head == null) {
            return false;
        } 
            Reports aux = head;

           while (aux  != null)  {
                if (aux.id_Report == idReport && aux.state.equals("Pending")) {
                    aux.state= ("Done");
                    aux.clientObservation= adminObs;
                    return true;
                } else if (aux.id_Report == idReport && !aux.state.equals("Pending")) {

                    return false;
                }

                aux  = aux .next;
            } 
        
            return false;
    }
         
     public String myReports(String username, String filter) {
      
        String text = "";
        if (head == null) {
            JOptionPane.showMessageDialog(null, "No existe lista de reportes");
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
     public String informReport(String username, String filter) {
    
            String text = "";

        if (head == null) {
            JOptionPane.showMessageDialog(null, "No existe lista de reportes");
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
     
     
    public Reports searchReportbyState(String state){
        Reports aux = head;
        while (aux != null){
            if (aux.state.equals(state)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
           
    }
     public Reports searchReportbyID(int id){
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
     
     public Reports searchReportsbyState(String state, Client user){
      if(user.nextReports== null){
            return null;
        }
        Reports aux = user.nextReports;
        while (aux != null){
            if (aux.state.equals(state)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
     
     }
     
     public Reports searchAllPendingReports(){
     Client user = metClient.head;
     Reports report = user.nextReports;
     if(report.state.equals("Pending")){
            return report;
     }
     user = user.next;
        while(user!=metClient.head){
            if(report.state.equals("Pending")){
                return report;
            }
            
          user= user.next;
          report = report.next;
     }
        return null;
     }
     public Reports searchAllDoneReports(){
     Client user = metClient.head;
     Reports report = user.nextReports;
     if(report.state.equals("Done")){
            return report;
     }
     user = user.next;
        while(user!=metClient.head){
            if(report.state.equals("Done")){
                return report;
            }
            
          user= user.next;
          report = report.next;
     }
        return null;
     }
     public Reports searchAllRejectedReports(){
     Client user = metClient.head;
     Reports report = user.nextReports;
     if(report.state.equals("Rejected")){
            return report;
     }
     user = user.next;
        while(user!=metClient.head){
            if(report.state.equals("Rejected")){
                return report;
            }
            
          user= user.next;
          report = report.next;
     }
        return null;
     }
}
