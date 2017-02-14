package	jp.co.mysota;

public class Translated {
    public Data data;
    public static class Data{
        public Translation[] translations;
        public static class Translation {
            public String translatedText;
        }
    }
}