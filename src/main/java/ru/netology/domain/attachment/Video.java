package ru.netology.domain.attachment;

public class Video {
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private int duration;
    private int date;
    private int addingDate;
    private int views;
    private int localViews;
    private int comments;
    private String player;
    private String platform;
    private int canEdit;
    private int canAdd;
    private int isPrivate;
    private String accessKey;
    private int processing;
    private boolean isFavorite;
    private int canComment;
    private int canLike;
    private int canRepost;
    private int canSubscribe;
    private int canAddToFaves;
    private int canAttachLink;
    private int width;
    private int height;
    private int userId;
    private int converting;
    private int added;
    private int isSubscribed;
    private int repeat;
    private String type;
    private int balance;
    private String liveStatus;
    private int live;
    private int upcoming;
    private int spectators;

    private VideoLikes videoLikes;
    private VideoReposts videoReposts;

    public String generateBlock(){
        return null;
    }
}
