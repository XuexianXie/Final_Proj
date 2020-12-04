/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public WorkRequest createWorkRequest(String message,UserAccount sender,UserAccount receiver, String status){
        WorkRequest w = new WorkRequest(message, sender, receiver, status);
        workRequestList.add(w);
        return w;
    }
    
    public WorkRequest addWorkRequest(WorkRequest w){
        workRequestList.add(w);
        return w;
    }
}