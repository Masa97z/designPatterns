package Observer;

public class students implements Observer {
    private String name;
    public students(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " has new notifay " + message);
    }
}
