package AbstractFactory;

interface Burger{
    public void prepare();
}
class basicBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Basic Burger with bun, patty, and ketchup!");
    }
}
class standardBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Standard Burger with bun , patty , ketchup and cheese");
    }
}
class premiumBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

class basicWheatBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Basic Burger with gourmet bun, patty, and ketchup!");
    }
}

class standardWheatBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Standard Burger with gourmet bun , patty , ketchup and cheese");
    }
}

class premiumWheatBurger implements Burger {
    public void prepare(){
        System.out.println("Preparing Premium Burger with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

interface GarlicBread{
    public void prepare();
}
class basicBread implements GarlicBread {
    public void prepare(){
        System.out.println("Preparing Basic Bread with bun, patty, and ketchup!");
    }
}
class standardBread implements GarlicBread{
    public void prepare(){
        System.out.println("Preparing Standard Bread with bun , patty , ketchup and cheese");
    }
}
class premiumBread implements GarlicBread {
    public void prepare(){
        System.out.println("Preparing Premium Bread with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

class basicWheatBread implements GarlicBread {
    public void prepare(){
        System.out.println("Preparing Basic Bread with gourmet bun, patty, and ketchup!");
    }
}

class standardWheatBread implements GarlicBread {
    public void prepare(){
        System.out.println("Preparing Standard Bread with gourmet bun , patty , ketchup and cheese");
    }
}

class premiumWheatBread implements GarlicBread {
    public void prepare(){
        System.out.println("Preparing Premium Bread with gourmet bun, premium patty, cheese, lettuce, and secret sauce!");
    }
}

interface MealFactory{
    public Burger createBurger(String type);
    public GarlicBread createGarlicBread(String type);

}

class singhBurger implements MealFactory {
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

    public GarlicBread createGarlicBread(String type) {
        if (type == "basic") {
            return new basicBread();
        }
        else if (type == "standard") {
            return new standardBread();
        }
        else {
            return new premiumBread();
        }

    }

}

class kingBurger implements MealFactory {
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

    public GarlicBread createGarlicBread(String type) {
        if (type == "basic") {
            return new basicWheatBread();
        }
        else if (type == "standard") {
            return new standardWheatBread();
        }
        else {
            return new premiumWheatBread();
        }

    }

}


public class AbstractFactory {
    public static void main(String[] args){
        MealFactory factory = new singhBurger();
        MealFactory factory2 = new kingBurger();

        Burger burger = factory.createBurger("standard");
        burger.prepare();

        Burger burger2 = factory2.createBurger("basic");
        burger2.prepare();

        GarlicBread garlicBread=factory.createGarlicBread("basic");
        garlicBread.prepare();

        GarlicBread garlicBread2=factory2.createGarlicBread("standard");
        garlicBread2.prepare();
    }
}
