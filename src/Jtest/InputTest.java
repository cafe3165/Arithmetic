import org.junit.Test;
import test.Arith;
import test.Input;

import static org.junit.Assert.*;

/**
 *
 * Created by X on 2016/12/4.
 */
public class InputTest {
    //输入1/2、3/4,进行测试并输出input数组里的数
    @Test
    public void input(){
        Arith.n=2;
        Input.Input();
        int x,y,z,t;
        x=Arith.input[0][0];
        y=Arith.input[0][1];
        z=Arith.input[1][0];
        t=Arith.input[1][1];

        assertEquals(1, x);
        assertEquals(2, y);
        assertEquals(3, z);
        assertEquals(4, t);

        for(int i=0;i<Arith.n;i++){
            System.out.println(Arith.input[i][0]+"/"+Arith.input[i][1]+" ");
        }
    }
}