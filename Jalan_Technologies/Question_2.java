package Jalan_Technologies;

import java.util.*;
/*
 *Question_2
 It should have the following features:
The car service station caters to different types of cars – Hatchback, Sedan, SUV.
It provides different types of services like Basic Service, Engine Fixing, Clutch Fixing, Gear Fixing and Brake Fixing.
Each service has a service code associated with it and different prices for different types of cars.
Service Code Service Hatchback Sedan SUV
BS01 Basic Servicing ₹ 2000 ₹ 4000 ₹ 5000
EF01 Engine Fixing ₹ 5000 ₹ 8000 ₹ 10000
CF01 Clutch Fixing ₹ 2000 ₹ 4000 ₹ 6000
BF01 Brake Fixing ₹ 1000 ₹ 1500 ₹ 2500
GF01 Gear Fixing ₹ 3000 ₹ 6000 ₹ 8000

The software should generate a detailed bill with the total amount for each service request based on the Type of
Car specified and the requested Service Codes.
Example:
Type of Car – Hatchback
Service Codes – BS01, EF01
Charges for Basic Servicing – ₹ 2000
Charges for Engine Fixing – ₹ 5000
Total Bill – ₹ 7000
In addition, if the total service bill is more than ₹ 10000, a complimentary cleaning should be provided and specified
in the bill.
 */

class Car {

    String serviceCode;

    String service;

    Map<String, Integer> map;

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setMap(Map<String, Integer> map) {
        this.map = map;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public String getService() {
        return service;
    }

    public Map<String, Integer> getMap() {
        return map;
    }

}

class CarHolder {
    static List<Car> list = new ArrayList<>();

    static void init(String serviceCode, String serviceType, int carA, int carB, int carC) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Hatchback", carA);
        map.put("Sedan", carB);
        map.put("SUV", carC);

        Car c = new Car();

        c.setMap(map);
        c.setServiceCode(serviceCode);
        c.setService(serviceType);
        list.add(c);
    }

    static int getAmount(String serviceCode, String carType) {
        for (Car c : list) {
            if (c.getServiceCode().equals(serviceCode)) {
                Map<String, Integer> map = c.getMap();
                Integer integer = map.get(carType);
                return integer;
            }
        }
        return 0;
    }

}

public class Question_2 {
    public static void main(String[] args) {
        CarHolder.init("BS01", "Basic Servicing", 2000, 4000, 5000);
        CarHolder.init("EF01", "Engine Fixing", 5000, 8000, 10000);
        CarHolder.init("CF01", "Clutch Fixing", 2000, 4000, 6000);
        CarHolder.init("BF01", "Brake Fixing", 1000, 1500, 2500);
        CarHolder.init("GF01", "Gear Fixing", 3000, 6000, 8000);
        Scanner s = new Scanner(System.in);
        int bill = 0;
        System.out.print("How may car service : ");
        int c = s.nextInt();

        for (int i = 1; i <= c; i++) {
            System.out.print("Type of car : ");
            String carType = s.next();
            System.out.print("No of car in type of " + carType + " :");
            int serviceCodeCount = s.nextInt();
            List<String> serviceCodeList = new ArrayList<>();
            for (int j = 1; j <= serviceCodeCount; j++) {
                System.out.print("Enter " + j + " service code number :");
                serviceCodeList.add(s.next());
            }
            for (String s1 : serviceCodeList)
                bill += CarHolder.getAmount(s1, carType);
        }
        System.out.println("Total Bill :" + bill);

    }
}
