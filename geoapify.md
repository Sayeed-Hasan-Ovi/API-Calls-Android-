Sayeed-Hasan-Ovi: 


### Updated Code
```java

    String apiKey = "599464d94be84c0296fe3edc809c01ca";
    String url = "https://api.geoapify.com/v2/
    place-details?lat=23.756080876788374&   lon=90.36752478086112&features=radius_500,radius_500.atm&apiKey="       + apiKey;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize OkHttpClient and Gson instances
        client = new OkHttpClient();
        gson = new Gson();

        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Log.e(TAG, "Request Failed", e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    String responseData = response.body().string();
                    JsonObject jsonObject = gson.fromJson(responseData, JsonObject.class);
                    Log.d(TAG, "Response: " + jsonObject.toString());
                } else {
                    Log.e(TAG, "Request Failed: " + response.code());
                }
            }
        });

```

### Setting the Environment Variable
In your terminal, set the environment variable before running your application:
```sh
export GEOAPIFY_API_KEY=599464d94be84c0296fe3edc809c01ca
```