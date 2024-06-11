import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Home {
    private static String oven;
    private String tv;
    private String radio;
    private static void privateMethod2(){
        System.out.println("i`m Private 02");
    }

    public static String getOven() {
        return oven;
    }

    public static void setOven(String ovan) {
        Home.oven = ovan;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    private void privateMethod(){
        System.out.println("i`m Private");
    }
}




public class Main {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Home home = new Home();

        Field[] declaredFields = home.getClass().getDeclaredFields();
        for(Field declaredField: declaredFields){
           if(declaredField.getName().equals("tv")){
               declaredField.setAccessible(true);
               declaredField.set(home,"Tv is on");
           } else if (declaredField.getName().equals("oven")) {
               declaredField.setAccessible(true);
               declaredField.set(null,"oven is on");
           }
        }

        Method[] declaredMethods = home.getClass().getDeclaredMethods();

        for(Method declaredMethod: declaredMethods){
            if(declaredMethod.getName().equals("privateMethod")){
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(home);
            } else if (declaredMethod.getName().equals("privateMethod2")) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null);
            }
        }


        System.out.println(home.getTv());
        System.out.println(home.getOven());
    }
}