package ncu.study.autopaper.common.result;

public class ErrorInfo {

    private int    index;
    private String content;

    public ErrorInfo(int index, String content) {
        this.index = index;
        this.content = content;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
