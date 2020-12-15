/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author xuexianxie
 */
public class Product {
    private String name;
    private ArrayList<String> reviewList;
    private Enterprise ent;
    private int Number;
    private int price;
    private int rate;
    private int id;
    private static int count = 1;
    private int people;
    private double score = 0.0;
    
    public Product() {
        id = count;
        count++;
        reviewList = new ArrayList<String>();
    }

    public Enterprise getEnt() {
        return ent;
    }

    public void setEnt(Enterprise ent) {

        this.ent = ent;
    }

    public ArrayList<String> getReviewList() {
        return reviewList;
    }
    
    public void setReviewList(ArrayList<String> arr) {
        reviewList = arr;
    }
    
    public void addReview(String review){
        reviewList.add(review);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        people++;
        // Normalize
        score = rate + score;
        int total = people*10;
        score/=total;
        this.rate = rate;
    }
    
    public double getScore(){
        return score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int Number) {
        this.Number = Number;
    }
    
    
    
}
