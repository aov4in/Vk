package ru.netology.domain;
//информация о местоположении
public class PostGeo {
    private String type;
    private String coordinates;
    private PostPlace postPlace; //Объект, описывающий место

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public PostPlace getPostPlace() {
        return postPlace;
    }

    public void setPostPlace(PostPlace postPlace) {
        this.postPlace = postPlace;
    }
}
