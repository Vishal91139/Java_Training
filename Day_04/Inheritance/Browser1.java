package Day_04.Inheritance;

public interface Browser1 {
    void browser1();
}

interface Browser2 {
    void browser2();
}

interface Browser3 {
    void browser3();
}

class Browsers implements Browser1, Browser2,Browser3 {
    @Override 
    public void browser1(){
        System.out.println("Google chrome");
    }
    
    @Override 
    public void browser2(){
        System.out.println("Safari");
    }

    @Override 
    public void browser3(){
        System.out.println("Mozilla firefox");
    }
}

class Demo {
    public static void main(String[] args) {
        Browsers browsers = new Browsers();
        browsers.browser1();
        browsers.browser2();
        browsers.browser3();
    }
}