package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Clouds
{
    private String all;

    public String getAll() {
        return all;
    }

    public void setAll(String all) {
        this.all = all;
    }
}
