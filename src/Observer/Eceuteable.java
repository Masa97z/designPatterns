package Observer;

public class Eceuteable {
    public static void main(String[] args) {
        students masa = new students("masa");
        students jasim = new students("jasim");
        students alaa = new students("alaa");
        students hasn = new students("hasn");

        Course course = new Course("java");
        course.subscribe(masa);
        course.subscribe(jasim);
        course.subscribe(alaa);
        course.subscribe(hasn);
        course.unsubscribe(masa);
        course.setAvailabilty(true);
    }
}
