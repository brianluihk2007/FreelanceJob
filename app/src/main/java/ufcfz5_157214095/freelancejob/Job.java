package ufcfz5_157214095.freelancejob;

import java.sql.Time;
import java.util.List;

/**
 * Created by X on 1/11/2015.
 */
public class Job {

    private String title;
    private String content;

    private Time time;
    private String address;

    private String sms;
    private String email;

    private List<String> images;

    public Job(){}

    public Job(String title, String content, Time time, String address, String sms, String email, List<String> images) {
        this.title = title;
        this.content = content;
        this.time = time;
        this.address = address;
        this.sms = sms;
        this.email = email;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
