package com.example.chatwise.View_Model;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Reviews {

   @SerializedName("rating")
   int rating;

   @SerializedName("comment")
   String comment;

   @SerializedName("date")
   Date date;

   @SerializedName("reviewerName")
   String reviewerName;

   @SerializedName("reviewerEmail")
   String reviewerEmail;


    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getRating() {
        return rating;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
    public String getComment() {
        return comment;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Date getDate() {
        return date;
    }
    
    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }
    public String getReviewerName() {
        return reviewerName;
    }
    
    public void setReviewerEmail(String reviewerEmail) {
        this.reviewerEmail = reviewerEmail;
    }
    public String getReviewerEmail() {
        return reviewerEmail;
    }
    
}