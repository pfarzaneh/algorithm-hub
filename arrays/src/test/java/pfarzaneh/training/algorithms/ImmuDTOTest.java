package pfarzaneh.training.algorithms;

import javax.sound.sampled.SourceDataLine;

import org.junit.jupiter.api.Test;

public class ImmuDTOTest {

    @Test
    public void test(){
        ImmuDTO immuDTO_1 = new ImmuDTO("hamid", 1000);
        ImmuDTO immuDTO_2 = new ImmuDTO("hamid", 1000);

        System.out.println(immuDTO_1.equals(immuDTO_2));
        System.out.println(immuDTO_1==immuDTO_2);

    }
}
