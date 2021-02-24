package ru.netology.domain;
//информация о лайках к записи
public class PostLikes {
    private int count; //число пользователей, которым понравилась запись;
    private int userLikes; // наличие отметки«Мне нравится»от текущего пользователя (1— есть,0— нет)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    private  int canLike; // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»(1 — может, 0 — не может);
}
