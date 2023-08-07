package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class ClassicalMusic implements Music {
    private List<String> music = new ArrayList<>(3);

    {
        music.add("Bethoven");
        music.add("Antique");
        music.add("Rastropovich");
    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }

    Random random = new Random();
    @Override
    public String getSong() {
        return music.get(random.nextInt(0,3));
    }

    private void init() {
        System.out.println("Doing my initialization");
    }

    private void destroy() {
        System.out.println("Doing my destruction");
    }
}
