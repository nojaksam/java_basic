public class movieMain {
    public static void main(String[] args) {
        movie movie1 = new movie();
        movie1.title = "어바웃타임";
        movie1.star = 3.4;
        movie movie2 = new movie();
        movie2.title = "인생은 무한 루프";
        movie2.star = 4.5;

        movie[] movies = {movie1, movie2};
        for(movie i : movies ){
            System.out.println("영화 : " + i.title + " 별점 : " + i.star);
        }
    }
}
