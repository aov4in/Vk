package ru.netology.domain;
//информация о записи VK Donut
public class PostDonut {
    private boolean userIsDonut; //запись доступна только платным подписчикам VK Donut;
    private int paidDuration; //время, в течение которого запись будет доступна только платным подписчикам VK Donut;
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
    private String editMode; //информация о том, какие значения VK Donut можно изменить в записи

    public boolean isUserIsDonut() {
        return userIsDonut;
    }

    public void setUserIsDonut(boolean userIsDonut) {
        this.userIsDonut = userIsDonut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
