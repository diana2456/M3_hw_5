package space.lobanovi.m3_hw_5;

public class ChatModel {
    int image;
    String title;
    String message;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ChatModel(int image, String title, String message) {
        this.image = image;
        this.title = title;
        this.message = message;
    }


}
