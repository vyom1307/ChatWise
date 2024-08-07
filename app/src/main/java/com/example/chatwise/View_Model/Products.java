package com.example.chatwise.View_Model;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import java.util.List;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.SerializedName;

   
public class Products {

   @SerializedName("id")
   int id;

   @SerializedName("title")
   String title;

   @SerializedName("description")
   String description;

   @SerializedName("category")
   String category;

   @SerializedName("price")
   double price;

   @SerializedName("discountPercentage")
   double discountPercentage;

   @SerializedName("rating")
   double rating;

   @SerializedName("stock")
   int stock;

   @SerializedName("tags")
   List<String> tags;

   @SerializedName("brand")
   String brand;

   @SerializedName("sku")
   String sku;

   @SerializedName("weight")
   int weight;

   @SerializedName("dimensions")
   Dimensions dimensions;

   @SerializedName("warrantyInformation")
   String warrantyInformation;

   @SerializedName("shippingInformation")
   String shippingInformation;

   @SerializedName("availabilityStatus")
   String availabilityStatus;

   @SerializedName("reviews")
   List<Reviews> reviews;

   @SerializedName("returnPolicy")
   String returnPolicy;

   @SerializedName("minimumOrderQuantity")
   int minimumOrderQuantity;

   @SerializedName("meta")
   Meta meta;

   @SerializedName("images")
   List<String> images;
   @BindingAdapter({"image"})
    public static void loadImage(ImageView imageView, String url) {
        Glide.with(imageView.getContext()).load( url).into(imageView);
    }

   @SerializedName("thumbnail")
   String thumbnail;


    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    public String getCategory() {
        return category;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
    public double getDiscountPercentage() {
        return discountPercentage;
    }
    
    public void setRating(double rating) {
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }
    
    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    public List<String> getTags() {
        return tags;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
    
    public void setSku(String sku) {
        this.sku = sku;
    }
    public String getSku() {
        return sku;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getWeight() {
        return weight;
    }
    
    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    
    public void setWarrantyInformation(String warrantyInformation) {
        this.warrantyInformation = warrantyInformation;
    }
    public String getWarrantyInformation() {
        return warrantyInformation;
    }
    
    public void setShippingInformation(String shippingInformation) {
        this.shippingInformation = shippingInformation;
    }
    public String getShippingInformation() {
        return shippingInformation;
    }
    
    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }
    public String getAvailabilityStatus() {
        return availabilityStatus;
    }
    
    public void setReviews(List<Reviews> reviews) {
        this.reviews = reviews;
    }
    public List<Reviews> getReviews() {
        return reviews;
    }
    
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }
    public String getReturnPolicy() {
        return returnPolicy;
    }
    
    public void setMinimumOrderQuantity(int minimumOrderQuantity) {
        this.minimumOrderQuantity = minimumOrderQuantity;
    }
    public int getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }
    
    public void setMeta(Meta meta) {
        this.meta = meta;
    }
    public Meta getMeta() {
        return meta;
    }
    
    public void setImages(List<String> images) {
        this.images = images;
    }
    public List<String> getImages() {
        return images;
    }
    
    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }
    public String getThumbnail() {
        return thumbnail;
    }
    
}