package com.praktikum.AsyncTaskLoader;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;
import com.praktikum.asynctask.NetworkUtils;

public class BookLoader extends AsyncTaskLoader<String> {

    @Nullable
    @Override
    public String loadInBackground() {
        return null;
    }

    public BookLoader(@NonNull Context context) {
        super(context);
    }

    @Override
    protected void onStartLoading() {
        super.onStartLoading();
    }

    private String mQueryString;

    BookLoader(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

}