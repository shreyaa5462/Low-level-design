package FactoryMethod;
interface Burger{
    public void prepare();
}
class basicBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
class standardBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Standard Burger with bun , patty , ketchup and cheese");
    }
}
class premiumBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

class basicWheatBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Basic Burger with gourmet bun, patty, and ketchup!");
    }
}

class standardWheatBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Standard Burger with gourmet bun , patty , ketchup and cheese");
    }
}

class premiumWheatBurger implements Burger{
    public void prepare(){
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}


interface BurgerFactory{
    public Burger createBurger(String type);

}

class singhBurger implements BurgerFactory{
    public Burger createBurger(String type) {
        if (type == "basic") {
            return new basicBurger();
        }
       else if (type == "standard") {
           return new standardBurger();
        }
        else {
           return new premiumBurger();
       }

   }
}

class kingBurger implements BurgerFactory{
    public Burger createBurger(String type) {
        if (type == "basic") {
            return new basicBurger();
        }
        else if (type == "standard") {
            return new standardBurger();
        }
        else {
            return new premiumBurger();
        }

    }
}


public class FactoryMethod {
    public static void main(String[] args){
        BurgerFactory factory = new singhBurger();
        BurgerFactory factory2 = new kingBurger();

        Burger burger = factory.createBurger("standard");
        burger.prepare();

        Burger burger2 = factory2.createBurger("standard");
        burger2.prepare();
    }
}
