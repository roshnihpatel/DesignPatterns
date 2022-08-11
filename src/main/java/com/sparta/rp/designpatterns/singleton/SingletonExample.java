package com.sparta.rp.designpatterns.singleton;



public class SingletonExample {
    private static SingletonExample SINGLETON = new SingletonExample();
   private SingletonExample(){

   }
   public static SingletonExample getSingleton(){
       if(SINGLETON == null){
           SINGLETON = new SingletonExample();
       }
       return SINGLETON;
   }

}
