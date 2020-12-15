/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;


import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> dList;
    
    public DeliveryManDirectory(){
        dList = new ArrayList();
    }

    public ArrayList<DeliveryMan> getdList() {
        return dList;
    }

    public void setdList(ArrayList<DeliveryMan> dList) {
        this.dList = dList;
    }

    
    
    public DeliveryMan addDeliveryMan(DeliveryMan c){
        //DeliveryMan c = new DeliveryMan(name,tel);
        dList.add(c);
        return c;
    }
     public void deleteDeliveryMan(DeliveryMan c){
         dList.remove(c);
    }
}
