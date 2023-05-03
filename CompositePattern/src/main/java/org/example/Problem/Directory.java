package org.example.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Directory {

    String DirectoryName;
    List<Object> objects;

    public Directory(String name){
        this.DirectoryName = name;
        objects = new ArrayList<>();
    }

    public void add(Object obj){
        objects.add(obj);
    }

    public void ls(){

        for (Object obj:objects){
            if (obj instanceof File) {
                ((File) obj).ls();
            }else if (obj instanceof Directory) {
                ((Directory)obj).ls();
            }
        }

    }

}
