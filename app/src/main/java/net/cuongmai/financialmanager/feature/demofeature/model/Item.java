package net.cuongmai.financialmanager.feature.demofeature.model;

public class Item {

    private String text;

    private String subText;

    private int type;

    public Item(String text, String subText, int type) {
        this.text = text;
        this.subText = subText;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSubText() {
        return subText;
    }

    public void setSubText(String subText) {
        this.subText = subText;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}