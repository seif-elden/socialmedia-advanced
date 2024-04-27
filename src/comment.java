import java.time.LocalDateTime;


public class comment {
    private profile author;
    private String content;
    private LocalDateTime timestamp;

    // Constructor
    public comment(profile author, String content) {
        this.author = author;
        this.content = content;
        this.timestamp = LocalDateTime.now();
    }

    public String getContent() {
        return content;
    }

    public profile getAuthor() {
        return author;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }



}