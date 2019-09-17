package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class TestLibraryJavaClass {

    //Käytin tätä apuna: https://www.youtube.com/watch?v=obO-gxev4HA
    public void doToast(Context ctx, String str){
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }
    
    public void shortToast(String str){
        Context ctx = null;
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }

}
