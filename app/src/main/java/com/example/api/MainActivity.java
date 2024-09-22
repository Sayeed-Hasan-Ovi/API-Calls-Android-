package com.example.api;


/*import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public class MainActivity extends AppCompatActivity {

    interface RequestUser{
        @GET("/api/users/{uid}")
        Call<UserData> getUser(@Path("uid") String uid);
    }

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        RequestUser requestUser = retrofit.create(RequestUser.class);

//        requestUser.postUser(new RequestPost("pawan", "programmer")).enqueue(new Callback<ResponsePost>() {
//            @Override
//            public void onResponse(Call<ResponsePost> call, Response<ResponsePost> response) {
//                textView.setText(response.body().name);
//            }
//
//            @Override
//            public void onFailure(Call<ResponsePost> call, Throwable t) {
//                textView.setText(t.getMessage());
//            }
//        });

        requestUser.getUser("3").enqueue(new Callback<UserData>() {
            @Override
            public void onResponse(Call<UserData> call, Response<UserData> response) {
                textView.setText(response.body().data.first_name);
            }

            @Override
            public void onFailure(Call<UserData> call, Throwable t) {
                textView.setText(t.getMessage());
            }
        });

    }
}*/

/*
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public class MainActivity extends AppCompatActivity {

    interface ApiService {
        @Headers("X-Api-Key: goU4qMwcmWALwh8b6xX3tA==rNlz3IzjvGKHB2f4")
        @GET("v1/inflation")
        Call<List<CPIData>> getCPIData();
    }

    private RecyclerView recyclerView;
    private CPIDataAdapter adapter;
    private List<CPIData> tableDataList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        adapter = new CPIDataAdapter(tableDataList);
        recyclerView.setAdapter(adapter);

        // Add logging interceptor
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.api-ninjas.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        apiService.getCPIData().enqueue(new Callback<List<CPIData>>() {
            @Override
            public void onResponse(Call<List<CPIData>> call, Response<List<CPIData>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Print full response
                    System.out.println("Response Code: " + response.code());
                    System.out.println("Response Headers: " + response.headers());
                    System.out.println("Response Body: " + response.body());

                    tableDataList.addAll(response.body());
                    adapter.notifyDataSetChanged();
                } else {
                    Log.e("API Error", "Response not successful: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<CPIData>> call, Throwable t) {
                Log.e("API Error", "Network request failed", t);
            }
        });
    }
}*/

import android.os.Bundle;
import android.util.Log;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.List;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public class MainActivity extends AppCompatActivity {

    interface ApiService {
        @Headers("X-Api-Key: goU4qMwcmWALwh8b6xX3tA==rNlz3IzjvGKHB2f4")
        @GET("v1/inflation")
        Call<List<CPIData>> getCPIData();
    }

    private TableLayout tableLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tableLayout = findViewById(R.id.tableLayout);

        // Add logging interceptor
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.api-ninjas.com/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);

        apiService.getCPIData().enqueue(new Callback<List<CPIData>>() {
            @Override
            public void onResponse(Call<List<CPIData>> call, Response<List<CPIData>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Print full response
                    System.out.println("Response Code: " + response.code());
                    System.out.println("Response Headers: " + response.headers());
                    System.out.println("Response Body: " + response.body());

                    for (CPIData data : response.body()) {
                        addTableRow(data);
                    }
                } else {
                    Log.e("API Error", "Response not successful: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<CPIData>> call, Throwable t) {
                Log.e("API Error", "Network request failed", t);
            }
        });
    }

    private void addTableRow(CPIData data) {
        TableRow tableRow = new TableRow(this);

        TextView countryTextView = new TextView(this);
        countryTextView.setText(data.getCountry());
        countryTextView.setPadding(8, 8, 8, 8);
        tableRow.addView(countryTextView);

        TextView typeTextView = new TextView(this);
        typeTextView.setText(data.getType());
        typeTextView.setPadding(8, 8, 8, 8);
        tableRow.addView(typeTextView);

        TextView periodTextView = new TextView(this);
        periodTextView.setText(data.getPeriod());
        periodTextView.setPadding(8, 8, 8, 8);
        tableRow.addView(periodTextView);

        TextView monthlyRateTextView = new TextView(this);
        monthlyRateTextView.setText(String.valueOf(data.getMonthly_rate_pct()));
        monthlyRateTextView.setPadding(8, 8, 8, 8);
        tableRow.addView(monthlyRateTextView);

        TextView yearlyRateTextView = new TextView(this);
        yearlyRateTextView.setText(String.valueOf(data.getYearly_rate_pct()));
        yearlyRateTextView.setPadding(8, 8, 8, 8);
        tableRow.addView(yearlyRateTextView);

        tableLayout.addView(tableRow);
    }
}