package com.example.servllo.backend;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HttpCommunication {
    public class PostAsync extends AsyncTask<String, String, String> {
        private RequestBody requestBody;

        public PostAsync(RequestBody requestBody) {
            super();
            this.requestBody = requestBody;
        }

        @Override
        protected String doInBackground(String... params) {
            OkHttpClient okHttpClient = new OkHttpClient();
            String credential = Credentials.basic(params[1], params[2]);
            Request request = new Request.Builder()
                    .url( params[0])
                    .addHeader("Authorization", credential)
                    .post(requestBody)
                    .build();
            try {
                Response response = okHttpClient.newCall(request).execute();
                return response.body().string();
            } catch (IOException e) {
                Log.e("", e.getMessage());
                return "error";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            Log.i(this.getClass().getSimpleName(), s);
            super.onPostExecute(s);
        }


    }

    public static class GetAsyncTask extends AsyncTask<String, String, String> {


        @Override
        protected String doInBackground(String... params) {
            OkHttpClient okHttpClient = new OkHttpClient();
            String credential = Credentials.basic(params[1], params[2]);
            Request request = new Request.Builder()
                    .url( params[0])
                    .addHeader("Authorization", credential)
                    .build();
            try {
                Response response = okHttpClient.newCall(request).execute();
                return response.body().string();
            } catch (IOException e) {
                Log.e("", e.getMessage());
                return "error";
            }
        }

        @Override
        protected void onPostExecute(String s) {
            Log.i(this.getClass().getSimpleName(), s);
            super.onPostExecute(s);
        }


    }
}
