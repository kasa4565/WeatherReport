package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wind
{
    private String speed;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
