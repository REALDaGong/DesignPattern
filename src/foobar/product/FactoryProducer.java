package foobar.product;

import foobar.product.product_factory.*;

public class FactoryProducer {
    public static BaseFactory getFactory(String choice){
       if(choice.equalsIgnoreCase("Farm")){
          return new FarmFactory();
       } else if(choice.equalsIgnoreCase("Pasture")){
          return new PastureFactory();
       }
       return null;
    }
 }