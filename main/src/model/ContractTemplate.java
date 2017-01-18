package model;

import java.util.LinkedList;

/**
 * Created by jonas on 18.01.17.
 */
public class ContractTemplate {
    protected String title;
    protected LinkedList sections;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LinkedList getSections() {
        return sections;
    }

    public void setSections(LinkedList sections) {
        this.sections = sections;
    }

}
