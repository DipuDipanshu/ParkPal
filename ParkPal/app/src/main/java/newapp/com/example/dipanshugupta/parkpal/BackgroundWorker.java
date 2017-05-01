package newapp.com.example.dipanshugupta.parkpal;

import android.app.AlertDialog;
import android.content.Context;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Dipanshu Gupta on 4/23/2017.
 */

public class BackgroundWorker extends AsyncTask<String,Void,String> {
    Context context;
    AlertDialog alertDialog;

    BackgroundWorker(Context ctx) {
        context = ctx;
    }

    @Override
    protected String doInBackground(String... params) {
        //String response="";
        String type = params[0];
        //String login_url = "http://192.168.1.6/login.php";
        String data_url = "http://192.168.1.6/data.php";
        if (type.equals("Done")) {
            try {
                URL url = new URL(data_url);
                //URL url = "http://localhost/phpmyadmin/data.php";
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");

                String line;
                String response="";
                StringBuilder sb = new StringBuilder();
                BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                    response = sb.toString();
                }
                br.close();
                return response;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }
    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("ParkPal");
    }

    @Override
    protected void onPostExecute(String response) {
        alertDialog.setMessage(response);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }
}/*

            //String number = params[1];
                /*
                URL url = new URL(data_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                //BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                //String post_data = URLEncoder.encode("number", "UTF-8") + "=" + URLEncoder.encode(number, "UTF-8");
                //bufferedWriter.write(post_data);
                //bufferedWriter.flush();
                //bufferedWriter.close();
                outputStream.close();
                //InputStream inputStream = httpURLConnection.getInputStream();
                //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "iso-8859-1"));
                //String result = "";
                //String line = "";
                //while ((line = bufferedReader.readLine()) != null) {
                 //   result += line;
                //}
                //bufferedReader.close();
                //inputStream.close();
                httpURLConnection.disconnect();
                //return result;*/
            //} catch (MalformedURLException e) {
               // e.printStackTrace();
            //} catch (IOException e) {
                //e.printStackTrace();


//        }
//        return null;
 //   }
/*
    @Override
    protected void onPreExecute() {
        alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle("ParkPal");
    }

    @Override
    protected void onPostExecute(String result) {
        alertDialog.setMessage(result);
        alertDialog.show();
    }

    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

}*/