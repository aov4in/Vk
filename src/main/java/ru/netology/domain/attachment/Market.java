package ru.netology.domain.attachment;

public class Market {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int weight;
    private String thumbPhoto;
    private int date;
    private int availability;
    private boolean isFavorite;
    private String sku;

    // Опциональные поля, задаваемые параметром extended = 1
    private int canComment;
    private int canRepost;
    private String url;
    private String buttonTitle;

    public String generateBlock(){
        return null;
    }
}
