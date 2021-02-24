package ru.netology.domain;
//Объект PostSource, описывающий способ размещения записи на стене
public class PostSource {

// type - тип источника Возможные значения:
// vk — запись создана через основной интерфейс сайта (http://vk.com/);
// widget — запись создана через виджет на стороннем сайте;
// api — запись создана приложением через API;
// rss— запись создана посредством импорта RSS-ленты со стороннего сайта;
// sms — запись создана посредством отправки SMS-сообщения на специальный номер.
    private String type;

//    platform - название платформы, если оно доступно. Возможные значения:    android;    iphone;    wphone.
    private String platform;

//    data - тип действия (только для type = vk или widget). Возможные значения:
//    profile_activity — изменение статуса под именем пользователя (для type = vk);
//    profile_photo — изменение профильной фотографии пользователя (для type = vk);
//    comments — виджет комментариев (для type = widget);
//    like — виджет «Мне нравится» (для type = widget);
//    poll — виджет опросов (для type = widget);
    private String data;

//    URL ресурса, с которого была опубликована запись.
    private String url;
}
