package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class TestLibraryJavaClass {

    public void doToast(Context ctx, String str){
        Toast.makeText(ctx, str, Toast.LENGTH_SHORT).show();
    }

}
