package IP11.Borisyuk;

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
}
