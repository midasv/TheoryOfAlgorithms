package IP11.Borisyuk;

import Ir11exam.ir11exam1;
import Ir11exam.ir11exam2;
import TheoryOfAlgorithms.Borisyuk.Lab5.Lab5_2;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BorisyukApplicationTests {

	@Test
	void contextLoads() {
	}
 @Test
    void Laba5Test()
    {
        Lab5_2 lab5 = new Lab5_2(20);
        lab5.InitList();
        
        assertEquals(-1, lab5.jumpSearch("acer"));
        lab5.SortByStringField();
        assertEquals(3, lab5.jumpSearch("model #11"));
    }
    @Test
    void testFormula()
    {
        assertEquals(0.11764705882352941, Double.parseDouble(ir11exam1.Calculate(2)));
    }
    
    
   
    
    @Test
    void testSearching()
    {
        ir11exam2 fr = new ir11exam2();
        double[] args = new double[]{3d, 4d, 5d};
        fr.SetArgs(args);
        fr.Calculate();
        assertEquals(-1.0, ir11exam2.SearchResult(16));
    }
}
