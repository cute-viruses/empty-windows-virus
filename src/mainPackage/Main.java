package mainPackage;


public class Main {
    public static void main(String[] args){

        for(;;){
            new EmptyWindow(getTitle((int)(Math.random() * 3)),
                    (int)(Math.random()*900), (int)(Math.random()*900),
                    (int)(Math.random()* 1000), (int)(Math.random()* 1000));
        }
    }
    public static String getTitle(int index){
        String[] titles = {
                "god take you",
                "suffering hurts you",
                "eat straw",
                "O bull"
        };
        return titles[index];
    }
}
