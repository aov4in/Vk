package ru.netology.domain;

public class PostComments {
    private int canPost; //информация о том, может ли текущий пользователь комментировать запись (1— может,0— не может);
    private int groupsCanPost; // информация о том, могут ли сообщества комментировать запись (1— может,0— не может);
    private boolean canClose; //может ли текущий пользователь закрыть комментарии к записи.
    private boolean canOpen; //может ли текущий пользователь открыть комментарии к записи.

    public int getCanPost() {
        return canPost;
    }

    public void setCanPost(int canPost) {
        this.canPost = canPost;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }
}
