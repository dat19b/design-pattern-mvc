package twitter.observerable;

public class Tweet {
    private String headline;
    private String body;
    private String img;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "headline='" + headline + '\'' +
                ", body='" + body + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
