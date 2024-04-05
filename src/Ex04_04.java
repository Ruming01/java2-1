public class Ex04_04 {
    String title;
    String author;
    
    public Ex04_04 (String t) {
        title = t; author = "작자미상";
    }

    public Ex04_04 (String t, String a) {
        title = t; author = a;
    }

    public static void main(String[] args) {
        Ex04_04 littlePrince = new Ex04_04("어린왕자", "생택쥐페리");
        Ex04_04 loveStory = new Ex04_04("춘향전");
        
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
