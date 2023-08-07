package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
//    @Autowired
//    @Qualifier("classicalMusic")
    private Music music;
    private Music music1;
//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
    private String name;
    private int volume;
    public MusicPlayer() {
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music,
                       @Qualifier("classicalMusic") Music music1) {
        this.music = music;
        this.music1 = music1;
    }

    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    //    @Autowired
//    public MusicPlayer(ClassicalMusic classicalMusic) {
//        this.classicalMusic = classicalMusic;
//    }
    // IoC

//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }


    public List<Music> getMusicList() {
        return musicList;
    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    private void init() {
        System.out.println("Initialize");
    }
    private void destroy() {
        System.out.println("Destroy");
    }

    public void playMusic(MusicEnum musicEnum) {
        if (musicEnum.equals(MusicEnum.CLASSICAL)) {
            System.out.println(music1.getSong());
        }
        if (musicEnum.equals(MusicEnum.ROCK)) {
            System.out.println(music.getSong());
        }
//        return "Playing " + music.getSong() + ", " + music1.getSong();
//        System.out.println("Playing: " + classicalMusic.getSong());
//        System.out.println("Playing: " + rockMusic.getSong());
//        System.out.println("Playing: " + music.getSong());
    }
}
