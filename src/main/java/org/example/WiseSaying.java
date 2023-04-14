package org.example;

public class WiseSaying {

    long id;
    String content;
    String authorName;

    public WiseSaying(long id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;

    }

    public String getauthorName() {
        return authorName;
    }

    public String getContent() {
        return content;
    }
    public long getId() {
        return id;
    }
}
