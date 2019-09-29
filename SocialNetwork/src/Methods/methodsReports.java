/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;

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
   
    /*public boolean insertReport(int id_Report, String title, String clientObservation, String adminObservation, String state ){
        Reports instance = Reports.getInstance();
        instance.adminObservation=adminObservation;
        instance.clientObservation = clientObservation;
        instance.state = state;
        instance.id_Report= id_Report;
        instance.title= title;
        
        Reports newReport = new Reports(id_Report,title, clientObservation,adminObservation,state);
        
        if (head == null){
            head = newReport;
            head.next = head;
            return true;
        }
        if (head.next == head){
            head.next = newReport;
            newReport.next = head;
            return true;
        }
        if(searchReportbyID(id_Report)==null){
        newReport.next = head;
        
        }
      

      return false;
  }*/
    public int insertarInicio(String userName,String friend, int id_Report, String title, String clientObservation, String adminObservation, String state){
        
        Client auxUsuarioEnvio = metClient.searchXUserName(userName);
        if (auxUsuarioEnvio == null) {
            return 0; //no existe Usuario Remitente
        }
        
        Client auxUsuarioDesti = metClient.searchXUserName(friend);
        if (auxUsuarioDesti ==null) { //no existe Usuario Destinatario
            return 1;
        }
        Reports nuevo = new Reports(id_Report,title,clientObservation,adminObservation,state);
        nuevo.sigClient  = auxUsuarioEnvio;
        //auxUsuarioDesti.sigUsarioEnvio sería el inicio de cada subLista
        if (auxUsuarioDesti.nextReports == null) { //si no exite nodo, lo crea
            auxUsuarioDesti.nextReports = nuevo;
            return 2; 
        }
        nuevo.next = auxUsuarioDesti.nextReports; //en caso de que ya exista nodo, lo asigna al inicio
        auxUsuarioDesti.nextReports = nuevo;  
        return 2; //asignado
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
