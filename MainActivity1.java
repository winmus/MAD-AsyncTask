package com.praktikum.AsyncTaskLoader;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;

public class MainActivity1 extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<String> {

    private String queryString;

    @NonNull
    @Override
    public Loader onCreateLoader( int id, @Nullable Bundle args ) {
        String queryString = "";


        if (args != null) {
            queryString = args.getString ( "queryString" );
        }

        if(getSupportLoaderManager().getLoader(0)!=null){
            getSupportLoaderManager().initLoader(0,null,this);
        }

        return new BookLoader ( this, queryString );
    }

    @Override
    public void onLoadFinished( @NonNull Loader<String> loader, String data ) {

    }

    @Override
    public void onLoaderReset( @NonNull Loader<String> loader ) {

        Bundle queryBundle = new Bundle();
        queryBundle.putString("queryString", queryString);
        getSupportLoaderManager().restartLoader(0, queryBundle, this);



    }


}






