package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class RockMusic implements Music {

    private List<String> music = new ArrayList<>(3);

    {
        music.add("Linkin Park");
        music.add("Metallica");
        music.add("System of a Down");
    }
    Random random = new Random();
    @Override
    public String getSong() {
        return music.get(random.nextInt(0, 3));
    }
}
