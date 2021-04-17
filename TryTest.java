import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Vans
 * @date 2021/4/17 - 10:48
 */
class t1{
    public int []a ={ 2, 1, 3, 1, 4 };
    public int answer = 1;
}
class t2{
    public int []a = { 2, 4, 3, 1, 4 };
    public int answer = 4;
}
class t3{
    public int []a = { 2, 4, 2, 1, 4 };
    public int []answer = {2, 4};
}
class t4{
    public int []a = { 2, 1, 3, 0, 4 };
    public int answer = -1;
}
class t5{
    public int []a = null;
    public int answer = -1;
}
class t6{
    public int []a = {4, 4, 4, 4, 4};
    public int answer = 4;
}

class Find{
    public int[] find(int a[]){
        int b = 0;
        int j = 0;
        int []n = new int[1];
        if ( a == null)
        {
            n[0] = -1;
            return n;
        }
        int []answer = new int[a.length];

        out:
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                answer[0] = -1;
                break out;
            }
             while (a[i] != i){
                 if ( a[a[i]] == a[i]){
                     answer[j] = a[i];
                     j++;
                     i++;
                     b = 1;
                 }
                int p = a[a[i]];
                a[a[i]] = a[i];
                a[i] = p;
            }
        }
        if (b == 0)
            answer[0] = -1;

        return answer;
    }
}
public class TryTest {
    public static void main(String[] args) {
        Find f = new Find();
        t6 t = new t6();
        System.out.println(Arrays.toString(f.find(t.a)));
        if (f.find(t.a)[0] == t.answer)
            System.out.println("correct");
        else
            System.out.println("Incorrect");
    }

}
