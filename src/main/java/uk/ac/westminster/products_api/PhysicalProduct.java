package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {
    private double weightKg;
    private String dimensions;

    public  PhysicalProduct(){
    }

    public PhysicalProduct(Long id,String name, double price, String dimensions, double weightKg){
        super (id,name,price);
        this.weightKg=weightKg;
        this.dimensions=dimensions;
    }

    public double getWeightKg(){
        return weightKg;
    }

    public double getDimensions(){
        return dimensions;
    }
}
