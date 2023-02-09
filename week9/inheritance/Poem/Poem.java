package inheritance;

public class Poem {
    
    String titles;
    int lines;
    
    public Poem(String titles, int lines){
        this.titles = titles;
        this.lines = lines;
    }
    
    public String getTitle(){
        return this.titles;
    }
    
    public int getLines(){
        return this.lines;
    }
//        public static void main (String [] args){
//            Poem poem = new Poem("This is a song",10);
//            System.out.println(poem.getTitle());
//        }
}
