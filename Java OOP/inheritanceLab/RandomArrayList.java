package inheritanceLab;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<Object> extends ArrayList<Object> {

    public Object getRandomElement(){
        int end = super.size();
        Random random = new Random();
        int randomIndex = random.nextInt(end);
        return remove(randomIndex);
    }
}
