import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestRunner {
    public void runTests(Class<?> testClass) {
        //@Test;
        //method.invoke();
        Object tmp = testClass.getDeclaredConstructor().newInstance();

        for(Method method: testClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                method.invoke(tmp);
            }
        }
    }
}
