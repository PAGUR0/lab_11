package com.company;

class product_berries implements product {
    public String name;
    protected double price;
    protected int rating;

    product_berries(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) { this.price = price; }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) { this.rating = rating; }
}