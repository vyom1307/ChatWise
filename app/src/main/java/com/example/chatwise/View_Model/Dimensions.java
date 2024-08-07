package com.example.chatwise.View_Model;

import com.google.gson.annotations.SerializedName;

   
public class Dimensions {

   @SerializedName("width")
   double width;

   @SerializedName("height")
   double height;

   @SerializedName("depth")
   double depth;


    public void setWidth(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    
    public void setDepth(double depth) {
        this.depth = depth;
    }
    public double getDepth() {
        return depth;
    }
    
}