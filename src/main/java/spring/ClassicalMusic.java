package spring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {    }

    public static ClassicalMusic getInstance() {
        return new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    private void init() {
        System.out.println("Doing my initialization");
    }

    private void destroy() {
        System.out.println("Doing my destruction");
    }
}
