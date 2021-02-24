package ru.netology.domain;
//информация о репостах записи («Рассказать друзьям»)
public class PostRepost {
    private int count; //число пользователей, скопировавших запись
    private int userReposted; //наличие репоста от текущего пользователя (1— есть,0— нет).
}
