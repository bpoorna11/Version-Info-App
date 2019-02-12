package com.balakrishnan.poorna.buttontoast;

import android.graphics.drawable.Drawable;

public class Contacts {
    Drawable id;
    String name;
    Contacts(){};
    Contacts(Drawable id,String name){
        this.id=id;
        this.name=name;
    }
    public Drawable getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
