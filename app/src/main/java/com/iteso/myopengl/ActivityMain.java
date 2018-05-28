package com.iteso.myopengl;

import android.opengl.GLSurfaceView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMain extends AppCompatActivity {

    private GLSurfaceView mGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);

    }
}
