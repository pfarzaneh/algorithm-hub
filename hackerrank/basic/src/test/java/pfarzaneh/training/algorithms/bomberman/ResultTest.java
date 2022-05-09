package pfarzaneh.training.algorithms.bomberman;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
class ResultTest {
    @Test
    void truckTourTest() {
        List<String> list = new ArrayList<>();
        list.add("......OO");
        list.add(".OO.....");
        list.add("........");
        list.add("......O.");
        list.add("OO......");
        list.add("......O.");
        List<String> list1 = new ArrayList<>(list);
        List<String> result = Result.bomberMan(9, list);
        List<String> result1 = Result.bomberMan(17, list1);
        for(String s : result){System.out.println(s);} System.out.println();
        for(String s : result1){System.out.println(s);}
    }
}

