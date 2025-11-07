class MyInfo {
    public static void main(String[] args){
        Car myCar = new Car();
        myCar.setBrand("Honda");

        myCar.start();
        myCar.drive();
    }
}

class Vehicle {
    String brand;

    void setBrand(String brand) {
        this.brand = brand;
    }

    void start(){
        System.out.println(brand + " กำลังสตาร์ท...");
    }

}

class Car extends Vehicle {
    void drive(){
        System.out.println(brand + " กำลังขับเคลื่อนบนถนน");
    }
}