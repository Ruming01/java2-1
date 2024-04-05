public class Ex04_05 {
    String title;
    String author;
    
    public Ex04_05() {
        this ( " ", "" );
        System.out.println ("생성자 호출됨" ) ;
    }

    public Ex04_05 (String t) {
        this(t, "작자미상");
    }

    public Ex04_05 (String t, String a) {
        this.title = t;
        this.author = a;
    }

    public static void main(String[] args) {
        Ex04_05 littlePrince = new Ex04_05("어린왕자", "생택쥐페리");
        Ex04_05 loveStory = new Ex04_05("춘향전");
        Ex04_05 emptyBook = new Ex04_05();
        
        System.out.println(littlePrince.title + " " + littlePrince.author);
        System.out.println(loveStory.title + " " + loveStory.author);
    }
}
