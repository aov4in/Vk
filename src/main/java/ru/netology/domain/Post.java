package ru.netology.domain;

public class Post {
    private int commentsId;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private int friendsOnly;
    private String PostType;
    private int signerId;
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPinned;
    private int markedAsAds;
    private boolean isFavorite;
    private boolean postIsFavorite;
    private int postponedId;

    private PostComments postComment; //объект с информацией о комментариях к записи
    private PostCopyright postCopyright;//объект с информацией об источнике материала(записи)
    private PostLikes postLike; //объект с информацией о лайках к записи
    private PostRepost postRepost;//объект с информацией о репостах записи («Рассказать друзьям»)
    private PostViews postViews;//объект с информацией о просмотрах записи
    private PostSource postSource;//объект с информацией о способе размещения записи
//    private PostAttachments postAttachment;//объект с информацией о медиа вложениях записи, (array)
    private PostGeo postGeo; //объект с информацией о местоположении
//    private PostCopyHistory; //массив, содержащий историю репостов для записи (array)
    private PostDonut postDonut;//информация о записи VK Donut

}
