package com.driver;

public static class Main {

    public static void main(String[] args){
        Product p=new Product();
        int ans=p.product(10,20);

        int ans1=p.product(1,2,3);

        double ans2=p.product(1.0,2.0);

        System.out.println(ans+" "+ans1+" "+ans2);
    }
    public static class Product{
        public int product(int x,int y){
            return x*y;
        }
        public int product(int x,int y,int z){
            return x*y;
        }
        public double product(double x,double y){
            return x*y;
        }
   }
}