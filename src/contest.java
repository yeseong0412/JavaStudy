import javax.lang.model.util.Elements;
import javax.swing.text.Document;
import java.io.IOException;

public class contest {
    public static void main(String[] args) {
        private static void crawling() {
            String URL = "https://www.onoffmix.com/event/main?s=해커톤";; // 원하는 url
            Document doc;

            try {
                doc = Jsoup.connect(URL)
                        .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_2) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/33.0.1750.152 Safari/537.36")
                        .get(); // 원하는 url에서 전체 구조를 받아온다
                Elements elem = doc
                        .select("article.event_area event_main");

                // 확인
                System.out.println("이거임");
                elem.forEach(System.out::println);


            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

}
