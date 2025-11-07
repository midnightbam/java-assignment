public class MyInfo {
public static void main(String[] args) {
        // สร้าง object จากคลาส Car
        Car myCar = new Car();

        // ใช้ setter เพื่อกำหนดค่า brand และ speed
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);

        // เรียกใช้ method เพื่อแสดงข้อมูล
        myCar.displayInfo();
    }
}

// =====================
// คลาส Car
// =====================
class Car {
    // 🔒 สร้าง property แบบ private
    private String brand;
    private int speed;

    // ✅ Setter สำหรับ brand
    public void setBrand(String newBrand) {
        brand = newBrand;
    }

    // ✅ Getter สำหรับ brand
    public String getBrand() {
        return brand;
    }

    // ✅ Setter สำหรับ speed
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    // ✅ Getter สำหรับ speed
    public int getSpeed() {
        return speed;
    }

    // ✅ Method แสดงข้อมูลรถ
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}