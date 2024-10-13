import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class L2022212034_17_Test {
    /*
    可以将整个测试空间划分成三个等价类，长度小于10，没有重复出现长度为10的串，重复出现
    长度为10的串
    */
    @Test
    public void test1() {
        //测试长度小于10的字符串
        List<String> L = new ArrayList<String>();
        assertEquals(L, Solution.findRepeatedDnaSequences("AAATTTGGG"));
    }
    @Test
    public void test2() {
        //测试没有重复出现的长度为10的串
        List<String> L = new ArrayList<String>();
        assertEquals(L, Solution.findRepeatedDnaSequences("AAAAAAAAAGGG"));
    }
    @Test
    public void test3() {
        //测试有重复出现的长度为10的串
        List<String> L = new ArrayList<String>();
        L.add("AAAAACCCCC");
        L.add("CCCCCAAAAA");
        assertEquals(L, Solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
//        System.out.println(Solution.findRepeatedDnaSequences("AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"));
        L.clear();
        L.add("AAAAAAAAAA");
        assertEquals(L, Solution.findRepeatedDnaSequences("AAAAAAAAAAAAA"));
    }
}
