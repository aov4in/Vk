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
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
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

    public int getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(int commentsId) {
        this.commentsId = commentsId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getPostType() {
        return PostType;
    }

    public void setPostType(String postType) {
        PostType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean getCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(boolean isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public boolean isPostIsFavorite() {
        return postIsFavorite;
    }

    public void setPostIsFavorite(boolean postIsFavorite) {
        this.postIsFavorite = postIsFavorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public PostComments getPostComment() {
        return postComment;
    }

    public void setPostComment(PostComments postComment) {
        this.postComment = postComment;
    }

    public PostCopyright getPostCopyright() {
        return postCopyright;
    }

    public void setPostCopyright(PostCopyright postCopyright) {
        this.postCopyright = postCopyright;
    }

    public PostLikes getPostLike() {
        return postLike;
    }

    public void setPostLike(PostLikes postLike) {
        this.postLike = postLike;
    }

    public PostRepost getPostRepost() {
        return postRepost;
    }

    public void setPostRepost(PostRepost postRepost) {
        this.postRepost = postRepost;
    }

    public PostViews getPostViews() {
        return postViews;
    }

    public void setPostViews(PostViews postViews) {
        this.postViews = postViews;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public PostGeo getPostGeo() {
        return postGeo;
    }

    public void setPostGeo(PostGeo postGeo) {
        this.postGeo = postGeo;
    }

    public PostDonut getPostDonut() {
        return postDonut;
    }

    public void setPostDonut(PostDonut postDonut) {
        this.postDonut = postDonut;
    }

}
