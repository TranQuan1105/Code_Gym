package com.example.hien_thi_danh_sach_khach_hang;

public class Customer {
    private String name;
    private String dob;
    private String adrress;
    private String image;

    public Customer(String name, String dob, String adrress, String image) {
        this.name = name;
        this.dob = dob;
        this.adrress = adrress;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAdrress() {
        return adrress;
    }

    public void setAdrress(String adrress) {
        this.adrress = adrress;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
