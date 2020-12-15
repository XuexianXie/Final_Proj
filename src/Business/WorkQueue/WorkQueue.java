/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

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

    public void add(WorkRequest e){
        workRequestList.add(e);
    }
    
    public void delete(WorkRequest e){
        workRequestList.remove(e);
    }
    

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}