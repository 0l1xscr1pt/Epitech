import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Inspector<T> {
    protected Class<T> inspectedClass;

    public Inspector(Class<T> inspectedClass) {
        this.inspectedClass = inspectedClass;
    }

    public void displayInformations() {
        Field [] fieldsAttributes = inspectedClass.getDeclaredFields();
        Method [] methodsAttributes = inspectedClass.getDeclaredMethods();
        
        //Dynamique ou pas ?
        //2 dernieres phrases de la task 1
        System.out.println("Information of the \"" + inspectedClass.getName() + "\" class:");
        System.out.println("Superclass: " + inspectedClass.getSuperclass().getName());


        // methods -------------- methods //

        int numberOfMethods = methodsAttributes.length;

        if (numberOfMethods <= 1)
            System.out.println(numberOfMethods + " method:");
        else
            System.out.println(numberOfMethods + " methods:");


        //Method le tableau //method = chaque element un par un
        for(Method method: methodsAttributes) {
            System.out.println("- " + method.getName());
        }




        // fields -------------- fields //

        int numberOfFields = fieldsAttributes.length;

        if (numberOfFields <= 1)
            System.out.println(numberOfFields + " fields:");
        else
            System.out.println(numberOfFields + " fields:");


        for(Field field: fieldsAttributes) {
            System.out.println("- " + field.getName());
        }
    }


    public T createInstance() throws Exception {
        try {
            Constructor<T> constructor = inspectedClass.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            throw e;
        }
    }


    // public static void main ( String args []) {
    //     Inspector<Number> inspector = new Inspector<>(Number.class);
    //     inspector.displayInformations();
    // }
}
