package newsSystem;

import java.util.Date;

public class New {
    private int id;
    private String title;
    private String content;
    private String authur;
    private Date time;

    public New() {
        super();
    }

    public New(String title, String content, String authur, Date time) {
        this.title = title;
        this.content = content;
        this.authur = authur;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthur() {
        return authur;
    }

    public void setAuthur(String authur) {
        this.authur = authur;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", authur='" + authur + '\'' +
                ", time=" + time +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void clear(){
        title="";
        content="";
        authur="";
        time=null;
    }
}
