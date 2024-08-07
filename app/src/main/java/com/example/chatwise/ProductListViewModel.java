package com.example.chatwise;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ProductListViewModel {
    @SerializedName("products")
    List<Products> products;

    @SerializedName("total")
    int total;

    @SerializedName("skip")
    int skip;

    @SerializedName("limit")
    int limit;


    public void setProducts(List<Products> products) {
        this.products = products;
    }
    public List<Products> getProducts() {
        return products;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }
    public int getSkip() {
        return skip;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
    public int getLimit() {
        return limit;
    }
    public static class Products implements Serializable {

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
        @BindingAdapter({"images"})
        public static void images(ImageView imageView, String url) {
            Glide.with(imageView.getContext()).load(url).into(imageView);
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






        public class Reviews implements Serializable{

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



        public class Meta  implements Serializable{

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



        public class Dimensions implements Serializable {

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

    }
}
