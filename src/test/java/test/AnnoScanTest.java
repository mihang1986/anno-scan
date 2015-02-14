package test;

import com.sao.LoadPackageClasses;
import com.sao.anno.AnnoA;
import org.junit.Test;

import java.io.IOException;
import java.util.Set;

/**
 * Created by navia on 2015/2/11.
 */
public class AnnoScanTest {
    @Test
    public void xxTest() throws IOException, ClassNotFoundException {
        LoadPackageClasses l = new LoadPackageClasses(new String[]{"com.sao.bean"}, AnnoA.class);
        Set<Class<?>> s = l.getClassSet();

        for(Class c : s){
            System.out.println(c.getName());
        }

    }
}
