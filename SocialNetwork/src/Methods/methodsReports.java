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
     methodsFriendList metFriendList = methodsFriendList.getInstance();
     methodsAddFriend metAddFriend = methodsAddFriend.getInstance();
        
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
        Reports report = new Reports(idReport, title, obsClient, obsAdmin, status, reportUsername, clientUsername);

        if (head == null) {
            head = report;
            report.next = report;
            last = head;

            return true;

        } 
        if(head.id_Report == idReport){
            return false;
        }
            Reports aux = head;
             while(aux != null){
                 
            if(aux.id_Report == idReport){
               return false;
              }
            if(aux.next == null){ //or only aux
            report.next = head;
            head = report;
            last.next = head;
           
            return true;
            }
             aux = aux.next;
            }
            
             return false;
        }

    
      public void printReports() {
        if (head == null) {
            JOptionPane.showMessageDialog(null, "No existen reportes");
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
        if (head == null) {
            return false;
        } 
            Reports aux = head;
            while (aux != null){
          
                if (aux.id_Report == idReport) {
                    aux.state=statusReport;
                }

                aux = aux.next;
            }
        return false;
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
                } else if (aux.id_Report == idReport && !aux.state.equals("Pendiente")) {

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
        while (aux != null){
            if (aux.id_Report == id){
                return aux;
            }
            aux = aux.next;
        }
        return null;
           
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
