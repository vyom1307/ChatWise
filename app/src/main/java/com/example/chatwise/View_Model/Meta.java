package com.example.chatwise.View_Model;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

   
public class Meta {

   @SerializedName("createdAt")
   Date createdAt;

   @SerializedName("updatedAt")
   Date updatedAt;

   @SerializedName("barcode")
   String barcode;

   @SerializedName("qrCode")
   String qrCode;


    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getCreatedAt() {
        return createdAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public String getBarcode() {
        return barcode;
    }
    
    public void setQrCode(String qrCode) {
        this.qrCode = qrCode;
    }
    public String getQrCode() {
        return qrCode;
    }
    
}