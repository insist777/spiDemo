import com.spi.InterfaceClass;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Test {
    public static void main(String[] args) {
        ServiceLoader<InterfaceClass> load = ServiceLoader.load(InterfaceClass.class);
        Iterator<InterfaceClass> iterator = load.iterator();
        while (iterator.hasNext()) {
            InterfaceClass next = iterator.next();
            System.out.println(next.getClass().getName());
        }
    }
}
