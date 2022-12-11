package com.driver;

public class Main {

   public static class A{
        // Class A contains  method meth()
       public String meth(){

            return "Invoking method from class A";
        }

    }
    public static class B extends A{
        // Class B contains method meth()

        @Override
         public String meth(){

            return "Method is overridden in Extendend class B";
        }

    }
    public static void main(String[] args) {
        // Create object of class B

        B obj = new B();
        obj.meth();
    }

}