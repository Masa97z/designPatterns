import java.util.*;

public class senglton {
    //create one object

    private Integer[] numbers = {1,2,3,4,5};
    private List<Integer> list = Arrays.asList(numbers);
    private static senglton instance ;

    public static senglton getInstance() {
        if(instance == null){
            instance = new senglton();
        }
        return instance;
    }

    private senglton (){
        System.out.println("object created");
        Collections.shuffle(list);
        System.out.println(this.hashCode());
    }
    public void print(){
        for (Integer number:list) {
            System.out.print(number.toString()+ "  ");
        }
        System.out.println(" ");
    }
}
